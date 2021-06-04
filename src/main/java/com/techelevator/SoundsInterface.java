package com.techelevator;

public interface SoundsInterface {

    default String getSoundChips(String sound) {
       sound = "Crunch Crunch, Yum!";
        return sound;
    }
    default String getSoundCandy(String sound) {
       sound = "Munch Munch, Yum!";
        return sound;
    }
    default String getSoundDrinks(String sound) {
       sound = "Glug Glug, Yum!";
        return sound;
    }
    default String getSoundGum(String sound) {
       sound = "Chew Chew, Yum!";
        return sound;
    }
}
