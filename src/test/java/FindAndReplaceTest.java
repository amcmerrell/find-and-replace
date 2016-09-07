import org.junit.*;
import static org.junit.Assert.*;

public class FindAndReplaceTest {

  // @Test
  // public void runFindAndReplace_findOneletter_True() {
  // FindAndReplace testFindAndReplace = new FindAndReplace();
  //   // List<object> expectedOuput = new ArrayList<Object>();
  //   String expectedOutput = "true";
  //   assertEquals(expectedOutput, testFindAndReplace.runFindAndReplace("a",));
  // }

  @Test
  public void runFindAndReplace_replaceOneletter_c() {
  FindAndReplace testFindAndReplace = new FindAndReplace();
    String expectedOutput = "c";
    assertEquals(expectedOutput, testFindAndReplace.runFindAndReplace("b","b","c"));
  }

  @Test
  public void runFindAndReplace_replaceOneWord_dog() {
  FindAndReplace testFindAndReplace = new FindAndReplace();
    String expectedOutput = "cat";
    assertEquals(expectedOutput, testFindAndReplace.runFindAndReplace("dog","dog","cat"));
  }

}
