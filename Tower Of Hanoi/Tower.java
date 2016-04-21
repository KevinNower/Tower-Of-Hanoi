
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
    String name;

    public Tower(String name) {
        towerList = new ArrayList<Disk>();
        this.name = name;
    }

    public void createStartingTower(int numOfDisks){
        for (int i = 1; i<=numOfDisks; i++){
            towerList.add(new Disk(i));
        }
    }
    
    public String getName(){
        return name;
    }

    public void addDisk(Disk x) {
        towerList.add(x);
    }

    public void removeDisk(Disk x) {
        towerList.remove(x);
    }
    public boolean hasDisks(){
        if (towerList.size()==0){
            return false;
        }
        else{
            return true;
        }
    }
    public void printDisks(){
        for (Disk disk : towerList){
            System.out.println(disk.size);
        }
    
    }
}
