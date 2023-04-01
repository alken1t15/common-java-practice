package ObjectStudy;

public class Test {
    public static void main(String[] args) {
        LuxuryAuto l1 = new LuxuryAuto("Mercedes GLA", 2022, 700500);
        LuxuryAuto l2 = new LuxuryAuto("Mercedes GLA", 2022, 70000);
        System.out.println(l1.hashCode());
        System.out.println(l2.hashCode());
        System.out.println(l1.hashCode() == l2.hashCode());
    }
}
