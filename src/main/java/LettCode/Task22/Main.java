package LettCode.Task22;

public class Main {
    public static void main(String[] args) {
        System.out.println(climbStairs(2));
    }
    public static int climbStairs(int n) {
        double sqrt = Math.sqrt(5);
        double sqrt2 = Math.pow((1+sqrt)/2,n+1)-Math.pow((1-sqrt)/2,n+1);
        return (int) (sqrt2/sqrt);
    }
}
