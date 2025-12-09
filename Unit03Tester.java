import static org.junit.Assert.*;
import org.junit.Test;


/**
 * Write a description of class EncryptionTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Unit03Tester
{
        
    
   @Test
    public void test1(){
        
    
        
    }
   
   @Test
    public void testShiftRight1234(){
        assertEquals(4123, Unit03.shiftRight(1234));
    }
   
   @Test
    public void testShiftRight907(){
        assertEquals(790, Unit03.shiftRight(907));
    }
   
   @Test
    public void testShiftRight50(){
        assertEquals(5, Unit03.shiftRight(50));
    }
   
   @Test
    public void testShiftRight8(){
        assertEquals(8, Unit03.shiftRight(8));
    }
   
   @Test
    public void testShiftRight12345(){
        assertEquals(-1, Unit03.shiftRight(12345));
    }
   
   @Test
    public void testShiftRight1234By1(){
        assertEquals(4123, Unit03.shiftRight(1234, 1));
    }
   
   @Test
    public void testShiftRight1234By2(){
        assertEquals(3412, Unit03.shiftRight(1234, 2));
    }
   
   @Test
    public void testShiftRight1234By4(){
        assertEquals(1234, Unit03.shiftRight(1234, 4));
    }
   
   @Test
    public void testShiftRight907By1(){
        assertEquals(-1, Unit03.shiftRight(907, 1));
    }
   
   @Test
    public void testShiftRight1234By5(){
        assertEquals(-1, Unit03.shiftRight(1234, 5));
    }
   
   @Test
    public void testShiftRight1234By1v2(){
        assertEquals(4123, Unit03.shiftRight(1234, 1));
    }
   
   @Test
    public void testShiftRight1234By2v2(){
        assertEquals(3412, Unit03.shiftRight(1234, 2));
    }
   
   @Test
    public void testShiftRight907By1v2(){
        assertEquals(790, Unit03.shiftRight(907, 1));
    }
   
   @Test
    public void testShiftRight907By3(){
        assertEquals(907, Unit03.shiftRight(907, 3));
    }
   
   @Test
    public void testShiftRight50By5(){
        assertEquals(-1, Unit03.shiftRight(50, 5));
    }
   
   @Test
    public void testShiftRightNegative510By2(){
        assertEquals(-1, Unit03.shiftRight(-510, 2));
    }
   
   @Test
    public void testShiftLeft1234(){
        assertEquals(2341, Unit03.shiftLeft(1234));
    }
   
   @Test
    public void testShiftLeft9071(){
        assertEquals(719, Unit03.shiftLeft(9071));
    }
   
   @Test
    public void testShiftLeft1000(){
        assertEquals(1, Unit03.shiftLeft(1000));
    }
   
   @Test
    public void testShiftLeft999(){
        assertEquals(-1, Unit03.shiftLeft(999));
    }
   
   @Test
    public void testShiftLeft1234By1(){
        assertEquals(2341, Unit03.shiftLeft(1234, 1));
    }
   
   @Test
    public void testShiftLeft1234By2(){
        assertEquals(3412, Unit03.shiftLeft(1234, 2));
    }
   
   @Test
    public void testShiftLeft1234By4(){
        assertEquals(1234, Unit03.shiftLeft(1234, 4));
    }
   
   @Test
    public void testShiftLeft9071By1(){
        assertEquals(719, Unit03.shiftLeft(9071, 1));
    }
   
   @Test
    public void testShiftLeft50By2(){
        assertEquals(-1, Unit03.shiftLeft(50, 2));
    }
   
   @Test
    public void testShiftLeft1234By5(){
        assertEquals(-1, Unit03.shiftLeft(1234, 5));
    }
   
   @Test
    public void testShiftRightStringAbcd(){
        assertEquals("dabc", Unit03.shiftRight("abcd"));
    }
   
   @Test
    public void testShiftRightStringWithLeadingSpace(){
        assertEquals("d abc", Unit03.shiftRight(" abcd"));
    }
   
   @Test
    public void testShiftRightStringWithSpace(){
        assertEquals("ohe ll", Unit03.shiftRight("he llo"));
    }
   
   @Test
    public void testShiftRightStringSingleChar(){
        assertEquals("a", Unit03.shiftRight("a"));
    }
   
   @Test
    public void testShiftRightStringEmpty(){
        assertEquals("", Unit03.shiftRight(""));
    }
   
   @Test
    public void testShiftLeftStringAbcd(){
        assertEquals("bcda", Unit03.shiftLeft("abcd"));
    }
   
   @Test
    public void testShiftLeftStringWithLeadingSpace(){
        assertEquals("abcd ", Unit03.shiftLeft(" abcd"));
    }
   
   @Test
    public void testShiftLeftStringHello(){
        assertEquals("elloh", Unit03.shiftLeft("hello"));
    }
   
   @Test
    public void testShiftLeftStringSingleChar(){
        assertEquals("a", Unit03.shiftLeft("a"));
    }
   
   @Test
    public void testShiftLeftStringEmpty(){
        assertEquals("", Unit03.shiftLeft(""));
    }
   
   @Test
    public void testShiftLeftStringAbcdBy1(){
        assertEquals("bcda", Unit03.shiftLeft("abcd", 1));
    }
   
   @Test
    public void testShiftLeftStringAbcdBy2(){
        assertEquals("cdab", Unit03.shiftLeft("abcd", 2));
    }
   
   @Test
    public void testShiftLeftStringAbcdBy4(){
        assertEquals("abcd", Unit03.shiftLeft("abcd", 4));
    }
   
   @Test
    public void testShiftLeftStringHelloBy7(){
        assertEquals("llohe", Unit03.shiftLeft("hello", 7));
    }
   
   @Test
    public void testShiftLeftStringSingleCharBy3(){
        assertEquals("a", Unit03.shiftLeft("a", 3));
    }
   
   @Test
    public void testShiftLeftStringEmptyBy5(){
        assertEquals("", Unit03.shiftLeft("", 5));
    }
   
   @Test
    public void testShiftRightStringAbcdBy1(){
        assertEquals("dabc", Unit03.shiftRight("abcd", 1));
    }
   
   @Test
    public void testShiftRightStringAbcdBy2(){
        assertEquals("cdab", Unit03.shiftRight("abcd", 2));
    }
   
   @Test
    public void testShiftRightStringAbcdBy4(){
        assertEquals("abcd", Unit03.shiftRight("abcd", 4));
    }
   
   @Test
    public void testShiftRightStringHelloBy7(){
        assertEquals("ohell", Unit03.shiftRight("hello", 7));
    }
   
   @Test
    public void testShiftRightStringSingleCharBy3(){
        assertEquals("a", Unit03.shiftRight("a", 3));
    }
   
   @Test
    public void testShiftRightStringEmptyBy5(){
        assertEquals("", Unit03.shiftRight("", 5));
    }
   
   @Test
    public void testCountWordsHello(){
        assertEquals(1, Unit03.countWords("hello"));
    }
   
   @Test
    public void testCountWordsHelloWorld(){
        assertEquals(2, Unit03.countWords("hello world"));
    }
   
   @Test
    public void testCountWordsGoodMorningAll(){
        assertEquals(3, Unit03.countWords("good morning all"));
    }
   
   @Test
    public void testCountWordsEmpty(){
        assertEquals(0, Unit03.countWords(""));
    }
   
   @Test
    public void testCountPartsFruits(){
        assertEquals(3, Unit03.countParts("apple,banana,pear", ','));
    }
   
   @Test
    public void testCountPartsWithSpace(){
        assertEquals(3, Unit03.countParts("apple banana pear", ' '));
    }
   
   @Test
    public void testCountPartsDogCat(){
        assertEquals(2, Unit03.countParts("dog-cat", '-'));
    }
   
   @Test
    public void testCountPartsHello(){
        assertEquals(1, Unit03.countParts("hello", ','));
    }
   
   @Test
    public void testCountPartsEmpty(){
        assertEquals(0, Unit03.countParts("", ','));
    }
   
   @Test
    public void testPrintPartsFruits(){
        assertEquals("apple\nbanana\npear", Unit03.getParts("apple,banana,pear", ','));
    }
   
   @Test
    public void testPrintPartsDogCat(){
        assertEquals("dog\ncat", Unit03.getParts("dog-cat", '-'));
    }
   
   @Test
    public void testPrintPartsHello(){
        assertEquals("hello", Unit03.getParts("hello", ','));
    }
   
}
