import java.io.Console;
import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;

public class App {
  public static void main(String[] args) {

  }
    public String numbersToWords(Integer inputNumber) {
      String stringNumber = inputNumber.toString();
      char[] numberCharArray = stringNumber.toCharArray();
      Integer numberLength = numberCharArray.length;
      Integer numberRemainder = inputNumber % 10;
      String results = "";
      Integer newInputNumber = inputNumber;
      // charArray length == 1, find value, add to totalStringNumber
      HashMap<Character, String> singleDigitHash = new HashMap<Character, String>();
          singleDigitHash.put('0', "zero");
          singleDigitHash.put('1', "one");
          singleDigitHash.put('2', "two");
          singleDigitHash.put('3', "three");
          singleDigitHash.put('4', "four");
          singleDigitHash.put('5', "five");
          singleDigitHash.put('6', "six");
          singleDigitHash.put('7', "seven");
          singleDigitHash.put('8', "eight");
          singleDigitHash.put('9', "nine");

      // charArray length == 2, %10 becomes key, (remainder of number), find value, add to totalStringNumber
      HashMap<Character, String> teensDigitHash = new HashMap<Character, String>();
          teensDigitHash.put('0', "ten");
          teensDigitHash.put('1', "eleven");
          teensDigitHash.put('2', "twelve");
          teensDigitHash.put('3', "thirteen");
          teensDigitHash.put('4', "fourteen");
          teensDigitHash.put('5', "fifteen");
          teensDigitHash.put('6', "sixteen");
          teensDigitHash.put('7', "seventeen");
          teensDigitHash.put('8', "eighteen");
          teensDigitHash.put('9', "nineteen");
      // charArray length == 2, %10 == 0, find value(??), add to totalStringNumber
      HashMap<String, String> twentiesDigitHash = new HashMap<String, String>();
          twentiesDigitHash.put("20", "twenty");
          twentiesDigitHash.put("30", "thirty");
          twentiesDigitHash.put("40", "forty");
          twentiesDigitHash.put("50", "fifty");
          twentiesDigitHash.put("60", "sixty");
          twentiesDigitHash.put("70", "seventy");
          twentiesDigitHash.put("80", "eighty");
          twentiesDigitHash.put("90", "ninety");

      if (newInputNumber < 10) {
        for (Object key : singleDigitHash.keySet() ) {
          if (newInputNumber == key) {
              results = singleDigitHash.get(key);
          }
        }
      } return results;
    }
  }


  //   String layout = "templates/layout.vtl";
  //
  //   get("/", (request, response) -> {
  //     HashMap<String, Object> model = new HashMap<String, Object>();
  //     model.put("template", "templates/home.vtl");
  //     return new ModelAndView(model, layout);
  //   }, new VelocityTemplateEngine());
  //
  //   get("/detector", (request, response) -> {
  //     HashMap<String, Object> model = new HashMap<String, Object>();
  //     model.put("template", "templates/detector.vtl");
  //
  //     String word = request.queryParams("word");
  //     Integer scrabbleScore = scrabbleScore(word);
  //     model.put("scrabbleScore", scrabbleScore);
  //     return new ModelAndView(model, layout);
  //   }, new VelocityTemplateEngine());
  // }
  //
  //   public static Integer scrabbleScore(String userString) {
  //     char[] userCharArray = userString.toLowerCase().toCharArray();
  //     Integer totalScore = 0;
  //
