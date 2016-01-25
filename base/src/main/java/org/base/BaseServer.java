package org.base;

import io.dropwizard.Application;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class BaseServer extends Application<ServerConfig> {

    public void initialize(Bootstrap<ServerConfig> bootstrap) {
        bootstrap.addBundle(new AssetsBundle("/assets", "/", "index.html"));
    }

    @Override
    public void run(ServerConfig configuration, Environment environment) throws Exception {
        BaseResource resource = new BaseResource();
        environment.jersey().register(resource);
    }

    public static void main(String[] args) throws Exception {
        new BaseServer().run(args);
    }

}
