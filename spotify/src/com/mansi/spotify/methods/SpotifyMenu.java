package com.mansi.spotify.methods;

import java.util.InputMismatchException;
import java.util.Scanner;



import com.mansi.spotify.operations.SpotifyOp;

public class SpotifyMenu extends Exception {
     public static void mainMenu() {
    	 System.out.println("-------Main Menu-------");
    	 System.out.println("1.See all songs\n"
    			 +"2.Add song to list\n"
    			 +"3.Remove song from list\n"
    			 +"4.Search song\n"
    			 +"5.Exit \n ");
    	 System.out.println("Enter your choice");

	}
     static SpotifyOp spotifyOp=new SpotifyOp();
     
     
    public static void main(String[] args) throws InputMismatchException {
    	 mainMenu();
    	 boolean flag=true;
    	 Scanner scanner=new Scanner(System.in);
    	 int choice=0;
    	 while(flag) {
    		 try {
    			 choice=scanner.nextInt();
    		 }
        	 catch(InputMismatchException e) {
        		 System.out.println("invalid input");
        		 mainMenu();
        		 break;
        	 }
    		 switch(choice)  {
    			case 1:{
    				System.out.println("All songs List");
    				spotifyOp.allSongs();
    				mainMenu();
    				break;
    			}
    			case 2:{
    				System.out.println("Add songs to list");
    				spotifyOp.addSong(scanner);
    				mainMenu();
    				break;
    			}
    			case 3:{
    				System.out.println("Remove song from list");
    				spotifyOp.removeSong(scanner);
    				mainMenu();
    				break;
    			}
    			case 4:{
    				System.out.println("Search songs");
    				spotifyOp.searchSong();
//    				mainMenu();
    				break;
    			}
    			case 5:{
    				System.out.println("Exit");
    				flag=false;
    				break;
    			}
    			default:{
    				System.out.println("Invalid choice");
    				break;
    			}
    			}
    	 }
		
	}
    
     
}
