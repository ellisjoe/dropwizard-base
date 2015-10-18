package com.joe.hello;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class HelloWorld extends Application<ServerConfig> {

    public static void main(String[] args) throws Exception {
        new HelloWorld().run(args);
    }

    @Override
    public void run(ServerConfig configuration, Environment environment) throws Exception {
        HelloResource resource = new HelloResource();
        environment.jersey().register(resource);
    }

}
