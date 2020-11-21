package org.hdxy;

import org.jasypt.util.text.BasicTextEncryptor;

public class Test {
    public static void main(String[] args) {
        BasicTextEncryptor encryptor = new BasicTextEncryptor();
        encryptor.setPassword("123456@!#");
        String jiami = encryptor.encrypt("123456");
        System.out.println(jiami);
    }
}
