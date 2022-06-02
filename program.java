class Solution {
    public int a = 0;
    public int b = 1;

    public int ProductAndSum(int n) {
        if (n > 0) {
            int d = n % 10;
            a = a + d;
            b = b * d;
            n = n / 10;
            ProductAndSum(n / 10);
        }
        return b - a;
    }
}