package animals;

import garage.Vehicle;

//ligger INTE i samma paket som Vehicle
public class TigerCar extends Vehicle {

    private int numberOfStripes;

    public TigerCar(String color, int numberOfStripes) {
        super(color);
        this.numberOfStripes = numberOfStripes;
    }
}
