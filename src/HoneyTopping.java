import java.util.Date;

public class HoneyTopping extends ToppingDecorator {
    public HoneyTopping(ITopping c) {
        super(c);
    }
    public void addTopping() {
        super.addTopping();
        System.out.println("add honey topping");
    }
}
