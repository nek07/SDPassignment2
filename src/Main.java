public class Main {
    public static void main(String[] args) {
    ITopping multiTopping = new CaramelTopping(new ChocolateTopping(new HoneyTopping(new BasicTopping())));
    multiTopping.addTopping();
        System.out.println();
    ITopping chocoCaramelTopping = new ChocolateTopping(new CaramelTopping(new BasicTopping()));
    chocoCaramelTopping.addTopping();
        System.out.println();
    ITopping honeyTopping = new HoneyTopping(new BasicTopping());
    honeyTopping.addTopping();

    }
}