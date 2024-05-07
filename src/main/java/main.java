import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class main {
    public static void main(String[] args) throws IOException {
        String url = "https://www.melon.com/chart/index.htm";
        Document doc = Jsoup.connect(url).get();

        List<music> musicList = new ArrayList<>();
        Elements rankElements = doc.select("[id=tb_list] tr");

        for (Element rankElement : rankElements) {
            String rank = rankElement.select("span.rank").text();
            String title = rankElement.select(".ellipsis.rank01 > span > a").text();
            String artist = rankElement.select(".ellipsis.rank02 > span > a").text();
            String album = rankElement.select("a.image_typeAll img").attr("src");

            music musics = new music(rank, title, artist, album);
            musicList.add(musics);

        }

        for (music musics : musicList) {
            if(!musics.isEmpty())
                System.out.println(musics);
        }
    }
}
