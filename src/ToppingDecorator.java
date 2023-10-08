public class ToppingDecorator implements ITopping {
    protected ITopping topping;

    public ToppingDecorator(ITopping c) {
        this.topping = c;
    }
    @Override
    public void addTopping() {
        this.topping.addTopping();
    }
}


