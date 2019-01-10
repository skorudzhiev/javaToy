package factory;

import java.util.Arrays;
import model.Character;

public class FactoryUtils extends Character {

  String[] tempArray = {"No Value"};

  // These two methods validate entered race
  public void validateRace() {
    while (!isCorrectRace(getRace())) {
      if (getRace().equalsIgnoreCase("Human")) {
        emptyLine();
      } else if (getRace().equalsIgnoreCase("Animal")) {
        emptyLine();
      } else if (getRace().equalsIgnoreCase("Alien")) {
        emptyLine();
      } else {
        setRace("");
        clearScreen();
        printer("You cannot create a hero different than these in the list");
        printer(Arrays.toString(availableRaces));
        setRace(typeHere());
      }
    }
  }

  private Boolean isCorrectRace(String race) {

    if (race.equalsIgnoreCase("Human")) {
      return true;
    } else if (race.equalsIgnoreCase("Animal")) {
      return true;
    } else if (race.equalsIgnoreCase("Alien")) {
      return true;
    }

    return false;
  }

  // Method returns string[] of Hero SubClasses based on the selected hero race
  public String[] loadAvailableSubClasses() {
      if (getRace().equalsIgnoreCase("Human")) {
        tempArray = humanSubClasses;
      } else if (getRace().equalsIgnoreCase("Animal")) {
        tempArray = animalSubClasses;
      } else if (getRace().equalsIgnoreCase("Alien")) {
        tempArray = alienSubClasses;
      }
    return tempArray;
  }

  // These two methods validate entered subClass
  public void validateSubClass() {
    if (getRace().equalsIgnoreCase("Human")) {
      while (!isCorrectHumanSubClass(getHeroClass())) {
        if (getHeroClass().equalsIgnoreCase("Knight")) {
          emptyLine();
        } else if (getHeroClass().equalsIgnoreCase("Hunter")) {
          emptyLine();
        } else if (getHeroClass().equalsIgnoreCase("Mage")) {
          emptyLine();
        } else {
          setHeroClass("");
          clearScreen();
          printer("You cannot choose a hero sub class than these in the list below");
          printer(Arrays.toString(humanSubClasses));
          emptyLine();
          printer("Write down correct class for your hero!");
          setHeroClass(typeHere());
        }
      }
    } else if (getRace().equalsIgnoreCase("Animal")) {
      while (!isCorrectAnimalSubClass(getHeroClass())) {
        if (getHeroClass().equalsIgnoreCase("Mammal")) {
          emptyLine();
        } else if (getHeroClass().equalsIgnoreCase("Bird")) {
          emptyLine();
        } else if (getHeroClass().equalsIgnoreCase("Reptile")) {
          emptyLine();
        } else {
          setHeroClass("");
          clearScreen();
          printer("You cannot choose a hero sub class than these in the list below");
          printer(Arrays.toString(animalSubClasses));
          emptyLine();
          printer("Write down correct class for your hero!");
          setHeroClass(typeHere());
        }
      }
    } else if (getRace().equalsIgnoreCase("Alien")) {
      while (!isCorrectAlienSubClass(getHeroClass())) {
        if (getHeroClass().equalsIgnoreCase("Machine")) {
          emptyLine();
        } else if (getHeroClass().equalsIgnoreCase("Anamorphic")) {
          emptyLine();
        } else if (getHeroClass().equalsIgnoreCase("Spirit")) {
          emptyLine();
        } else {
          setHeroClass("");
          clearScreen();
          printer("You cannot choose a hero sub class than these in the list below");
          printer(Arrays.toString(alienSubClasses));
          emptyLine();
          printer("Write down correct class for your hero!");
          setHeroClass(typeHere());
        }
      }
    }

  }

  private Boolean isCorrectHumanSubClass(String subClass) {

    if (subClass.equalsIgnoreCase("Knight")) {
      return true;
    } else if (subClass.equalsIgnoreCase("Hunter")) {
      return true;
    } else if (subClass.equalsIgnoreCase("Mage")) {
      return true;
    }

    return false;
  }

  private Boolean isCorrectAnimalSubClass(String subClass) {

    if (subClass.equalsIgnoreCase("Mammal")) {
      return true;
    } else if (subClass.equalsIgnoreCase("Bird")) {
      return true;
    } else if (subClass.equalsIgnoreCase("Reptile")) {
      return true;
    }
    return false;
  }

  private Boolean isCorrectAlienSubClass(String subClass) {

    if (subClass.equalsIgnoreCase("Machine")) {
      return true;
    } else if (subClass.equalsIgnoreCase("Anamorphic")) {
      return true;
    } else if (subClass.equalsIgnoreCase("Spirit")) {
      return true;
    }
    return false;
  }



}
