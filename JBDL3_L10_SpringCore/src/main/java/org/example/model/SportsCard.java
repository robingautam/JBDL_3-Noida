package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class SportsCard extends Car{

    String powerEngine;

    List<String> features = new ArrayList<>();

    public String getPowerEngine() {
        return powerEngine;
    }

    public void setPowerEngine(String powerEngine) {
        this.powerEngine = powerEngine;
    }

    public List<String> getFeatures() {
        return features;
    }

    public void setFeatures(List<String> features) {
        this.features = features;
    }

    @Override
    public String toString() {
        return "SportsCard{" +
                "powerEngine='" + powerEngine + '\'' +
                ", features=" + features +
                ", name='" + name + '\'' +
                '}';
    }
}
