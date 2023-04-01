package Book3.Task2;

@BaseAction (
        level = 2,
        sqlRequest = "SELECT * FROM phonebook"
)

public class Book {

    @SuppressWarnings(
            {})
    public void doAction() {
        Class<Book> f = Book.class;
        BaseAction a = (BaseAction)f.getAnnotation(BaseAction.class);
      //  System.out.println(a.level());
        System.out.println(a.sqlRequest());
    }
}
