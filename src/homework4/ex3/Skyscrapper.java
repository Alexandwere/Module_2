package homework4.ex3;

public class Skyscrapper{
    private String name;
    private int height;

    public Skyscrapper(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return name + " - " + height + 'м';
    }

    public int compareTo(Skyscrapper o) {
        return (int) (this.height - o.height);
    }

    public String getName() {
        return name;
    }
}
