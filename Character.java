import java.util.Arrays;

public abstract class Character extends Utils {

  private String name;
  private String race;
  private String heroClass;

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

  public String getHeroClass() {
    return heroClass;
  }

  public void setHeroClass(String heroClass) {
    this.heroClass = heroClass;
  }

  // This is the main method controlling the Hero creation process
  void createHero() {
    clearScreen();
    printer("This is the Hero machine");
    emptyLine();

    enterName();
    enterRace();

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
    validateRace();

  }

  // These two methods validate entered race
  public void validateRace() {
    while (!isCorrectRace(getRace())) {
      if (getRace().equals("Human") || getRace().equals("human")) {
        emptyLine();
      } else if (getRace().equals("Animal") || getRace().equals("animal")) {
        emptyLine();
      } else if (getRace().equals("Alien") || getRace().equals("alien")) {
        emptyLine();
      } else {
        setRace("");
        clearScreen();
        printer("You cannot create a hero different than these in the list");
        setRace(typeHere());
      }
    }
  }

  public Boolean isCorrectRace(String race) {

    if (race.equals("Human") || race.equals("human")) {
      return true;
    } else if (race.equals("Animal") || race.equals("animal")) {
      return true;
    } else if (race.equals("Alien") || race.equals("alien")) {
      return true;
    }

    return false;
  }


}
