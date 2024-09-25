package homework4.ex1;

public enum Region {
    MOSCOW(799), SPB(178);
    final int region;

    Region(int region) {
        this.region = region;
    }

    public int getRegion() {
        return region;
    }
}
