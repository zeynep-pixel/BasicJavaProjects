import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class strTester{
  @Test
  public void testReplaceLetters(){
   assertEquals("ifmmp",str.replaceLetters("hello", 1));
    assertEquals("khoor",str.replaceLetters("hello", 3));
     assertEquals("Alex�w Yt?",str.replaceLetters("What�s Up?", 4));
  }
  
   @Test
  public void testStripFromBothEnd(){
   assertEquals("Good day!",str.stripFromBothEnd(" Good day! "));
   assertEquals("What a wonderful day!!!!",str.stripFromBothEnd("What a wonderful day!!!! "));
   assertEquals( "How are you ???",str.stripFromBothEnd("How are you ???") );
  }
   
   
   @Test
  public void testRemoveRepeatingChars(){
   assertEquals( "Jav iscol.",str.removeRepeatingChars("Java is cool."));
   assertEquals( "My nameisTro.",str.removeRepeatingChars("My name is Terry Terry Moore..."));
   assertEquals( "Hi ther?",str.removeRepeatingChars("Hi there ?") );
  
   
  }
   
     @Test
  public void testCompressText(){
   assertEquals(  "ad2 al2 eg2s",str.compressText("add all eggs"));
   assertEquals( "yum2y3 in my3 2tum2y4.3",str.compressText("yummyyy in myyy  tummyyyy...") );
   assertEquals( "m5 co2kie2 is nice5 with cof2e4.",str.compressText("mmmmm cookiee is niceeeee with coffeeee.") );
  
   
  }
   


}