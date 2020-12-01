import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static Tools.Page.GetElementsByClass;

public class Main {

    public static void main(String[] args) throws IOException {

        String url = "https://genius.com/" + "Tj-beastboy-1000x-cooler" + "-lyrics";
        String htmlClass = "Lyrics__Container-sc-1ynbvzw-2 jgQsqn";

        System.out.println(url);
        System.out.println(htmlClass);

        List<String> wordsList = GetElementsByClass(url, htmlClass);
        System.out.println(wordsList);

        List<String> tags = new ArrayList<>();
        for (int i = 0; i < wordsList.size(); i++) {
            String[] words = wordsList.get(i).split(" ");
            System.out.println(words[i]);

            /*for (int j = 0; j < words.length; j++) {
                String replace = words[j].replaceAll("</br>", "\n").replaceAll("[^A-Za-z]", "");
                if(!replace.equalsIgnoreCase("")) {
                    tags.add(replace.toLowerCase());

                }

            }*/

        }

    }

}
