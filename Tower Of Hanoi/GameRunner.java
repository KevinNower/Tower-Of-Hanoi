
/**
 * Write a description of class GameRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameRunner
{   
    int counter = 0;
    public void main(int numOfDisks) {
        Tower tower1 = new Tower("A");
        Tower tower2 = new Tower("B");
        Tower tower3 = new Tower("C");
        tower1.createStartingTower(numOfDisks);
        System.out.println("This is before a disk is moved");
        System.out.println("This should print True, False, False");
        System.out.println(tower1.hasDisks());
        System.out.println(tower2.hasDisks());
        System.out.println(tower3.hasDisks());
        System.out.println(tower1.towerList.size());
        
        moveAllDisks(numOfDisks, tower1, tower3, tower2);
        System.out.println("This is after all disks are moved");
        System.out.println("This should print False, False, True");
        System.out.println(tower1.hasDisks());
        System.out.println(tower2.hasDisks());
        System.out.println(tower3.hasDisks());
        System.out.println();
        System.out.println("This is the contents of Tower1");
        tower1.printDisks();
        System.out.println();
        System.out.println("This is the contents of Tower2");
        tower2.printDisks();
        System.out.println();
        System.out.println("This is the contents of Tower3");
        tower3.printDisks();
        System.out.println();  
        System.out.println(counter);  
    }
     public void moveAllDisks(int numOfDisks, Tower fromTower, Tower toTower, Tower auxillery) {
        
         if(numOfDisks == 1){
            moveDisk(fromTower, toTower);
            System.out.println("You move from " +fromTower.getName()+ " to " + toTower.getName() +".");
            counter++;
            
        }
        else{
            moveAllDisks(numOfDisks - 1, fromTower, auxillery, toTower);
            moveDisk(fromTower, toTower);
            System.out.println("You move from " +fromTower.getName()+ " to " + toTower.getName() +".");
            counter++;
            moveAllDisks(numOfDisks - 1, auxillery, toTower, fromTower);
        }
        
    }
    public void moveDisk(Tower fromTower, Tower toTower) {
        Disk topDiskOfFromTower = fromTower.towerList.remove(fromTower.towerList.size()-1);
        toTower.towerList.add(topDiskOfFromTower);
    } 
}
