package com.example.pojo;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class PlayerPojo {

private String team_key;
private String      team_name;
private String      team_badge;
	

public void PlayerPojo() {
	
}
private List<Player> playerList;

public String getTeam_key() {
	return team_key;
}

public void setTeam_key(String team_key) {
	this.team_key = team_key;
}

public String getTeam_name() {
	return team_name;
}

public void setTeam_name(String team_name) {
	this.team_name = team_name;
}

public String getTeam_badge() {
	return team_badge;
}

public void setTeam_badge(String team_badge) {
	this.team_badge = team_badge;
}

public List<Player> getPlayerList() {
	return playerList;
}

public void setPlayerList(List<Player> playerList) {
	this.playerList = playerList;
}

public PlayerPojo(String team_key, String team_name, String team_badge, List<Player> playerList) {
	super();
	this.team_key = team_key;
	this.team_name = team_name;
	this.team_badge = team_badge;
	this.playerList = playerList;
}


	


}
