package org.ibm.resource.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.*;
import java.util.List;
import java.util.Locale;

@Path("/negotiation")
public class ContentNegotiationResource {

    @GET
    @Path("/lang")
    public Response getLanguage(@Context Request request){
        List<Variant> variants = Variant.VariantListBuilder
                .newInstance()
                .languages(Locale.ENGLISH, Locale.GERMAN)
                .build();
        //read request information
        Variant variant = request.selectVariant(variants);
        if (variant == null) {
            return Response.notAcceptable(variants).build();
        }

        String language = variant.getLanguageString();
        return Response.ok(language)
                .header(HttpHeaders.CONTENT_LANGUAGE, language)
                .build();
    }
}
