public class MyPow {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if(n < 0) {
            x = 1/x;
            n = -n;
        }
        if (n == Integer.MIN_VALUE) {
            n--;
            x = Math.abs(x);
        }
        return (n%2 == 1) ? x * myPow(x*x, n/2): myPow(x*x,n/2);
    }
}
