public class MatrixTranspose {
    static final int N=4;
    static void transpose(int A[][],int B[][]){
        int i,j;
        for (i=0;i<N;i++){
            for (j=0;j<N;j++)
                B[i][j]=A[j][i];
        }
    }
    public static void main(String[] args) {
        int A[][]={{1,1,1,1},{2,2,2,2},{3,3,3,3},{4,4,4,4}};
        int B[][]=new int[N][N];
        System.out.println("Transpose of matrix");
        System.out.println("Before Transpose");
        display(A);
        transpose(A, B);
        System.out.println("After transpose");
        display(B);
    }
    private static void display(int [][]b){
        int i,j;
        for(i=0;i<N;i++){
            for(j=0;j<N;j++)
                System.out.print(b[i][j]+"");
            System.out.println();
        }
    }
}
