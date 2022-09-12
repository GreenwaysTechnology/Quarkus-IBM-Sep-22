package com.ibm.quarkus.config;

import org.eclipse.microprofile.config.ConfigProvider;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {

    //Read config Property
    @ConfigProperty(name = "greeting.name", defaultValue = "Foo")
    String name;
    @ConfigProperty(name = "greeting.message", defaultValue = "Greet")
    String message;

    @ConfigProperty(name = "application.host")
    String host;

    public String getWhen() {
        // return ConfigProvider.getConfig().getValue("greeting.when", String.class);
        return ConfigProvider.getConfig().getOptionalValue("greeting.when", String.class).orElse("defaultVAlue");
    }

    public String sayHello() {
        return message + name + " " + getWhen();
    }

    public String getEnv() {
        return host;
    }
}
