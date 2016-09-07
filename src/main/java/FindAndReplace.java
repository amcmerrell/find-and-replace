
public class FindAndReplace {
  public String runFindAndReplace(String words, String findWord, String replaceWord) {
    String result = words.replace(findWord, replaceWord);
  //   if (words.equals("a")) {
  //    result = "true";
  //  } else {
  //    result = words.replace("b", "c");
  //  }
    // String findWord = words.replace("a", "b");
    // String result = findWord;
    return result;
  }

}
