import java.io.*;
import java.util.List;

public class RoomWriter {
    public static void writeRoomFile(String fileName, List<Room> roomList){
        try{
            FileOutputStream outputStream = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(outputStream);
            for (Paintable room: roomList){
                out.writeObject(room);
            }
            outputStream.close();
            out.close();
        } catch (Exception e) {

        }
    }
}
