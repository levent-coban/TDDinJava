package main;

public class MoodAnalyser {
  
  public MoodAnalyser() {}
  
  public String analyseMood(String message) {
    
    if(message.contains("happy")) {
      return "HAPPY";
    } else {
      return "SAD";
    }
    
  }
  
}
