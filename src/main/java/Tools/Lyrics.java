package Tools;

import java.io.IOException;
import java.util.List;

import static Tools.Page.GetElementsByClass;

public class Lyrics {

    public static String getLyrics(String artist, String track) throws IOException {
        String url = "https://www.azlyrics.com/lyrics/" + artist + "/" + track +  ".html";
        String htmlClass = "col-xs-12 col-lg-8 text-center";

        List<String> wordsList = GetElementsByClass(url, htmlClass);

        String lyrics = "";

        for (int i = 0; i < wordsList.size(); i++) {

            lyrics += wordsList.get(i).replace("</br>", "\n");

        }
        lyrics = lyrics.replaceAll("Submit Corrections.*", "").replaceAll("\".+?\" lyrics.+?Lyrics \".+?\"", "");

        return lyrics;
    }

}
