public abstract class CreatorClassFactory extends FactoryHelper {

    protected abstract Character createCharacter();

    public Character createNewCharacter() {
      Character character;

      createHero();
      character = createCharacter();

      return character;
    }
}
