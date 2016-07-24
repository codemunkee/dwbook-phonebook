package dwbook.phonebook;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import org.hibernate.validator.constraints.NotEmpty;
import javax.validation.constraints.Max;

public class PhonebookConfiguration extends Configuration {
    @JsonProperty
    @NotEmpty
    private String message;

    @JsonProperty
    @Max(10)
    private int messageRepetitions;

    @JsonProperty
    private String additionalMessage = "This is optional";

    @JsonProperty
    private String name;

    public String getAdditionalMessage() {
        return additionalMessage;
    }

    public String getMessage() {
        return message;
    }
    public String getName() { return this.name; }

    public int getMessageRepetitions() {
        return messageRepetitions;
    }
}
