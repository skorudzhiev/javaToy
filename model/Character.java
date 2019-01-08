package model;

import utils.Utils;

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




}
