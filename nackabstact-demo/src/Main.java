import animals.TigerCar;
import garage.Vehicle;

public class Main {
    public static void main(String[] args) {

        Vehicle tigerCar = new TigerCar("Vit", 128);

        System.out.println(tigerCar.getClass());

    }
}