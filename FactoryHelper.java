import java.util.Arrays;

public class FactoryHelper extends FactoryUtils {

  private String[] subClassArray;

  // This is the main method controlling the Hero creation process
  public void createHero() {
    clearScreen();
    printer("This is the Hero machine");
    emptyLine();
    printer("You have to create a new Hero.");
    printer("Follow the steps below to proceed.");
    emptyLine();

    enterName();
    enterRace();

    clearScreen();
    printer("Great Choice, " + getName());
    printer("You choosed " + getRace() + " race for your Hero.");

    chooseHeroSubClass();
    printer("Greetings, " + getName());
    printer("Your new hero is complete");
    printer("The combination of " + getRace() + " and " + getHeroClass() + " is Marvelous!");
  }

  private void enterName() {
    printer("Enter the name of your Hero: ");
    setName(typeHere());
  }

  private void enterRace() {
    clearScreen();
    printer("Greetings,  " + getName());
    printer("What Race will be your Hero, Write one from the list below: ");

    printer(Arrays.toString(availableRaces));
    emptyLine();
    setRace(typeHere());
    validateRace();
  }

  private void chooseHeroSubClass() {
    loadAvailableSubClasses();
    clearScreen();
    printer("Excellent choice! Now you will have to choose subclass from the available down below: ");
    printer(Arrays.toString(tempArray));
    emptyLine();
    setHeroClass(typeHere());
    validateSubClass();
  }
}
