import java.util.ArrayList;
import java.util.List;

public class ZarzadzaniePlaylistami {

	public static void main(String[] args) {
		List <Playlista> PlaylistaList = new ArrayList <Playlista> ();
		
	    Playlista p1 = new Playlista("Rock",4);
		Playlista p2 = new Playlista("Pop",5);
		
		p1.dodawanie();
		p2.dodawanie();
		p1.pobieranie();
		p2.pobieranie();
		p1.wyœwietlanie();
		p2.wyœwietlanie();
		p1.kasowanie();
		p2.kasowanie();
		p1.dodawanie();
		p2.dodawanie();
		/*p1.alfabetycznie();
		p2.alfabetycznie();*/
		
		
		
		
		
		}		

	}


