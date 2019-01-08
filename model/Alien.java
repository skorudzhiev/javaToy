package model;

public class Alien extends Character {

  public Alien() {
      String heroName;

      if (getName() == null) {
        heroName = "Default name";
      } else {
        heroName = getName();
      }

      setName(heroName);
      setRace(getRace());
  }
}
