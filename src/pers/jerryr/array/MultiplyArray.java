package pers.jerryr.array;
/**
 * 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。
 * 不能使用除法。（注意：规定B[0] = A[1] * A[2] * ... * A[n-1]，B[n-1] = A[0] * A[1] * ... * A[n-2];）
 * 对于A长度为1的情况，B无意义，故而无法构建，因此该情况不会存在。
 * */
public class MultiplyArray {
    public int[] multiply(int[] A) {
        if(A == null || A.length<=1){
            return A;
        }
        int len = A.length;
        int[] left = new int[len];
        int[] right = new int[len];
        int[] B = new int[len];
        left[0] = 1;
        right[len-1] = 1;
        for(int i= 1;i<len;i++){
            left[i] = A[i-1]*left[i-1];
            right[len-1-i] = A[len-i] *right[len-i];
        }


        for(int k=0;k<len;k++){
            B[k] = left[k]*right[k];
        }
        return B;
    }
}
