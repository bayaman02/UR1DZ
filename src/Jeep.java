public class Jeep {
    private double engine;
    private int year;
    private ColorCar colorCar;
    private Fabrica fabrica;

    public Jeep(double engine, int year, ColorCar colorCar, Fabrica fabrica) {
        this.engine = engine;
        this.year = year;
        this.colorCar = colorCar;
        this.fabrica = fabrica;
    }

    public double getEngine() {
        return engine;
    }

    public int getYear() {
        return year;
    }

    public ColorCar getColorCar() {
        return colorCar;
    }


    public String getInfo(){
return "ENGINE: " + engine +
        "\nYEAR: " + year +
        "\nCOLOR: " + colorCar +
        "\nFABRICA: " + fabrica.getName();

    }
}
