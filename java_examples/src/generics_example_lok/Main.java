package generics_example_lok;

public class Main {
    public static void main(String[] args) {
        GenericClass<Employee> employeeGenericClass = new GenericClass<>(new Employee());
        employeeGenericClass.showDetails();
//        employeeTest.mySalary(); //How to call employee and its subclass methods?
    }
}
