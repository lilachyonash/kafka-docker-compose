package lilachyonash.kafkadockercomppose.data;

import com.fasterxml.jackson.annotation.JsonProperty;

public record PracticalAdvice(@JsonProperty("message") String message,
                              @JsonProperty("identifier") int identifier) {

}
