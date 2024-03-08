public class RedHeadDuck extends Duck{
    public RedHeadDuck(){
        quackBehaviour=new Quack();
        flyBehaviour= new FlyWithWings();
        swimBehaviour= new Swim();
    }

    void display(){
        System.out.println("This is Red Head Duck....");
    }
}
