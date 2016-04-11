
/**
 * Write a description of class GameRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameRunner
{   
    public void main() {
        Tower tower1 = new Tower();
        Tower tower2 = new Tower();
        Tower tower3 = new Tower();
        tower1.createStartingTower();
        moveDisk(tower1, tower2);
    }

    public void moveDisk(Tower fromTower, Tower toTower) {
        Disk topDiskOfFromTower = fromTower.towerList.get(fromTower.towerList.size()-1);

        if(toTower.towerList.size() == 0) {
            topDiskOfFromTower.botDisk = null;
        }

        else {
            topDiskOfFromTower.botDisk = toTower.towerList.get(toTower.towerList.size()-1);
        }

        toTower.towerList.add(topDiskOfFromTower);
    }

    public int numOfDisks(Tower x) {
        return x.towerList.size();
    }

    public Disk largestDisk(Tower t) {
        Disk largest;
        for(Disk x : t.towerList) {
            if(x-1.size > x.size) {
                largest = x-1;
            }
        }
        return largest;
    }
}
