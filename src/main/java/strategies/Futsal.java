package strategies;

import entities.Player;
import enums.PositionFutSal;

import java.util.List;
import java.util.Scanner;

public class Futsal implements Tactical {

    Scanner reader = new Scanner(System.in);

    @Override
    public List<Player> insertGoalkeeper(List<Player> lineUP) {
        Player newPlayer = new Player();
        System.out.println("Enter the GoalKeeper name");
        newPlayer.name = reader.nextLine();
        System.out.println("Enter the GoalKeeper number");
        newPlayer.number = reader.nextLine();
        newPlayer.position = PositionFutSal.GOLEIRO.toString();

        lineUP.add(newPlayer);

        return lineUP;
    }

    @Override
    public List<Player> insertDefenser(List<Player> lineUP) {
        Player newPlayer = new Player();
        System.out.println("Enter the fixed name: ");
        newPlayer.name = reader.nextLine();
        System.out.println("Enter the fixed number");
        newPlayer.number = reader.nextLine();
        newPlayer.position = PositionFutSal.FIXO.toString();

        lineUP.add(newPlayer);

        return lineUP;

    }

    @Override
    public List<Player> insertMidfielder(List<Player> lineUP) {

        for (int count = 0; count < 2; count++) {
            Player newPlayer = new Player();
            System.out.println("Enter the Winger name: ");
            newPlayer.name = reader.nextLine();
            System.out.println("Enter the Winger number");
            newPlayer.number = reader.nextLine();
            newPlayer.position = PositionFutSal.ALA.toString();

            lineUP.add(newPlayer);

        }
        return lineUP;
    }

    @Override
    public List<Player> insertAttacker(List<Player> lineUP) {
        Player newPlayer = new Player();
        System.out.println("Enter the fixed name: ");
        newPlayer.name = reader.nextLine();
        System.out.println("Enter the fixed number");
        newPlayer.number = reader.nextLine();
        newPlayer.position = PositionFutSal.FIXO.toString();

        lineUP.add(newPlayer);

        return lineUP;
    }


}
