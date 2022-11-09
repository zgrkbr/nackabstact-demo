package animals;

public abstract class Animal {

    protected int numOfEyes;

    protected int caloriesToGetFull;

    protected int calories;

    protected Animal(int caloriesToGetFull){
        this.caloriesToGetFull = caloriesToGetFull;
    }

    abstract protected void eat();
}
