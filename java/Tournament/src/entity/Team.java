package entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Team {
	private String Name;
	private Integer MP;
	private Integer W;
	private Integer D;
	private Integer L;
	private Integer P;
	
	
	public Team(String name) {
		super();
		Name = name;
		MP = 0;
		W = 0;
		D = 0;
		L = 0;
		P = W + D + L;
	}

	public Team() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Integer getMP() {
		return MP;
	}

	public void setMP(Integer mP) {
		MP = mP;
	}

	public Integer getW() {
		return W;
	}

	public void setW(Integer w) {
		W = w;
	}

	public Integer getD() {
		return D;
	}

	public void setD(Integer d) {
		D = d;
	}

	public Integer getL() {
		return L;
	}

	public void setL(Integer l) {
		L = l;
	}

	public Integer getP() {
		return P;
	}

	public void setP() {
		P = (L * 0) + (W * 3) + (D * 1);
	}

	@Override
	public String toString() {
		return "Team [Name=" + Name + ", MP=" + MP + ", W=" + W + ", D=" + D + ", L=" + L + ", P=" + P + "]";
	}
	
	public static ArrayList<Team> getListTeams(){
		
		List<String> teamNames = Arrays.asList("Devastating Donkeys", "Allegoric Alaskans", "Blithering Badgers", "Courageous Californians");
		
		ArrayList<Team> teams = new ArrayList<Team>();
		
		for(String name : teamNames) {
			teams.add(new Team(name));
		}
		
		return teams;
	}
	
	public static Team getTeamByName(String Name, ArrayList<Team> teams) {
		
		Team team = null;
		
		try {
			
			for(Team t: teams) {
				if(t.Name.equalsIgnoreCase(Name)) {
					team = t;
				}
			}
			
		}
		catch(Exception ex) {
			System.out.println("An error occurred: " + ex.getMessage());
		}
		
		return team;
	}
	
}
