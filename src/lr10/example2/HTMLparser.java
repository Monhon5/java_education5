package lr10.example2;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
public class HTMLparser {
    public  static void main(String[] args) {
        String url = "https://itlearn.ru/first-steps";
        try{
            Document doc = Jsoup.connect(url).get();
            Elements links = doc.select("html > body a[href]");
            for (Element link : links ){
                System.out.println(link.attr("abs:href"));
            }

        } catch (IOException e){
            e.printStackTrace();
        }

    }

}

