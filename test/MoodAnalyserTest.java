import main.MoodAnalyser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
  
  public MoodAnalyserTest() {}
  
  @Test
  @DisplayName("Should return HAPPY")
  void testMoodAnalysis() throws Exception {
    
    MoodAnalyser moodAnalyser = new MoodAnalyser();
    
    String mood = moodAnalyser.analyseMood("This is a happy message.");
    
    Assertions.assertSame(mood,"HAPPY");
    
  }
  
}
