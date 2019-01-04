public class HeroMachine extends Utils {

  public static void main(String[] args) {
    //CreateHero hero = new CreateHero();

    CreatorClassFactory factory = new HumanFactory();
    Character character;

    //character.clearScreen();
    //character.printer("This is the Hero machine");
    //character.emptyLine();
    //character.create();
    character = factory.createNewCharacter("human");


  }
}
