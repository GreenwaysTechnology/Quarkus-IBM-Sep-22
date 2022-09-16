import org.eclipse.microprofile.faulttolerance.Fallback;
import org.eclipse.microprofile.faulttolerance.Retry;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

@Path("/retry")
public class RetryResource {
    private AtomicLong counter = new AtomicLong(0);
    private Float failRatio = 0.5f;

    @GET
    @Retry(maxRetries = 1, retryOn = RuntimeException.class)
    @Fallback(fallbackMethod = "fallbakcoffeesList")
    public List<String> coffees() {
        final Long invocationNumber = counter.getAndIncrement();
        maybeFail(String.format("CoffeeResource#coffees() invocation #%d failed", invocationNumber));
        System.out.println("RetryResource#coffees() invocation #%d returning successfully" + invocationNumber);
        return List.of("Coffee With Sugar", "Coffee Without Sugar", "Black Coffee");
    }

    public List<String> fallbakcoffeesList() {
        System.out.println("Fallback");
        return new ArrayList<>();
    }

    private void maybeFail(String failureLogMessage) {
        // introduce some artificial failures
        if (new Random().nextFloat() < failRatio) {
            System.out.println(failureLogMessage);
            throw new RuntimeException("Resource failure.");
        }
        //throw new RuntimeException("Resource failure.");
    }
}
