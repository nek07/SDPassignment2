public class ChocolateTopping extends  ToppingDecorator{
    public ChocolateTopping(ITopping c) {
        super(c);
    }

    public void addTopping() {
        super.addTopping();
        System.out.println("add chocolate topping");
    }
}

