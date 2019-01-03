import java.util.Arrays;

public class CreateHero extends Character {

  // This is the main method controlling the Hero creation process
  public void create() {
    enterName();
    enterRace();

    clearScreen();
    printer("Great Choice, " + getName());
    printer("You choosed " + getRace() + " race to create your Hero.");
  }

  private void enterName() {
    printer("Enter the name of your Hero: ");
    setName(typeHere());
  }

  private void enterRace() {
    clearScreen();
    printer("Greetings,  " + getName());
    printer("What Race will be your Hero, Write one from the list below: ");

    // List of available races to choose from
    String[] contents = {"Human", "Animal", "Alien"};

    printer(Arrays.toString(contents));
    emptyLine();
    setRace(typeHere());
    validateRace();

  }






}
