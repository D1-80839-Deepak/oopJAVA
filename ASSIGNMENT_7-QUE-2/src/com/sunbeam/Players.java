package com.sunbeam;

public class Players {
public static int numOfBatters() {
	
	return 0;
}
public static int numOfBowlers() {
	return 0;
}
public static int totalBatterRuns(Player []arr) {
	int runs=0;
	for(Player p:arr)
	{
		if(p instanceof Batter) {
			Batter b= (Batter) p;
			runs=runs+b.getRuns();
		}
	}
	return runs;
}
public static int totalBowlerWickets(Player []arr) {
	int wicket=0;
	for(Player p:arr)
	{
		if(p instanceof Bowler) {
			Bowler b=(Bowler)p;
			wicket=wicket+b.getWickets();
			}
	}
	return wicket;
}
public static Player batterWithMaxRuns(Player []arr) {
	int maxRun=0;
	for(Player p:arr) 
	{
		if(p instanceof Batter) {
		Batter b=(Batter)p;
		if(b.getRuns()>maxRun);
		maxRun=b.getRuns();
		}	
	}
	return ;
}
public static Player bowlerWithMaxWickets() {
	return 0;
}

}
