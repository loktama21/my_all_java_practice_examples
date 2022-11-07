package generics_example_lok;

public class GenericClass<T> {
    private T employee1;

    public GenericClass(T employee1) {
        this.employee1 = employee1;
    }

    public void showDetails(){
        System.out.println("Hourly employee weekly pay: " + employee1.getClass());
    }
}

