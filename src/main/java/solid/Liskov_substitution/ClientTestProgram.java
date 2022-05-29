package solid.Liskov_substitution;

import java.util.ArrayList;
import java.util.List;

public class ClientTestProgram {

    public static void main(String[] args) {

        List<VideoMediaPlayer> allPlayers = new ArrayList<VideoMediaPlayer>();
        allPlayers.add(new VlcMediaPlayer());
        allPlayers.add(new DivMediaPlayer());

        playVideoInAllMediaPlayers(allPlayers);

        System.out.println("---------------------------");


//         allPlayers.add(new WinampMediaPlayer());
    }

    public static void playVideoInAllMediaPlayers(List<VideoMediaPlayer> allPlayers) {

        for (VideoMediaPlayer player : allPlayers) {
            player.playVideo();
        }
    }
}
