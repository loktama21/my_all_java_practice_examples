package generics_example_lok;

public class HourlyEmployee extends Employee{

    private double rate = 23.50;
    private int hours = 8;

    public double getRate() {
        return rate;
    }

    public int getHours() {
        return hours;
    }

    @Override
    public void mySalary(){
        System.out.println("Hourly employee pay: " + rate * hours);
    }
}
