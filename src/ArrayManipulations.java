/**
 * Created by Pruthvi on 9/30/2016.
 */
public class ArrayManipulations {
    public static double max(double[] arr){
        double max = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }

    public static double avg(double[] arr){
        int N = arr.length;
        double sum = 0.0;
        for (int i = 0; i < N; i++)
            sum += arr[i];
        return sum/N;
    }

    public static void copy(double [] arr1, double[] arr2){
        int N = arr1.length;
        arr2 = new double[N];
        for (int i = 0; i < N; i++){
            arr2[i] = arr1[i];
        }
    }

    public static void reverse(double [] arr){
        int N = arr.length;
        for (int i =0; i<N/2; i++){
            double temp = arr[i];
            arr[i] = arr[N-i-1];
            arr[N-i-1] = temp;
        }
    }

    public static double[][] matrixmul(double[][] arr1, double[][] arr2){
        int N  = arr1.length;
        double [][]c = new double[N][N];
        if (arr1.length != arr2.length) {
            return c;
        }
        else{
            for (int i = 0; i<N; i++)
                for (int j=0; j<N; j++)
                    for (int k = 0; k <N; k++)
                        c[i][j] += arr1[i][k]*arr2[k][j];
        }
        return c;
    }
}
