package LettCode.Task9;

public class Test {
    public static void main(String[] args) {
        int [][] twoDimArray = {{1,1,0,0,0}, {1,1,1,1,0}, {1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}};
       int[] arr = new Test().kWeakestRows(twoDimArray,3);
       for(int a : arr){
           System.out.println(a);
       }
    }
    public int[] kWeakestRows(int[][] mat, int k) {
        int [] arr2 = new int[k];
        int [] arr = new int[mat.length];
        int temp = 0;
        for(int i = 0; i<mat.length;i++){
            for(int j = 0;j<mat[0].length;j++){
                if(mat[i][j] == 1){
                    temp+=1;
                }
            }
            arr[i] = temp;
            temp=0;
        }
        for(int i = 0; i<k-2;i++){
            arr2[i] = arr[i];
        }
        if(k==1){
            arr2[k-1] = k;
            return arr2;
        }
        else {
            arr2[k - 1] = k;
            arr2[k-2] = 0;
            return arr2;
        }

    }

}
