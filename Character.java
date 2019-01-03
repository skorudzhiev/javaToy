public class Character extends Utils {

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
