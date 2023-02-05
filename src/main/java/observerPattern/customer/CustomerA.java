package observerPattern.customer;

public class CustomerA extends Customer{
    @Override
    public void update() {
        System.out.println("用户 A 已收到报纸");
    }
}
