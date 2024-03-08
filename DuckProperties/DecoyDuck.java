public class DecoyDuck extends Duck{
    public DecoyDuck(){
        flyBehaviour=new FlyNoWay();
        quackBehaviour=new Squeak();
        swimBehaviour=new NoSwim();
    }

    void display(){
        System.out.println("\nThis is Decoy Duck...");
    }
}
