public class MallarDuck extends Duck {


    public MallarDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyingWithSwing();
    }

    @Override
    public void display() {
        System.out.println("MallarDuck!");
    }

    public static void main(String[] args) {
        Duck duck = new MallarDuck();
        duck.swim();
        duck.performFly();
        duck.performQuack();
        duck.display();
    }
}
