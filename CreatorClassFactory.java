public abstract class CreatorClassFactory {

    public Character createNewCharacter(String type) {
      Character character;

      character = createrCharacter(type);
      character.create();

      return character;
    }

    protected abstract Character createrCharacter(String type);


}
