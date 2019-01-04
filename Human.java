public class Human extends Character {

  private String heroClass;

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

  public String getHeroClass() {
    return heroClass;
  }

  public void setHeroClass(String heroClass) {
    this.heroClass = heroClass;
  }
}
