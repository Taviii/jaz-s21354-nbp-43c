package pl.pjatk.jazs2135443cnbp.model;

import java.io.IOException;

public enum Table {
    A;

    public String toValue() {
        switch (this) {
            case A: return "A";
        }
        return null;
    }

    public static Table forValue(String value) throws IOException {
        if (value.equals("A")) return A;
        throw new IOException("Cannot deserialize Table");
    }
}