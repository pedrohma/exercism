package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import entity.Team;
import rules.Rules;
import util.Util;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Team> teams = Team.getListTeams();

		List<String> results = Util.readTxtFile("C:\\Users\\Shakkollc\\Desktop\\Pedro\\games.txt");
		
		if(results != null) {
			Rules.getResults(results, teams);
		}

		System.out.println(Util.displayTournament(teams));

	}

}
