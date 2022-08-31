import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EventBO {
    public List<Event> readFromFile(BufferedReader br) {
        ArrayList<Event> events = new ArrayList<Event>();
        try {
            br = new BufferedReader(new FileReader("input.txt"));
            String str;
            while((str = br.readLine()) != null){
                String[] arr = str.split(",");
                events.add(new Event(arr[0], Integer.parseInt(arr[1]), arr[2]));
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return events;
    }

    public void writeFile(List<Event> eventList, FileWriter fr) throws IOException {
        fr = new FileWriter("output.txt");
        BufferedWriter wr = new BufferedWriter(fr);
        ArrayList<String> st = new ArrayList<String>();

        for(Event event: eventList){
            if(!st.contains(event.ownerName)){
                st.add(event.ownerName);
                wr.write(event.eventName+","+event.attendeesCount+","+event.ownerName+"\n");
            }
        }

        wr.close();
    }
}
