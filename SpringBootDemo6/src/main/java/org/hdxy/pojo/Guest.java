package org.hdxy.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 嘉宾实体类
 */
@Data @AllArgsConstructor
public class Guest {
    private String name;
    private String role;
}
