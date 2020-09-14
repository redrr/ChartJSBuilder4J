package elements;

import java.util.Objects;

public class Color {

    private Integer r, g, b;
    private Double a;

    public Color() {
    }

    public Color(Integer r, Integer g, Integer b, Double a) {
        this.r = r;
        this.g = g;
        this.b = b;
        this.a = a;
    }

    public Color setR(int r) {
        this.r = r;
        return this;
    }

    public Color setG(int g) {
        this.g = g;
        return this;
    }

    public Color setB(int b) {
        this.b = b;
        return this;
    }

    public Color setA(double a) {
        this.a = a;
        return this;
    }

    public String getRGBA() {
        if (Objects.nonNull(this.r) && Objects.nonNull(this.g) && Objects.nonNull(this.b) && Objects.nonNull(this.a)) {
            return "rgba("+this.r+","+this.g+","+this.b+","+this.a+")";
        }
        return null;
    }
}
