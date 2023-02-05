package strategyPattern;

import strategyPattern.CalcService.Calc;
import strategyPattern.CalcService.CalcImpl.*;

public class App {
    public static void main(String[] args) {
        char[] operation = new char[]{'+','-','*','/','%'};

        Calc calc = new Calc();
        for (char c : operation) {
            switch (c) {
                case '+' -> calc.setCalc(new Add());
                case '-' -> calc.setCalc(new Sub());
                case '*' -> calc.setCalc(new Mul());
                case '/' -> calc.setCalc(new Div());
                case '%' -> calc.setCalc(new Mod());                                               
            }
            System.out.println(calc.doCalc(4, 2));
        }
    }
}
