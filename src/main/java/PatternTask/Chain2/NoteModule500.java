package PatternTask.Chain2;

public class NoteModule500 extends NoteModule{
    @Override
    void takeMoney(Money money) {
        int countNote = money.getAmt()/Note.R500;
        int remind = money.getAmt()%Note.R500;
        if(countNote>0){
            System.out.println("Выдано " + countNote + " купюр номиналом " + Note.R500);
        }
        if(remind>0 && next!= null){
            next.takeMoney(new Money(remind));
        }
    }
}
