/**
* Program Name:        CoinRunnerLN.java
* Program Purpose:     runner class for Lockable project
* Date Created:        11/29/2016
* Last Modified:       11/30/2016
*
* @author     Liam Nickell
* @version    1.0.0
*/

public class CoinRunnerLN {

    public static void main(String[] args) {
        
        Coin coin = new Coin();

        coin.setKey(314271);
        System.out.println(coin);
        System.out.println(coin.flip());
        System.out.println(coin);
        coin.lock(314271);
        System.out.println(coin.flip());
        System.out.println(coin);
        coin.unlock(428259); // incorrect code
        System.out.println(coin.flip());
        System.out.println(coin);
        coin.unlock(314271);
        System.out.println(coin.flip());
        System.out.println(coin);

    }

}