package templatePattern;

import templatePattern.cook.Cook;
import templatePattern.cook.CookTomato;
import templatePattern.cook.CookFish;

public class Chef {
    public static void main(String[] args) {
        Cook chef = new CookTomato();
        chef.cook();

        chef = new CookFish();
        chef.cook();
    }
}
