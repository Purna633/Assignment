public class SubArrayDivisibleByk2ndmethod  {
    public static int SubArrayDivisibleByK(int[] A, int K)
    {
        int sum=0;
        int[] count=new int[K];

        for (int x:A)
        {
            sum +=(x%K +K)%K;
            count[sum%K]++;
        }
        int result=count[0];
        for(int c:count)
        {
            result +=(c*(c-1))/2;


        }
        return  result;
    }
    public static  void main(String purna[])
    {
        int[] A = {4, 5, 0, -2, -3, 1};
        int K = 5;
        int result = SubArrayDivisibleByK(A, K);
        System.out.println("Output: " + result);
    }

}
