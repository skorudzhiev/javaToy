import java.util.Arrays;

public abstract class Character extends Utils {

  private String name;
  private String race;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getRace() {
    return race;
  }

  public void setRace(String race) {
    this.race = race;
  }

  // This is the main method controlling the Hero creation process
  void create() {
    clearScreen();
    printer("This is the Hero machine");
    emptyLine();

    enterName();
    //enterRace();

    clearScreen();
    printer("Great Choice, " + getName());
    printer("You choosed " + getRace() + " race to create your Hero.");
  }

  void enterName() {
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
    //validateRace();

  }


}
