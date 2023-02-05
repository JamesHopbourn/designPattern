package proxyPattern;

public class Test {
    public static void main(String[] args) {
        House house = new James();
        HouseProxy houseProxy = new HouseProxy(house);
        houseProxy.findHouse();
    }
}
