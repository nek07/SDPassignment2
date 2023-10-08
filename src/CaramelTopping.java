public class CaramelTopping extends ToppingDecorator{
    public CaramelTopping(ITopping c) {
        super(c);
    }

    public void addTopping() {
        super.addTopping();
        System.out.println("add caramel topping");
    }
}
