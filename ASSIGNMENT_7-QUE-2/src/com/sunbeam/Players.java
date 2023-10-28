package com.sunbeam;

public class Players {
public static int numOfBatters(Player []arr) {
	 int count = 0;
     for (Player player : arr) {
         if (player instanceof Batter) {
             count++;
         }
     }
	return count;
}
public static int numOfBowlers(Player []arr) {
	int count = 0;
    for (Player player : arr) {
        if (player instanceof Bowler) {
            count++;
        }
    }
	return count;
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
	Player batter=null;
	for(Player p:arr) 
	{
		if(p instanceof Batter) {
		
		Batter b=(Batter)p;
		if(b.getRuns()>maxRun);
		maxRun=b.getRuns();
		batter=p;
		}	
		
	}
	return batter;
}
public static Player bowlerWithMaxWickets(Player []arr) {
	int maxWicket=0;
	Player bowler=null;
	for(Player p:arr) 
	{
		if(p instanceof Bowler) {
		
		Bowler b=(Bowler)p;
		if(b.getWickets()>maxWicket);
		maxWicket=b.getWickets();
		bowler=p;
		}	
		
	}
	return bowler;
}

}
