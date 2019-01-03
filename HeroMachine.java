public class HeroMachine {

  public static void main(String[] args) {
    CreateHero hero = new CreateHero();
    hero.clearScreen();
    hero.printer("This is the Hero machine");
    hero.emptyLine();
    hero.create();

  }
}
