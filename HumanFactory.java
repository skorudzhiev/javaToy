public class HumanFactory extends CreatorClassFactory {
  public Character createrCharacter(String item) {
    if (item.equals("human")) {
        return new Human();
    } else {
      return null;
    }
  };
}
