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
    public static int shiftRight(int num, int k){
        return -1;
    }
   
    public static int shiftLeft(int num)    {
        return -1;
    }
    public static int shiftLeft(int num, int k){
        return -1;
    }
    public static String shiftRight(String s)    {
        return "";
    }
    public static String shiftLeft(String s)    {
        return "";
    }
    public static String shiftLeft(String s, int k)    {
        return "";
    }
    public static String shiftRight(String s, int k)    {
        return "";
    }
    public static int countWords(String s)    {
        return -1;
    }
    public static int countParts(String s, char separator)    {
        return -1;
    }
    public static String getParts(String s, char separator)    {
        return "";
    }
    public static void printParts(String s, char separator)    {
        
    } 
    
}
