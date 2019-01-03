import java.io.IOException;
import java.util.Scanner;

public class Utils {

  public void printer(String text) {
    System.out.println(text);
  }

  public void emptyLine() {
    System.out.println("");
  }

  public void clearScreen() {
    //Clears Screen in java
    try {
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");
    } catch (IOException | InterruptedException ex) {}
}

  public String typeHere() {
    Scanner reader = new Scanner(System.in);  // Reading from System.in
    String readerString = reader.next(); // Scans the next token of the input as an int.

    //once finished
    //reader.close();
    // reader is not closing on purpose to receive multiple inputs
    return readerString;
  }
}
