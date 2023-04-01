package Book3.Task4;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Break {
    String name() default  "StandartBrake";
    int price() default  400000;
    String reiting() default  "4.4";
}
