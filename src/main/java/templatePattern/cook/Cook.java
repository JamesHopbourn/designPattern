package templatePattern.cook;

public abstract class Cook {
    public void on(){
        System.out.println("打开抽油烟机");
    }

    public void fire(){
        System.out.println("生火");
    }

    public abstract void doCook();

    public void shutdown(){
        System.out.println("关火");
    }

    public void off(){
        System.out.println("关闭抽油烟机");
    }

    public final void cook(){
        this.on();
        this.fire();
        this.doCook();
        this.shutdown();
        this.off();
    }
}
