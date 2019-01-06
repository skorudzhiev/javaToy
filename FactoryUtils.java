import java.util.Arrays;

public class FactoryUtils extends Character {

  // These two methods validate entered race
  public void validateRace() {
    while (!isCorrectRace(getRace())) {
      if (getRace().equalsIgnoreCase("Human")) {
        emptyLine();
      } else if (getRace().equalsIgnoreCase("Animal")) {
        emptyLine();
      } else if (getRace().equalsIgnoreCase("Alien")) {
        emptyLine();
      } else {
        setRace("");
        clearScreen();
        printer("You cannot create a hero different than these in the list below");
        printer(Arrays.toString(availableRaces));
        emptyLine();
        printer("Write down correct Race for your hero!");
        setRace(typeHere());
      }
    }
  }

  private Boolean isCorrectRace(String race) {

    if (race.equalsIgnoreCase("Human")) {
      return true;
    } else if (race.equalsIgnoreCase("Animal")) {
      return true;
    } else if (race.equalsIgnoreCase("Alien")) {
      return true;
    }

    return false;
  }
}
