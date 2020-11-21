package org.hdxy.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@ConfigurationProperties(prefix = "foot")
public class FootConfig {
    private String rice;
    private String meat;

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

    @Override
    public String toString() {
        return "FootConfig{" +
                "rice='" + rice + '\'' +
                ", meat='" + meat + '\'' +
                '}';
    }
}
