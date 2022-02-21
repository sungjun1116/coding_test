package level_3.hash;

import java.util.*;

public class Lessons_42579 {
    public int[] solution(String[] genres, int[] plays) {
        List<Integer> list = new ArrayList<>();
        HashMap<String, Integer> total_plays = new HashMap<>();
        ArrayList<Song> songs = new ArrayList<>();

        for (int i = 0; i < genres.length; i++) {
            total_plays.put(genres[i], total_plays.getOrDefault(genres[i], 0) + plays[i]);
            songs.add(new Song(i, genres[i], plays[i]));
        }

        songs.sort((s1, s2) -> s2.plays - s1.plays);

        List<Map.Entry<String, Integer>> list_entry = new ArrayList<>(total_plays.entrySet());
        list_entry.sort((obj1, obj2) -> obj2.getValue().compareTo(obj1.getValue()));

        for (Map.Entry<String, Integer> entry : list_entry) {
            int temp = 0;
            for (Song song : songs) {
                if (entry.getKey().equals(song.genre) && temp < 2) {
                    list.add(song.index);
                    temp++;
                }
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }


    static class Song {
        public int index;
        public String genre;
        public int plays;

        Song(int i, String g, int p) {
            this.index = i;
            this.genre = g;
            this.plays = p;
        }
    }
}

