
import java.util.ArrayList;

public class Room implements Paintable {

    private ArrayList<Wall> wallList;
    public static int roomCount;
    private int roomNum;
    public Room(double length, double width, double height) throws BadWidthException, BadHeightException {
        wallList = new ArrayList<Wall>();

        Wall wallA = new Wall(length, height);
        wallList.add(wallA);
        Wall wallB = new Wall(length, height);
        wallList.add(wallB);
        Wall wallC = new Wall(width, height);
        wallList.add(wallC);
        Wall wallD = new Wall(width, height);
        wallList.add(wallD);
        roomCount++;
        roomNum = roomCount + 100;
    }

    public double getArea() {
        double area = 0;

        for (int i = 0; i < wallList.size(); i++) {
            Wall w = wallList.get(i);
            area += w.getArea();
        }

        return area;
    }
    @Override
    public String toString() {
        return "Room Number: " + roomNum + ", Area: " + getArea() + " Lego studs";
    }

    @Override
    public double getPremiumCost() {
        return PREMIUM_PAINT_COST_PER_GALLON;
    }

    @Override
    public double getStandardCost() {
        return STANDARD_PAINT_COST_PER_GALLON;
    }
}

