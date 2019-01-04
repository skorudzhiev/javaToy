public abstract class CreatorClassFactory extends Character {

    public Character createNewCharacter() {
      Character character;
      
      createHero();
      character = createTrait();

      return character;
    }

    protected abstract Character createTrait();


}
