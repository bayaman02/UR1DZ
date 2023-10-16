public class Mercedes extends Jeep {

    public Mercedes(double engine, int year, ColorCar colorCar, Fabrica fabrica) {
        super(engine, year, colorCar, fabrica);
    }

   public final void beep() {
        System.out.println("BEEEP BEEEP");
    }

    public void beep(String voice) {
        System.out.println(voice);
    }



    @Override
    public String getInfo() {
        return super.getInfo();
    }

}