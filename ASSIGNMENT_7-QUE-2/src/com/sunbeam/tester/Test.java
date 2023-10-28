package com.sunbeam.tester;

import com.sunbeam.Cricketer;
import com.sunbeam.Player;
import com.sunbeam.Players;

public class Test {

	public static void main(String[] args) {
	Player []arr=new Player[2];
	for(int i=0;i<2;i++) {
		arr[i]=new Cricketer();
	arr[i].accept();

	}
	System.out.println("Players Details");
	for(Player element:arr)
		System.out.println(element.toString());
	
	
	System.out.println("Number of Batters: " + Players.numOfBatters(arr));
    System.out.println("Number of Bowlers: " + Players.numOfBowlers(arr));
    System.out.println("Total Batter Runs: " + Players.totalBatterRuns(arr));
    System.out.println("Total Bowler Wickets: " + Players.totalBowlerWickets(arr));

    System.out.println("Highest rus Scores: " + Players.batterWithMaxRuns(arr));
    System.out.println("Highest wicket taker: " + Players.bowlerWithMaxWickets(arr));
	}

}
