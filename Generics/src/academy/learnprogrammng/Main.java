package academy.learnprogrammng;

/*
- Generics allow us to create classes, interfaces, and methods that take Types as parameters
- Type parameters
-parametized type

 */

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
//        adelaideCrows.addPlayer(pat);
//        adelaideCrows.addPlayer(beckham);

        System.out.println(adelaideCrows.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        Team<SoccerPlayer> soccerTeam = new Team<>("Galaxy");
        soccerTeam.addPlayer(beckham);

//        Team<String> brokenTeam = new Team<>("This won't work");
//        brokenTeam.addPlayer("No one");

    }
}
