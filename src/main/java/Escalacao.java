import entities.Player;
import strategies.Campo;
import strategies.Futsal;
import strategies.Society;
import strategies.Tactical;


import java.util.*;

public class Escalacao {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter S for Soccer, enter I for Indoor Soccer, and enter Y for Football Society ");

        Escalacao escalacao = new Escalacao();
        char modality = reader.nextLine().toUpperCase().charAt(0);

        if (modality == 'S') {
            escalacao.escalar(new Campo());
        } else if (modality == 'I') {
            escalacao.escalar(new Futsal());
        } else if (modality == 'Y') {
            escalacao.escalar(new Society());
        }


    }

    public void escalar(Tactical tactical) {

        List<Player> teamLineUp = new ArrayList<>();
        tactical.insertGoalkeeper(teamLineUp);
        tactical.insertDefenser(teamLineUp);
        tactical.insertMidfielder(teamLineUp);
        tactical.insertAttacker(teamLineUp);
        System.out.println(teamLineUp.size());
        for (Player player : teamLineUp) {
            System.out.println("Number: " + player.number +   " \n" + " Name: " + player.name + " \n" +" Position: " + player.position + " \n" + "********************" );
        }

    }


}
