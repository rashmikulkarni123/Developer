package com.source.dto;

public class IplDto extends AbstractAuditDto {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String teamName;
	private String captainName;
	private boolean ownerAlive;
	private double  purse;
	private int wins;
	private int defeats;
	
	public IplDto()
	
	{
		System.out.println("Calling the no-args const of IPL");
	}
	
	@Override
	public String toString() {
		return "IplDto [teamName=" + teamName + ", captainName=" + captainName + ", ownerAlive=" + ownerAlive
				+ ", purse=" + purse + ", wins=" + wins + ", defeats=" + defeats + ", toString()=" + super.toString()
				+ "]";
	}


	public String getTeamName() {
		return teamName;
	}


	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}


	public String getCaptainName() {
		return captainName;
	}


	public void setCaptainName(String captainName) {
		this.captainName = captainName;
	}


	public boolean isOwnerAlive() {
		return ownerAlive;
	}


	public void setOwnerAlive(boolean ownerAlive) {
		this.ownerAlive = ownerAlive;
	}


	public double getPurse() {
		return purse;
	}


	public void setPurse(double purse) {
		this.purse = purse;
	}


	public int getWins() {
		return wins;
	}


	public void setWins(int wins) {
		this.wins = wins;
	}


	public int getDefeats() {
		return defeats;
	}


	public void setDefeats(int defeats) {
		this.defeats = defeats;
	}
	
	
	
	
	
	
	
}
