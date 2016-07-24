package dwbook.phonebook;

import dwbook.phonebook.resources.ContactResource;
import io.dropwizard.setup.Bootstrap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class App extends Application<PhonebookConfiguration> {
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    @Override
    public void initialize(Bootstrap<PhonebookConfiguration> b) {}

    @Override
    public void run(PhonebookConfiguration c, Environment e) throws Exception {
        System.out.println("Hi " + c.getName());
        LOGGER.info("Method App#run() called");
        for (int i=0; i < c.getMessageRepetitions(); i++) {
            System.out.println(c.getMessage());
        }
        System.out.println(c.getAdditionalMessage());

        e.jersey().register(new ContactResource());
    }

    public static void main(String[] args) throws Exception {
        new App().run(args);
    }


}
