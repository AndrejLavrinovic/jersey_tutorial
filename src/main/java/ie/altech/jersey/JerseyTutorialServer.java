package ie.altech.jersey;

import com.hubspot.dropwizard.guice.GuiceBundle;
import ie.altech.jersey.configuration.ServerConfiguration;
import ie.altech.jersey.module.ServerModule;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class JerseyTutorialServer extends Application<ServerConfiguration> {

    @Override
    public void initialize(Bootstrap<ServerConfiguration> bootstrap){
        GuiceBundle<ServerConfiguration> guiceBundle = GuiceBundle.<ServerConfiguration>newBuilder()
                .addModule(new ServerModule())
                .setConfigClass(ServerConfiguration.class)
                .enableAutoConfig(getClass().getPackage().getName())
                .build();
        bootstrap.addBundle(guiceBundle);
    }

    @Override
    public void run(ServerConfiguration serverConfiguration, Environment environment) throws Exception{

    }

    public static void main(String[] args) throws Exception{
        new JerseyTutorialServer().run(args);
    }
}
