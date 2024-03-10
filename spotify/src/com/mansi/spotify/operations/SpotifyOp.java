package com.mansi.spotify.operations;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.mansi.spotify.entity.Spotify;
import com.mansi.spotify.methods.SpotifyMenu;

public class SpotifyOp {
	private List < Spotify > spotify1 = new ArrayList<>();
//	SpotifyMenu spotifyMenu=new SpotifyMenu();
	public void allSongs() {
		if(spotify1.size()>0) {
			for (Spotify spotify : spotify1) {
				System.out.println(spotify);
			}
		}else {
			System.out.println("Song not found");
		}
	}
	
     public void addSong(Scanner sc) {
    	 System.out.println("How many songs do you want to add");
    	 int choice=sc.nextInt();
    	 for (int i=0;i<choice;i++) {
    		 Spotify spotify=new Spotify();
    		 sc.nextLine();
    		 System.out.println("Enter song name: ");
    		 spotify.setSongName(sc.nextLine());
//    		
    		 
    		 System.out.println("Enter movie name: ");
    		 spotify.setMovieName(sc.nextLine());
//    		 sc.nextLine();
    		 
    		 System.out.println("Enter Singer name: ");
    		 spotify.setSingerName(sc.nextLine());
//    		 sc.nextLine();
    		 
    		 System.out.println("Enter Actor name: ");
    		 spotify.setActorName(sc.nextLine());
//    		 sc.nextLine();
    		 
    		 System.out.println("Enter Actress name: ");
    		 spotify.setActressName(sc.nextLine());
//    		 sc.nextLine();
    		 
    		 System.out.println("Song is added");
    		 spotify1.add(spotify);
    		 
    		 
    	 }
     }
	
     public void removeSong(Scanner sc) {
	     boolean flag=false;
	     System.out.println("Enter song name: ");
	     String choice=sc.nextLine();
	     for (Spotify spotify : spotify1) {
			if(spotify.getSongName().equals(choice)) {
				spotify1.remove(spotify);
				System.out.println("Song has been removed");
				flag=true;
				break;
			}
		}
	     if(!flag) {
	    	 System.out.println("Song not found");
	     }
	}
     
     public void SerachSongsBySongName(Scanner sc) {
 		boolean flag=false;
 		System.out.println("Enter song name");
 		String choice= sc.nextLine();
 		for (Spotify spotify : spotify1) {
 			if(spotify.getSongName().equals(choice)) {
 				System.out.println(spotify);
 				flag=true;
 				break;
 			}
 		}
 		if(!flag) {
 			System.out.println("song not found");
 		}
 	}

 	public void SerachSongsBySingerName(Scanner sc) {
 		boolean flag=false;
 		System.out.println("Enter Singer name");
 		String choice= sc.nextLine();
 		for (Spotify spotify : spotify1) {
 			if(spotify.getSingerName().equals(choice)) {
 				System.out.println(spotify);
 				flag=true;
 			}
 		}
 		if(!flag) {
 			System.out.println("song not found");
 		}
 	}
 	
 	public void SerachSongsByMovieName(Scanner sc) {
 		boolean flag=false;
		System.out.println("Enter Movie name");
		String choice=sc.nextLine();
		for (Spotify spotify : spotify1) {
			if(spotify.getMovieName().equals(choice)) {
				System.out.println(spotify);
				flag=true;
			}
		}
		if(!flag) {
		   System.out.println("Movie not found");
		}
	}
     
	public void SerachSongsByActorName(Scanner sc) {
 		boolean flag=false;
		System.out.println("Enter Actor name");
		String choice=sc.nextLine();
		for (Spotify spotify : spotify1) {
			if(spotify.getMovieName().equals(choice)) {
				System.out.println(spotify);
				flag=true;
			}
		}
		if(!flag) {
		   System.out.println("Actor not found");
		}
	}
	
	public void SerachSongsByActressName(Scanner sc) {
 		boolean flag=false;
		System.out.println("Enter Actress name");
		sc.nextLine();
		String choice=sc.nextLine();
		for (Spotify spotify : spotify1) {
			if(spotify.getMovieName().equals(choice)) {
				System.out.println(spotify);
				flag=true;
			}
		}
		if(!flag) {
		   System.out.println("Actress not found");
		}
	}
 	
    public void searchSong() throws InputMismatchException {
		System.out.println("1.Search song by name\n"
				+ "2.Search song by Artist\n"
				+ "3.Search song by Movie\n"
				+ "4.search song by Actress Name\n"
				+ "5.search song by Actor name\n"
				+ "6.go back to main Menu");
		     boolean flag=true;  
		while(flag) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter your choice: ");
		    int choice=0;
		    try {
   			     choice=scanner.nextInt();
   		     }
       	     catch(InputMismatchException e) {
       		    System.out.println("invalid input");
       		    SpotifyMenu.mainMenu();
       		        break;
       	     }
		    switch(choice) {
		    case 1:{
		    	System.out.println("Search song by name");
		    	SerachSongsBySongName(scanner);
		    	SpotifyMenu.mainMenu();
		    	break;
		    }
		    case 2:{
		    	System.out.println("Search song by artist");
		    	SerachSongsBySingerName(scanner);
		    	SpotifyMenu.mainMenu();
		    	break;
		    }
		    case 3:{
		    	System.out.println("Search song by Movie");
		    	SerachSongsByMovieName(scanner);
		    	SpotifyMenu.mainMenu();
		    	break;
		    }
		    case 4:{
		    	System.out.println("Search song by Actress Name");
		    	SerachSongsByActressName(scanner);
		    	SpotifyMenu.mainMenu();
		    	break;
		    }
		    case 5:{
		    	System.out.println("Search song by Actor Name");
		    	SerachSongsByActorName(scanner);
		    	SpotifyMenu.mainMenu();
		    	break;
		    }
		    case 6:{
		    	System.out.println("back to main menu");
		    	SpotifyMenu.mainMenu();
		    	flag =false;
		    }
		    }
		}
		
	}
}
