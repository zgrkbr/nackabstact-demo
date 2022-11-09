package animals;

public abstract class Fish extends Animal implements Aquatic{

    protected int numOfGills;

    protected Fish(int caloriesToGetFull, int numOfGills) {
        super(caloriesToGetFull);
        this.numOfGills = numOfGills;

    }
}
