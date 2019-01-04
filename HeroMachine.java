public class HeroMachine {

  public static void main(String[] args) {

    CreatorClassFactory factory = new HumanFactory();
    Character character = factory.createNewCharacter();

  }
}
