public abstract class CreatorClassFactory extends FactoryHelper {

    public Character createNewCharacter() {
      Character character;

      createHero();
      character = createCharacter();

      return character;
    }

    protected abstract Character createCharacter();
}
