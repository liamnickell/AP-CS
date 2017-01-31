/**
* Program Name:        LockableLN.java
* Program Purpose:     interface for LockableLN
* Date Created:        11/29/2016
* Last Modified:       11/30/2016
*
* @author     Liam Nickell
* @version    1.0.0
*/

public interface LockableLN {

    public void setKey(int key);
    public void lock(int key);
    public void unlock(int key);
    public boolean locked();

}