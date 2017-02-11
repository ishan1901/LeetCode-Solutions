public class Atoi {
    public int myAtoi(String str) {
        int length = str.length(), result = 0, i = 0;
        boolean negative = false;
        if (length == 0) {
            return 0;
        }
        char[] number = str.toCharArray();
        while(number[i] == ' ') {
            i++;
        }
        if (number[i] == '-') {
            i++;
            negative = true;
        } else if(number[i] == '+') {
            i++;
            negative = false;
        }

        while (i < length) {
            if (number[i] < '0' || number[i] > '9') {
                break;
            }
            if (result > (Integer.MAX_VALUE / 10) || (result == Integer.MAX_VALUE/10 && number[i] - '0' > 7)) {
                return (negative) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            result = result * 10 + (number[i++] - 48);
        }
        
        result = (negative) ? (-result) : result;
        return (int)result;
    }
} 
