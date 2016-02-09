import org.junit.*;
import static org.junit.Assert.*;

public class AppTest {

  @Test
  public void numbersToWords_returnsAStringForANumber_1() {
    App app = new App();
    String stringNumber = "one";
    assertEquals(stringNumber, app.numbersToWords(1));
  }

  @Test
  public void numbersToWords_returnsAStringForATwoDigitNumber_12() {
    App app = new App();
    String stringNumber = "twelve";
    assertEquals(stringNumber, app.numbersToWords(12));
  }
}
