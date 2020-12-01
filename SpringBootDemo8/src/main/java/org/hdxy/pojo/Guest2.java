package org.hdxy.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Guest2 implements Serializable {
 private  int id;
 private String name;
 private String role;
}
