
//********************************************************************
//  Coin.java       Author: Lewis/Loftus/Cocking 
//                          + Nickell (no, not the coin)
//
//  Represents a coin with two sides that can be flipped.
//********************************************************************
public class Coin implements LockableLN
{
   private final int HEADS = 0;
   private final int TAILS = 1;
   private int face;
   private int key;
   private boolean isLocked;

   //-----------------------------------------------------------------
   //  Sets up the coin by flipping it initially.
   //-----------------------------------------------------------------
   public Coin ()
   {
      flip();
      isLocked = false;
   }

   //-----------------------------------------------------------------
   //  Flips the coin by randomly choosing a face value.
   //-----------------------------------------------------------------
   public int flip ()
   {
      if(isLocked) {
         return -1;
      }

      face = (int) (Math.random() * 2);
      return face;
   }

   /**
    * Method purpose: Lock coin object
    *
    * @param key  sets key for object (int)
    * @return void
    */
   public void setKey(int key) {
      this.key = key;
   }

   /**
    * Method purpose: Lock coin object
    *
    * @param key  object will lock if key (int) equals set key
    * @return void
    */
   public void lock(int key) {
      if(this.key == key) {   
         isLocked = true;
      }
   }

   /**
    * Method purpose: Unlock coin object
    *
    * @param key  object will unlock if key (int) equals set key
    * @return void
    */
   public void unlock(int key) {
      if(this.key == key) {
         isLocked = false;
      }
   }

   /**
    * Method purpose: Returns if object is locked or not
    *
    * @return true if object is locked, false otherwise
    */
   public boolean locked() {
      return isLocked;
   }

   //-----------------------------------------------------------------
   //  Returns true if the current face of the coin is heads.
   //-----------------------------------------------------------------
   public boolean isHeads ()
   {
      return (face == HEADS);
   }
   //-----------------------------------------------------------------
   //  Returns the current face of the coin as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
      if(isLocked) {
         return "Locked";
      }

      String faceName;
      if (face == HEADS)
         faceName = "Heads";
      else
         faceName = "Tails";
      return faceName;
   }
}

