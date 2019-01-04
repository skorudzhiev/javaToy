public class MainController extends Character {

  CreatorClassFactory factory;

  void initializeFactory() {
    factory = new AbstractFactory();
  }

  public void createNewChar() {
    initializeFactory();
    Character character = factory.createNewCharacter();
  }
}
