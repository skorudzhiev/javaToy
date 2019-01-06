public class MainController extends Character {

  CreatorClassFactory factory;

  public void initializeFactory() {
    factory = new AbstractFactory();
  }

  public void createNewChar() {
    initializeFactory();
    Character character = factory.createNewCharacter();
  }
}
