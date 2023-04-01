package Book.Home8;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class SortMountains {
    LinkedList<Mountain> mtn = new LinkedList();
    class NameCompare implements Comparator<Mountain>{
        public int compare(Mountain one, Mountain two){
            return one.title.compareTo(two.title);
        }

    }
    class HeightCompare implements Comparator<Mountain>{

        @Override
        public int compare(Mountain one, Mountain two) {
            return two.bpm - one.bpm;
        }
    }

    public static void main(String[] args) {
        new SortMountains().go();
    }
    public void go(){
        mtn.add(new Mountain("Лонг-Рейдж", 14255));
        mtn.add(new Mountain("Эльберт", 14433));
        mtn.add(new Mountain("Марун", 14156));
        mtn.add(new Mountain("Касл", 14265));
        System.out.println("В порядке добавления:\n" + mtn);
        NameCompare nc = new NameCompare();
        Collections.sort(mtn, nc);
        System.out.println("По названию:\n" + mtn);
        HeightCompare hc = new HeightCompare();
        Collections.sort(mtn,hc);
        System.out.println("По высоте:\n" + mtn);
    }
}
class Mountain{
    String title;
    int bpm;
    Mountain(String title, int bpm){
        this.title = title;
        this.bpm = bpm;
    }
  public String toString(){
        return title + " " + bpm;
  }

}
