package factoryPattern;

public class Shop {
    public static void main(String[] args) {
        ComputerFactory factory = new ComputerFactory();
        Computer a = factory.createComputer("A");
        Computer b = factory.createComputer("B");
        System.out.println(a.model());
        System.out.println(b.model());
    }
}
