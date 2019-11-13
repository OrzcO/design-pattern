package factory;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square : " + this.getClass().getSimpleName() + " is drawing");
    }
}
