import java.util.*;

public class Pr31 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList<String> playlist = new LinkedList<>();

        // 1. Add songs
        System.out.print("Enter number of songs: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter song " + i + ": ");
            String song = sc.nextLine();
            playlist.add(song);
        }

        // 2. Display full playlist
        System.out.println("\nFull Playlist:");
        System.out.println(playlist);

        // 3. Play first song (remove from front)
        if (!playlist.isEmpty()) {
            String firstSong = playlist.removeFirst();
            System.out.println("\nPlaying: " + firstSong);
        } else {
            System.out.println("\nPlaylist is empty.");
        }

        System.out.println("Playlist after playing first song:");
        System.out.println(playlist);

        // 4. Skip last song (remove from end)
        if (!playlist.isEmpty()) {
            String lastSong = playlist.removeLast();
            System.out.println("\nSkipped: " + lastSong);
        } else {
            System.out.println("\nNo song to skip.");
        }

        // 5. Display updated playlist
        System.out.println("Updated Playlist:");
        System.out.println(playlist);

        sc.close();
    }
}
/* output 
  Enter number of songs: 4
Enter song 1: Song A
Enter song 2: Song B
Enter song 3: Song C
Enter song 4: Song D

Full Playlist:
[Song A, Song B, Song C, Song D]

Playing: Song A
Playlist after playing first song:
[Song B, Song C, Song D]

Skipped: Song D
Updated Playlist:
[Song B, Song C] */
