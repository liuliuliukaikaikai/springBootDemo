package org.hdxy;

import org.hdxy.pojo.Guest;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

public class TestClass {
    public static void main(String[] args) {
        Guest guest = new Guest("","角色");
        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        Set<ConstraintViolation<Guest>> validate = validator.validate(guest);
        for (ConstraintViolation<Guest> vl : validate){
            System.out.println(vl.getMessage()+"------"+vl.getPropertyPath());
        }
    }
}
