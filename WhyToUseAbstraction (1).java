package Abstraction;

//when we create an abstract method, do we provide method implementation?   => No
//whole purpose of abstract method is that, child class should provide implementation for abstract method
abstract class Eat{
    abstract void eat();    //
    //what is essential
    //did i mentioned how should i eat my food?
}

class IndianWayOfEating extends Eat{
    @Override
    void eat() {
        System.out.println("Indian people eat using Hand");
        System.out.println("Indian people sit on ground while eating");
        //we are specifying how should we eat here.
    }
}

class WesternWayOfEating extends Eat{
    @Override
    void eat() {
        System.out.println("Western people use forks and spoons for eating.");
        System.out.println("Western people sit on dinning table while eating");
    }
}


public class WhyToUseAbstraction {
    public static void main(String[] args) {
        IndianWayOfEating indianWayOfEating = new IndianWayOfEating();
        indianWayOfEating.eat();

        /*WesternWayOfEating westernWayOfEating = new WesternWayOfEating();
        westernWayOfEating.eat();*/
    }
}
