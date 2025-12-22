public class Unit03{

    // Yotam
    public static int shiftRight(int num)    {
    if (num < 0 || num > 9999)
        return -1;
    else {
        int lastDigit = num % 10;
        int newNum = num / 10;
        if (num >= 0 && num < 10)
            newNum = num;
        else if (num > 9 && num < 100)
            newNum = lastDigit*10 + newNum;
        else if (num > 99 && num < 1000)
            newNum = lastDigit*100 + newNum;
        else if (num > 999 && num < 10000)
            newNum = lastDigit*1000 + newNum;
        return newNum; 
        }
    }

    //Yotam
    public static int shiftRight(int num, int k) {
    int newNum = 0;
    if (num < 1000 || num > 9999)
        return -1;
    if (k == 1) {
        int lastDigit = num % 10;
        newNum = num / 10;
        newNum = lastDigit*1000 + newNum;
    }
    else if (k == 2) {
        int lastDigits = num % 100;
        newNum = num / 100;
        newNum = lastDigits*100 + newNum;
    }
    else if (k == 3) {
        int lastDigits = num % 1000;
        newNum = num / 1000;
        newNum = lastDigits*10 + newNum;
    }
    else if (k == 4 || k == 0)
        newNum = num; 
    else 
        return -1;
    return newNum;
    }  

    // Yotam
    public static int shiftRight2(int num, int k) {
    int digits = 0;
    if (num >= 0 && num < 10)
            digits = 1;
    else if (num > 9 && num < 100)
            digits = 2;
    else if (num > 99 && num < 1000)
            digits = 3;
    else if (num > 999 && num < 10000)
            digits = 4;
    else
        return -1;
    if (k > digits)
        return -1;
    int newNum = 0;
    if (k == 1) {
        int lastDigit = num % 10;
        newNum = num / 10;
        switch (digits) {
            case 1: newNum = num;
                break;
            case 2: newNum = lastDigit*10 + newNum;
                break;
            case 3: newNum = lastDigit*100 + newNum;
                break;
            case 4: newNum = lastDigit*1000 + newNum;
                break;
        }
    }
    else if (k == 2) {
        int lastDigits = num % 100;
        newNum = num / 100;
        switch (digits) {
            case 2: newNum = num;
                break;
            case 3: newNum = lastDigits*10 + newNum;
                break;
            case 4: newNum = lastDigits*100 + newNum;
                break;
        }
    }
    else if (k == 3) {
        int lastDigits = num % 1000;
        newNum = num / 1000;
        switch (digits) {
            case 3: newNum = num;
                break;
            case 4: newNum = lastDigits*10 + newNum;
                break;
        }
    }
    else if (k == 4 || k == 0)
        newNum = num; 
    else 
        return -1;
    return newNum;
    }
   

    //eitan
    public static String shiftLeft(String s, int k){
        if (s.length() < 2) {
            return s;
        }
        int n = s.length();
        k = k % n; 
        if (k == 0) {
            return s;
        }
        String movedPart = s.substring(0, k);
        String remainder = s.substring(k);
        s = remainder + movedPart;
        return s;
    }
    //eitan
    public static String shiftRight(String s, int k)    {
        if (s.length() < 2) {
            return s;
        }
        int n = s.length();
        k = k % n; 
        if (k == 0) {
            return s;
        }
        String movedPart = s.substring(n-k);
        String remainder = s.substring(0,n-k);
        s = movedPart + remainder;
        return s;  
    }
}

    
}
// Ariel
public static int shiftLeft(int num){
        if (num < 1000 || num > 9999)
            return -1;
        else{
            String num_str = String.valueOf(num);
            String first_digit = num_str.substring(0, 1);
            String rest_of_digits = num_str.substring(1);
            String new_num_str = rest_of_digits + first_digit;
            return Integer.parseInt(new_num_str);
        }
}
// Ariel
public static int shiftLeft(int num, int k){
        if (num < 1000 || num > 9999){
            return -1;
        }else{
            String num_str = String.valueOf(num);
            String first_digits = num_str.substring(0, k);
            String rest_of_digits = num_str.substring(k);
            String new_num_str = rest_of_digits + first_digits;
            return Integer.parseInt(new_num_str);
            }
}
// Ariel
public static String shiftRight(String s){
        int len = s.length();
        String last_char = s.substring(len - 1);
        String rest_of_characters = s.substring(0, len - 1);
        return last_char + rest_of_characters;
}
