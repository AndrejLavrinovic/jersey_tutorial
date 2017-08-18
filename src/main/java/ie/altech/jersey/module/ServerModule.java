package ie.altech.jersey.module;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.Provides;
import com.google.inject.name.Named;
import ie.altech.jersey.configuration.ServerConfiguration;

public class ServerModule implements Module {

    @Override
    public void configure(Binder binder){

    }

    @Provides
    @Named("message")
    public String provideMessage(ServerConfiguration serverConfiguration){
        return serverConfiguration.getMessage();
    }
}
