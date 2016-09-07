import java.io.Console;

public class App {
  public static void main(String[] args){
    Console myConsole = System.console();

    System.out.println("Please enter a sentense.");
    String sentenseInput = myConsole.readLine();

    System.out.println("Please enter a word you would like to replace.");
    String findWordInput = myConsole.readLine();

    System.out.println("Please enter a replace word.");
    String replaceWordInput = myConsole.readLine();

    FindAndReplace userInput = new FindAndReplace();
    String sentenseResult = userInput.runFindAndReplace(sentenseInput, findWordInput, replaceWordInput);

    System.out.println(sentenseResult);
  }
}
