import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class RoomReader {
    public static Collection<? extends Flyer> readRoomFile(String fileName) throws IOException {
        List<Room> roomList = new ArrayList();

        Object obj = null;
        try {
            FileInputStream readData = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(readData);
            while ((obj = ois.readObject()) != null) {
                Room room = (Room) obj;
                roomList.add(room);
            }
        }
        catch (IOException | ClassNotFoundException e) {

        }
        return roomList;
        }

    }


