package homework3.ex4;

public class Animal {
    private double bodyLength;
    private double tailLength;

    public Animal(double bodyLength, double tailLength) {
        this.bodyLength = bodyLength;
        this.tailLength = tailLength;
    }

    public double getBodyLength() {
        return bodyLength;
    }

    public double getTailLength() {
        return tailLength;
    }
}
