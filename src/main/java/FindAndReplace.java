
public class FindAndReplace {
  public String runFindAndReplace(String words, String findWord, String replaceWord) {
    String result = words.replaceAll(findWord, replaceWord);
    return result;
  }
}
