package Book3.Task3;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {

        CustomAnnotatedEmployee employee = new CustomAnnotatedEmployee(1, "John Doe");
        employee.infoPeople();

        Annotation companyAnnotation = employee
                .getClass()
                .getAnnotation(Company.class);
        Company company = (Company) companyAnnotation;

        // System.out.println("Company Name: " + company.name());
        //   System.out.println("Company City: " + company.city());

        //  Annotation companyAnnotation = employee.getClass().getAnnotation(Command.class);
        //  Command companye = (Command)companyAnnotation;
        //  System.out.println(companye.weight());*/
    }
}