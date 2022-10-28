package org.augustoren.application.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@Builder
public class UserRequestDto {

    @JsonProperty("name")
    String name;

    @JsonProperty("email")
    String email;

}
