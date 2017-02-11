public class Reverse {
    public int reverse(int x) {
        boolean negative;
        long result = 0;
        int unitDigit;
        if (x == 0) {
            return x;
        } else if (x < 0) {
            negative = true;
        } else{
            negative = false;
        }
        x = Math.abs(x);
        while (x > 0) {
            unitDigit = x % 10;
            x = x / 10;
            result = result * 10 + unitDigit;
        }
        result =  (negative) ? (-result) : result;
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
                return 0;
        }
        return (int)result;
    }
}
