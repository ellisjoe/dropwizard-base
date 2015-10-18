package org.base;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class BaseServer extends Application<ServerConfig> {

    public static void main(String[] args) throws Exception {
        new BaseServer().run(args);
    }

    @Override
    public void run(ServerConfig configuration, Environment environment) throws Exception {
        BaseResource resource = new BaseResource();
        environment.jersey().register(resource);
    }

}
