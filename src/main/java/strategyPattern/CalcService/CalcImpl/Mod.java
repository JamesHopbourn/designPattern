package strategyPattern.CalcService.CalcImpl;

import strategyPattern.CalcService.Operation;

public class Mod implements Operation {
    @Override
    public int doCalc(int num1, int num2) {
        return num1 % num2;
    }
}
