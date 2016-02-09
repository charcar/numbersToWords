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
      String stringNumberValue = "";

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
          // singleDigitHash.put('10', "ten");
          // singleDigitHash.put('11', "eleven");
          // singleDigitHash.put('12', "twelve");
          // singleDigitHash.put('13', "thirteen");
          // singleDigitHash.put('14', "fourteen");
          // singleDigitHash.put('15', "fifteen");
          // singleDigitHash.put('16', "sixteen");
          // singleDigitHash.put('17', "seventeen");
          // singleDigitHash.put('18', "eighteen");
          // singleDigitHash.put('19', "nineteen");

        for (char eachDigit : numberCharArray) {
          stringNumberValue  = singleDigitHash.get(eachDigit);
        } return stringNumberValue;
      }
    }


    //   public static Integer scrabbleScore(String userString) {
    //     char[] userCharArray = userString.toLowerCase().toCharArray();
    //     Integer totalScore = 0;

  //     HashMap<Character, Integer> scoreHash = new HashMap<Character, Integer>();
  //         scoreHash.put('a', 1);
  //         scoreHash.put('e', 1);
  //         scoreHash.put('i', 1);
  //         scoreHash.put('o', 1);
  //         scoreHash.put('u', 1);
  //         scoreHash.put('r', 1);
  //         scoreHash.put('l', 1);
  //         scoreHash.put('s', 1);
  //         scoreHash.put('t', 1);
  //         scoreHash.put('n', 1);
  //         scoreHash.put('d', 2);
  //         scoreHash.put('g', 2);
  //         scoreHash.put('b', 3);
  //         scoreHash.put('c', 3);
  //         scoreHash.put('m', 3);
  //         scoreHash.put('p', 3);
  //         scoreHash.put('f', 4);
  //         scoreHash.put('h', 4);
  //         scoreHash.put('v', 4);
  //         scoreHash.put('w', 4);
  //         scoreHash.put('y', 4);
  //         scoreHash.put('k', 5);
  //         scoreHash.put('j', 8);
  //         scoreHash.put('x', 8);
  //         scoreHash.put('q', 10);
  //         scoreHash.put('z', 10);
  //
  //     for (char eachChar : userCharArray ) {
  //       Integer letterValue = scoreHash.get(eachChar);
  //       totalScore = totalScore + letterValue;
  //     } return totalScore;
  //   }
  // }


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
