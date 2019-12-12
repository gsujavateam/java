package by.gsu.pms;

public class Calculate implements Task {

    private int max;

    public Calculate(int max) {
        this.max = max;
    }

    @Override
    public double calculate() {
        double result = 1;
        for (int i = 1; i <= max; i ++) {
            if(i%2 == 1){
                result = result*i;
            }
        }
        return result;
    }
}