
/**
 * Write a description of class Tower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.ArrayList;
public class Tower
{
    ArrayList<Disk> towerList;

    public Tower() {
        towerList = new ArrayList<Disk>();
    }

    public void createStartingTower(){
        Disk d8 = new Disk(null, 8);
        Disk d7 = new Disk(d8, 7);
        Disk d6 = new Disk(d7, 6);
        Disk d5 = new Disk(d6, 5);
        Disk d4 = new Disk(d5, 4);
        Disk d3 = new Disk(d4, 3);
        Disk d2 = new Disk(d3, 2);
        Disk d1 = new Disk(null, d2, 1);
        towerList.add(d8);
        towerList.add(d7);
        towerList.add(d6);
        towerList.add(d5);
        towerList.add(d4);
        towerList.add(d3);
        towerList.add(d2);
        towerList.add(d1);
    }

    public void addDisk(Disk x) {
        towerList.add(x);
    }

    public void removeDisk(Disk x) {
        towerList.remove(x);
    }
}
