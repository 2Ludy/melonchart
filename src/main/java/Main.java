import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {
    public static void main(String[] args) throws IOException {
        String url = "https://www.melon.com/chart/index.htm";
        Document doc = Jsoup.connect(url).get();

        List<Music> musicList = new ArrayList<>();
        Elements rankElements = doc.select("[id=tb_list] tr");
        String year = doc.select("span.yyyymmdd").text();
        String time = doc.select("span.hhmm").text();

        for (Element rankElement : rankElements) {
            String rank = rankElement.select("span.rank").text();
            String title = rankElement.select(".ellipsis.rank01 > span > a").text();
            String artist = rankElement.select(".ellipsis.rank02 > span > a").text();
            String album = rankElement.select("a.image_typeAll img").attr("src");

            Music musics = new Music(rank, title, artist, album);
            musicList.add(musics);

        }

        for (Music musics : musicList) {
            if (!musics.isEmpty()) {
                System.out.println(musics);
            }
        }
        System.out.println(year + " " + time + " 기준 TOP 100 차트");

    }
}
