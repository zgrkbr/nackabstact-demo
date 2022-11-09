package garage;

public abstract class Vehicle {

    /*
    protected: klassen själv, alla klasser i samma paket och alla subklasser oavsett paket har tillgång till fältet
     */
    //color är ett field/fält, dvs. en egenskap
    protected String color;

    public Vehicle(String color){
        this.color = color;
    }

}
