package factoryPattern;

public class ComputerFactory {
    public Computer createComputer(String name){
        Computer computer = null;
        switch (name) {
            case "A" -> computer = new ComputerA();
            case "B" -> computer = new ComputerB();
        }
        return computer;
    }
}
