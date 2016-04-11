
/**
 * Write a description of class Disk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Disk
{
    public Disk topDisk;
    public Disk botDisk;
    public int size;
    
    public Disk() {
        topDisk = null;
        botDisk = null;
    }
    
    public Disk(Disk botDisk, int size) {
        this.botDisk = botDisk;
        this.size = size;
    }
    
    public Disk(Disk topDisk, Disk bottomDisk, int size) {
        this.botDisk = bottomDisk;
        this.topDisk = topDisk;
        this.size = size;
    }
    
}
