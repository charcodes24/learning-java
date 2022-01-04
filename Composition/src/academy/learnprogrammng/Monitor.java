package academy.learnprogrammng;

public class Monitor {

    private String model;
    private String manufacturer;
    private int size;
    private Resolution nativeResolution; //monitor HAS a resolution

    public Monitor(String model, String manufacturer, int size, Resolution navtiveResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = navtiveResolution;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawing pixel at " + x + "," + y + "in color " + color);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
