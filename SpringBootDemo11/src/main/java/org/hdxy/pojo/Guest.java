package org.hdxy.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data @AllArgsConstructor @NoArgsConstructor
public class Guest {
    @NotBlank(message = "{guest.name.notnull}")
    private String name;
    private String role;


}
