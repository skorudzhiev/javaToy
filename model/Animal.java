package model;

public class Animal extends Character {

  public Animal() {
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
