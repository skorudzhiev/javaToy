package model;

public class Human extends Character {

  public Human() {
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
