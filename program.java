public class program {  
    public int a = 0;
    public int b = 1; 
    public int subtractProductAndSum(int n) {
        while (n > 0) {
            int d = n % 10;
            a = a + d;
            b = b* d;
            n=n/ 10;
            subtractProductAndSum(n/10);
        }
        return b-a;
    }
}