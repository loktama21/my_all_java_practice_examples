package junit_examples;

public class Calculator {

    public double add(double a, double b){
        return a + b;
    }

    public double squareRoot(double a){
        if(a < 0) {
            throw  new IllegalArgumentException("Invalid number: " + a);
        }
        return Math.sqrt(a);
    }
}
