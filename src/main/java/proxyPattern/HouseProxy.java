package proxyPattern;

public class HouseProxy implements House{
    private House house;

    public HouseProxy(House house) {
        this.house = house;
    }

    @Override
    public void findHouse() {
        // 日志记录
        System.out.println("找了一个代理");
        // 下面是业务代码
        house.findHouse();
    }
}
