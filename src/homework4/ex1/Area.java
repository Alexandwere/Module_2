package homework4.ex1;

public enum Area {
    MOSCOW(799), SPB(178);
    final int area;

    Area(int area) {
        this.area = area;
    }

    public int getArea() {
        return area;
    }
}
