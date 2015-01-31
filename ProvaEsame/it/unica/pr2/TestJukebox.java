/* due in 120 min */
package it.unica.pr2.jukebox;

import it.unica.pr2.music.Song;
import it.unica.pr2.music.Video;
import java.util.*;

public class TestJukebox {

public static void main(String[] args) {

// C (18)

Set<MultimediaResource> jukebox = Jukebox.newJukebox();
Jukebox mymusic = (JukeboxPlus) jukebox;

// C+ (22)

Video v = new Video("Lady Gaga", "Applause");
mymusic.add(new Song("Lady Gaga", "Applause"));
mymusic.add(new Song("Daft Punk", "Get Lucky")); 
mymusic.add(v);
assert mymusic.size() == 3;
assert mymusic.videos() == 1;
assert mymusic.songs() == 2;

// B (25)

Map<String,Set<MultimediaResource>> artistMap = mymusic.getArtistMap();

Set<MultimediaResource> daftPunkMusic = artistMap.get("Daft Punk");
assert daftPunkMusic.size() == 1;

for(MultimediaResource m : daftPunkMusic) {
assert m.title().equals("Get Lucky");
}

// B+ (27)

daftPunkMusic = artistMap.get("punk");
assert daftPunkMusic.size() == 1;
for(MultimediaResource m : daftPunkMusic) {
assert m.title().equals("Get Lucky");
}

// A (30)

mymusic.saveTo("music.csv"); 
/* crea il seguente file di 3 righe (righe in ordine casuale):

V,"Lady Gaga","Applause"
S,"Lady Gaga","Applause"
S,"Daft Punk","Get Lucky"

*/

// A+ (impossibile)

((Jukebox)jukebox).mostraJukebox(); // mostra una finestra JavaFX con la lista delle canzoni (in giallo) e dei video (in rosso);

}

}