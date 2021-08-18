import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.Collections;

public class Playlista {
Scanner wej = new Scanner(System.in); 	
Scanner scan = new Scanner (System.in);
	ArrayList <String> Playlista = new ArrayList<String>(4);
 
		private String utwór;
		private String Playlist;
		
	ListIterator<String> li = Playlista.listIterator();		

	public Playlista (String Playlist,int initialCapacity) {
		this.Playlist = Playlist;
		
	}
	
	
	public void dodawanie () {
		
		while (scan.hasNextLine()) {
		String Playlist = scan.nextLine();
		System.out.println("Podaj nazwê utworu");
		String utwór = wej.next();
		Playlista.add(utwór);
		Playlista.size();
		System.out.println("Podaj indeks");
		int index = wej.nextInt();
		Playlista.add(index, utwór);
	    if (utwór == null) {
	    	System.out.println("NIE");
	    	}
		}
	}
	   public void pobieranie () {
		   System.out.println("podaj numer");
		   int index = wej.nextInt();
	       Playlista.get(index);
	
	   }
	  public void wyœwietlanie () {
		  System.out.println(Playlista);
		  Playlista.isEmpty();
	  }
	  public void kasowanie () {
		  System.out.println("podaj numer");
		  int index = wej.nextInt();
		  Playlista.remove(index);
	  }
}
	  /*public void alfabetycznie () {
		  Arrays.sort(Playlista);
		  for(String s: Playlista) {
			  System.out.println(s); */
		  
	  
		
	

	    
	    
		
		
		

	


