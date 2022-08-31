import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Main{
    public static void main(String[] args) throws IOException {
        FileWriter io = new FileWriter("output.txt");
        
        BufferedReader re = new BufferedReader(new FileReader("input.txt"));

        EventBO bo = new EventBO();

        List<Event> events = bo.readFromFile(re);

        bo.writeFile(events, io);

    }
}