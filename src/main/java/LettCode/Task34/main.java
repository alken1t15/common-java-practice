package LettCode.Task34;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class main {
    public static void main(String[] args) {
        long b = 6_914_017_674L;
       // System.out.println(maximumEvenSplit(12));
    }
/*   public static List<Long> maximumEvenSplit(long finalSum) {
        ArrayList<Long> arrayList = new ArrayList<>();
        long e = 0;
        long b = 0;
        long c =0;
        int maxSize = 0;
        boolean delet = false;
        if(finalSum%2!=0){
            return arrayList;
        }
        while (true){
            if(e==finalSum){
                return arrayList;
            }
            else if(e>finalSum){
                c=c+2;
                e=e-c;
                arrayList.remove(c);
                delet = true;
            }
            else {
                if(delet){
                    b=0;
                }
                e=0;
                b = b + 2;
                if(arrayList.contains(b)){
                    b=b+2;
                }
                arrayList.add(b);
                for(long y : arrayList){
                    e+=y;
                }
            }
            if(maxSize<arrayList.size()){
                maxSize = arrayList.size();
            } else if (maxSize == arrayList.size()) {
                return arrayList;
            }
        }

    }*/

    /*  public static List<Long> maximumEvenSplit(long finalSum) {
            HashSet<Long> arrayList = new HashSet<>();
            long e = 0;
            long b = 0;
            long c = 0;
            int maxSize = 0;
            boolean delet = false;
            if (finalSum % 2 != 0) {
                return new ArrayList<>(arrayList);
            }
            while (true) {
                if (e > finalSum) {
                    c = c + 2;
                    e = e - c;
                    arrayList.remove(c);
                    delet = true;
                } else {
                    if (delet) {
                        b = 0;
                    }
                    e = 0;
                    b = b + 2;
                    while (true) {
                        if (arrayList.contains(b)) {
                            b = b + 2;
                        } else break;
                    }
                    arrayList.add(b);
                    for (long y : arrayList) {
                        e += y;
                    }
                }
                if (maxSize < arrayList.size()) {
                    if (e == finalSum) {
                        return new ArrayList<>(arrayList);
                    }
                    maxSize = arrayList.size();
                } else if (maxSize == arrayList.size()) {
                    arrayList.remove(b);
                    return new ArrayList<>(arrayList);
                }
            }
*/

/*    public static List<Long> maximumEvenSplit(long finalSum) {
        HashSet<Long> arrayList = new HashSet<>();
        long e = 0;
        long b = 0;
        long c =0;
        int maxSize = 0;
        boolean delet = false;
        if(finalSum%2!=0){
            return new ArrayList<>(arrayList);
        }
        while (true){
             if(e>finalSum){
                c=c+2;
                e=e-c;
                arrayList.remove(c);
                delet = true;
            }
            else {
                if(delet){
                    b=0;
                }
                e=0;
                b = b + 2;
                if(arrayList.contains(b)){
                    b=b+2;
                }
                arrayList.add(b);
                for(long y : arrayList){
                    e+=y;
                }
            }
            if(maxSize<arrayList.size()){
                if (e == finalSum) {
                    maxSize = arrayList.size();
                }
            } else if (maxSize == arrayList.size()) {
                if (e == finalSum) {
                    return new ArrayList<>(arrayList);
                }
            }
        }*/

    public List<Long> maximumEvenSplit(long finalSum) {
        if (finalSum % 2 != 0) return Collections.emptyList();

        List<Long> result = new ArrayList<>();
        long sum = 0, evenNum = 2;
        while (sum + evenNum <= finalSum) {
            sum += evenNum;
            result.add(evenNum);
            evenNum += 2;
        }

        if (sum < finalSum) {
            long lastEvenNum = result.remove(result.size() - 1);
            lastEvenNum += finalSum - sum;
            result.add(lastEvenNum);
        }
        return result;
    }

}
