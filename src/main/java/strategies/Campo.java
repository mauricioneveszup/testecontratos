package strategies;

import entities.Player;
import enums.PositionCampo;

import java.util.List;
import java.util.Scanner;

public class Campo implements Tactical {

    Scanner reader = new Scanner(System.in);

    @Override
    public List<Player> insertGoalkeeper(List<Player> lineUP) {
        Player newPlayer = new Player();
        System.out.println("Enter the GoalKeeper name");
        newPlayer.name = reader.nextLine();
        System.out.println("Enter the GoalKeeper number");
        newPlayer.number = reader.nextLine();
        newPlayer.position = PositionCampo.GOLEIRO.toString();

        lineUP.add(newPlayer);

        return lineUP;
    }

    @Override
    public List<Player> insertDefenser(List<Player> lineUP) {
        for (int count = 0; count < 4; count++) {
            Player newPlayer = new Player();
            System.out.println("Enter the defense name: ");
            newPlayer.name = reader.nextLine();
            System.out.println("Enter the defense number");
            newPlayer.number = reader.nextLine();
            newPlayer.position = PositionCampo.DEFESA.toString();

            lineUP.add(newPlayer);

        }
        return lineUP;
    }

    @Override
    public List<Player> insertMidfielder(List<Player> lineUP) {
        for (int count = 0; count < 4; count++) {
            Player newPlayer = new Player();
            System.out.println("Enter the midfield name: ");
            newPlayer.name = reader.nextLine();
            System.out.println("Enter the midfield number");
            newPlayer.number = reader.nextLine();
            newPlayer.position = PositionCampo.MIDFIELD.toString();

            lineUP.add(newPlayer);

        }
        return lineUP;
    }

    @Override
    public List<Player> insertAttacker(List<Player> lineUP) {
        for (int count = 0; count < 2; count++) {
            Player newPlayer = new Player();
            System.out.println("Enter the forward name: ");
            newPlayer.name = reader.nextLine();
            System.out.println("Enter the forward number");
            newPlayer.number = reader.nextLine();
            newPlayer.position = PositionCampo.ATTACKER.toString();

            lineUP.add(newPlayer);

        }
        return lineUP;
    }
}
