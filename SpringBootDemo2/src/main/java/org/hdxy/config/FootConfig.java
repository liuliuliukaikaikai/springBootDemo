package org.hdxy.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import java.util.Arrays;

@ConfigurationProperties(prefix = "foot")
public class FootConfig {
    private String rice;
    private String meat;
    private String[] sauce;

    public String getRice() {
        return rice;
    }

    public void setRice(String rice) {
        this.rice = rice;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String[] getSauce() {
        return sauce;
    }

    @Override
    public String toString() {
        return "FootConfig{" +
                "rice='" + rice + '\'' +
                ", meat='" + meat + '\'' +
                ", sauce=" + Arrays.toString(sauce) +
                '}';
    }

    public void setSauce(String[] sauce) {
        this.sauce = sauce;
    }

}
