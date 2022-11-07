package generics_example_lok;

public class SalaryEmployee extends Employee{

    private double salary = 25000.00;


    @Override
    public void mySalary(){
        System.out.println("Salary: " + salary);
    }

}
