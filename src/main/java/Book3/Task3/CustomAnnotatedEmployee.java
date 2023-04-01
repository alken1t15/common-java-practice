package Book3.Task3;

import java.lang.reflect.Method;

@Company(
         name = "ngt",
         city = "uyt"
)
public class CustomAnnotatedEmployee {
    private int id;
    private String name;

    public CustomAnnotatedEmployee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void getEmployeeDetails(){
        System.out.println("Employee Id: " + id);
        System.out.println("Employee Name: " + name);
    }
    @Command(
            name = "Никита",
            weight = "75",
            age = "43"
    )
    public void infoPeople(){
        for (Method m : this.getClass().getDeclaredMethods())
        {
            if (m.isAnnotationPresent(Command.class)) {
                Command com = m.getAnnotation(Command.class);
                System.out.println(com.age());
                System.out.println(com.name());
                System.out.println(com.weight());
            }
    }}
}

