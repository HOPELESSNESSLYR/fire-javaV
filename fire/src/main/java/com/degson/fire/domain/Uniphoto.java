package com.degson.fire.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Uniphoto {
//    @JsonProperty("recordId")
//    private Long recordId;
    @JsonProperty("fireId")
    private Long fireId;
    @JsonProperty("image")
    private String image;
}
