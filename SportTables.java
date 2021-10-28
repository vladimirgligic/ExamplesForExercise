// Generic class for forming tables for different sports and leagues within those sports
// Adding leagues for different sports 
// Adding teams to different leagues
// Each team belongs to a certain league and sport and cannot be added to another
// Entering match results 
// In the end, based on the results, tables are formed by leagues


package com.sporttables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author vladimirgligic
 */
public class SportTables {

    public static void main(String[] args) {
        League<Team<FootballTeam>> premierleague = new League<>("Premier League");
        Team<FootballTeam> arsenal = new Team<>("Arsenal");
        Team<FootballTeam> liverpool = new Team<>("Liverpool");
        Team<FootballTeam> chelsea = new Team<>("Chelsea");
        Team<FootballTeam> mu = new Team<>("Manchester United");

        premierleague.add(arsenal);
        premierleague.add(liverpool);
        premierleague.add(chelsea);
        premierleague.add(mu);

        arsenal.result(liverpool, 1, 0, 3);
        arsenal.result(chelsea, 0, 0, 3);
        arsenal.result(mu, 0, 1, 3);
        chelsea.result(liverpool, 2, 0, 3);
        chelsea.result(mu, 2, 3, 3);
        liverpool.result(mu, 2, 1, 3);

        League<Team<FootballTeam>> spanishLaLiga = new League<>("Spanish La Liga");
        Team<FootballTeam> rm = new Team<>("Real Madrid");
        Team<FootballTeam> barca = new Team<>("Barcelona");
        Team<FootballTeam> valencia = new Team<>("Valencia");
        Team<FootballTeam> rs = new Team<>("Real Sociedad");

        spanishLaLiga.add(rm);
        spanishLaLiga.add(barca);
        spanishLaLiga.add(valencia);
        spanishLaLiga.add(rs);

        rm.result(barca, 1, 2, 3);
        rm.result(rs, 3, 0, 3);
        rm.result(valencia, 0, 1, 3);
        rs.result(barca, 3, 4, 3);
        rs.result(valencia, 2, 3, 3);
        barca.result(valencia, 2, 5, 3);

        League<Team<BasketballTeam>> nba = new League<>("NBA");
        Team<BasketballTeam> boston = new Team<>("Boston Celtics");
        Team<BasketballTeam> lal = new Team<>("LA Lakers");
        Team<BasketballTeam> denver = new Team<>("Denver Nuggets");
        Team<BasketballTeam> gs = new Team<>("Golden State Warriors");

        nba.add(boston);
        nba.add(lal);
        nba.add(denver);
        nba.add(gs);

        boston.result(lal, 121, 110, 2);
        boston.result(denver, 113, 116, 2);
        boston.result(gs, 110, 91, 2);
        denver.result(lal, 112, 128, 2);
        denver.result(gs, 114, 113, 2);
        lal.result(gs, 98, 81, 2);

        List<League> league = new ArrayList<>();
        league.add(premierleague);
        league.add(spanishLaLiga);
        league.add(nba);

        for (League l : league) {
            System.out.println(l.name);
            l.showLeagueTable();

        }

    }
}

class Sport {

    String name;

    public Sport() {
    }

    public Sport(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

class Team<T extends Sport> implements Comparable<Team<T>> {

    private String name;
    private int won;
    private int lose;
    private int draw;
    private int points;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void result(Team<T> opponent, int ourScore, int theirScore, int points) {
        if (ourScore > theirScore) {
            won++;
        }
        if (ourScore == theirScore) {
            draw++;
        } else {
            lose++;
        }

        this.points = points * won;

        if (opponent != null) {
            opponent.result(null, theirScore, ourScore, points);
        }

    }

    public int pointsWon() {

        return points + draw;
    }

    @Override
    public int compareTo(Team<T> t) {

        if (this.pointsWon() > t.pointsWon()) {
            return -1;
        } else if (this.pointsWon() < t.pointsWon()) {
            return 1;
        } else {
            return 0;
        }
    }

}

class League<T extends Team> {

    public String name;
    private ArrayList<T> league = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean add(T team) {
        if (league.contains(team)) {
            return false;
        }
        league.add(team);
        return true;
    }

    public void showLeagueTable() {
        Collections.sort(league);
        for (T t : league) {
            System.out.println(t.getName() + ": " + t.pointsWon());
        }
    }

}

class FootballTeam extends Sport {

    public FootballTeam(String name) {
        super(name);
    }

    public FootballTeam() {
    }

}

class BasketballTeam extends Sport {

    public BasketballTeam(String name) {
        super(name);
    }

}

class HandballTeam extends Sport {

    public HandballTeam(String name) {
        super(name);
    }

}
