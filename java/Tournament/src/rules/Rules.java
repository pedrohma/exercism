package rules;

import java.util.ArrayList;
import java.util.List;

import entity.Team;

public class Rules {
	
	public static void getResults(List<String> results, ArrayList<Team> teams) {
		for (String result : results) {
			String[] resultArray = result.split(";");

			String Team1 = resultArray[0];
			String Team2 = resultArray[1];
			String gameResult = resultArray[2];

			new Team();
			Team t1 = Team.getTeamByName(Team1, teams);
			new Team();
			Team t2 = Team.getTeamByName(Team2, teams);

			Rules.calculatePoints(t1, t2, gameResult);
		}
	}
	
	public static void calculatePoints(Team team1, Team team2, String operation) {
		try {
			if(team1 != null && team2 != null) {
				team1.setMP(team1.getMP() + 1);
				team2.setMP(team2.getMP() + 1);
				switch(operation) {
					case "win":
						team1.setW(team1.getW() + 1);
						team2.setL(team2.getL() + 1);
						break;
					case "loss":
						team2.setW(team2.getW() + 1);
						team1.setL(team1.getL() + 1);
						break;
					case "draw":
						team2.setD(team2.getD() + 1);
						team1.setD(team1.getD() + 1);
						break;
					default:
						break;
				}
				
				team1.setP();
				team2.setP();
			}
		}
		catch(Exception ex) {
			System.out.println("An error occurred: " + ex.getMessage());
		}
	}

}
