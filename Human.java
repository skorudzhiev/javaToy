public class Human extends Character {

  public Human() {
      String heroName;
      if (getName() == null) {
        heroName = "Urungela";
      } else {
        heroName = getName();
      }

      setName(heroName);
      setRace("Human");
  }
}
