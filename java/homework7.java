import java.util.Arrays;
 
class Main
{
    public static void swap(int[] A, int i, int j)
    {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
 
    public static void partition(int[] A)
    {
        int j = 0;
 
        for (int i = 0; i < A.length; i++)
        {
            if (A[i] != 0)     
            {
                swap(A, i, j);
                j++;
            }
        }
    }
}