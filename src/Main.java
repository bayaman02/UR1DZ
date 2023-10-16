public class Main {
    public static void main(String[] args) {
        Fabrica fabrica = new Fabrica("Mercedes X");
        Mercedes mercedes = new Mercedes(2.5, 2010, ColorCar.BLACK, fabrica);
        System.out.println(mercedes.getInfo());
        mercedes.beep();
        mercedes.beep("БАРХАТНАЯ ТЯГА");
        System.out.println();

        Fabrica fabrica1 = new Fabrica("Ticolend");
        Tico tico = new Tico(1.5, 2000, ColorCar.RED, fabrica1);
        System.out.println(tico.getInfo());
        tico.beep();
        tico.beep("шкибиди доп");
        System.out.println();

        Tico tico1 = new Tico(1.7, 2007, ColorCar.BLACK, fabrica1);
        System.out.println(tico1.getInfo());
        tico1.beep();
        tico1.beep("бип бап");




    }

}