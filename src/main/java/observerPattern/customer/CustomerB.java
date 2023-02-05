package observerPattern.customer;

public class CustomerB extends Customer{
    @Override
    public void update() {
        System.out.println("用户 B 已收到报纸");
    }
}
