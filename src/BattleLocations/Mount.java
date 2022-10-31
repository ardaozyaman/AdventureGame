package BattleLocations;

import Monsters.Vampire;

public class Mount extends BattleLocation {
    public Mount() {
        super("Mount",3,3, 2, 3, new Vampire());
    }
}
