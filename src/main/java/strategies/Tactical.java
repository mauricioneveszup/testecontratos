package strategies;

import entities.Player;

import java.util.List;

public interface Tactical  {


    public List<Player> insertGoalkeeper(List<Player> lineUP);
    public List<Player> insertDefenser(List<Player> lineUP);
    public List<Player> insertMidfielder(List<Player> lineUP);
    public List<Player> insertAttacker(List<Player> lineUP);


}
