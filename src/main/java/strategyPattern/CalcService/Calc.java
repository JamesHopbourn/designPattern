package strategyPattern.CalcService;

import strategyPattern.CalcService.Operation;

public class Calc {
    private Operation calc;

    public Calc() {
    }

    public void setCalc(Operation calc) {
        this.calc = calc;
    }

    public int doCalc(int num1, int num2){
        return this.calc.doCalc(num1, num2);
    }
}
