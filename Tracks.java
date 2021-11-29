import java.util.Set;
import java.util.HashMap;

public class Tracks {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Baby Shark", "Doo Doo Doo Doo Doo Doo");
        trackList.put("Batman", "na na na na na na na na na");
        trackList.put("The Wheels on the bus", "Go 'round and 'round, 'round and 'round");
        trackList.put("Around the World", "Around the world");
        // get the keys by using the keySet method
        Set<String> keys = trackList.keySet();
        
        String track = trackList.get("Batman");
        System.out.println(track);
        System.out.println();

        for(String key : keys) {
        //     System.out.println(key);
        //     System.out.println(trackList.get(key));    
        // }
        System.out.println(key +" : " + trackList.get(key));
        }
    }
}