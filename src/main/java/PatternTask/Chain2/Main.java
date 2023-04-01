package PatternTask.Chain2;

public class Main {
    public static void main(String[] args) {
        NoteModule note5000 = new NoteModule5000();
        NoteModule note1000 = new NoteModule1000();
        NoteModule note500 = new NoteModule500();
        NoteModule note100 = new NoteModule100();
        note5000.setNextMoneyModule(note1000);
        note1000.setNextMoneyModule(note500);
        note500.setNextMoneyModule(note100);

        note5000.takeMoney(new Money(197_900));
    }
}
