package util;

import java.util.ArrayList;

import entity.Team;

public class Util {
	
	public static String displayTournament(ArrayList<Team> teams) {
		
		String output = "";
		
		output += "Team                      | MP| W | D | L | P " + System.lineSeparator();
		
		for(Team team: teams) {
			int whiteSpaceLen = 25 - team.getName().length();
			String whitespace = "";
			
			while(whiteSpaceLen > 0) {
				whitespace += " ";
				whiteSpaceLen--;
			}
			
			output += team.getName() + whitespace + " | " + team.getMP() + " | " + team.getW() + " | " + team.getD() + " | " + team.getL() + " | " + team.getP() + System.lineSeparator();
		}
		
		return output;
	}

}
