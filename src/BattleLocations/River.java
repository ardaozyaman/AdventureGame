package BattleLocations;

import Monsters.Zombie;

public class River extends BattleLocation {
    public River() {
        super("River",4,3, 3, 3, new Zombie());
    }
}
