/**
* File Name:        ParameterPlayRunnerLN.java
* File Purpose:     runner to test static class methods
* Date Created:     10/11/2016
* Last Updated:     10/12/2016
*
* @author   Liam Nickell
* @version  1.0.1
*/

public class ParameterPlayRunnerLN {

    public static void main(String[] args) {
        // Testing sum method
        System.out.println("ParameterPlayLN.sum(50): " 
                            + ParameterPlayLN.sum(50));
        System.out.println("ParameterPlayLN.sum(-20): " 
                            + ParameterPlayLN.sum(-20));
        System.out.println("ParameterPlayLN.sum(120): " 
                            + ParameterPlayLN.sum(120) + "\n");

        // Testing maxOfTwo method
        System.out.println("ParameterPlayLN.maxOfTwo(10, 50): " 
                            + ParameterPlayLN.maxOfTwo(10, 50));
        System.out.println("ParameterPlayLN.maxOfTwo(37, 21): "
                            + ParameterPlayLN.maxOfTwo(37, 21));
        System.out.println("ParameterPlayLN.maxOfTwo(10, 50): "
                            + ParameterPlayLN.maxOfTwo(-24, -27) + "\n");
        
        // Testing larger method
        System.out.println("ParameterPlayLN.larger(20, 10): "
                            + ParameterPlayLN.larger(20.4, 10.2));
        System.out.println("ParameterPlayLN.larger(4, 13): "
                            + ParameterPlayLN.larger(4.7, 13.1));
        System.out.println("ParameterPlayLN.larger(7, 7): "
                            + ParameterPlayLN.larger(7.0, 7.0) + "\n");

        // Testing evenlyDivisible method
        System.out.println("ParameterPlayLN.evenlyDivisible(50, 5): "
                            + ParameterPlayLN.evenlyDivisible(50, 5));
        System.out.println("ParameterPlayLN.evenlyDivisible(31, 8): "
                            + ParameterPlayLN.evenlyDivisible(31, 8));
        System.out.println("ParameterPlayLN.evenlyDivisible(0, 42): "
                            + ParameterPlayLN.evenlyDivisible(0, 42) + "\n");

        // Testing multiConcat method
        System.out.println("ParameterPlayLN.multiConcat(\"ayy lmao\", 4): "
                            + ParameterPlayLN.multiConcat("ayy lmao", 4));
        System.out.println("ParameterPlayLN.multiConcat(\"APCS_\", 2): "
                            + ParameterPlayLN.multiConcat("APCS_", 2));
        System.out.println("ParameterPlayLN.multiConcat(\"wow\", -5): "
                            + ParameterPlayLN.multiConcat("wow", -5) + "\n");

        // Testing isAlpha method
        System.out.println("ParameterPlayLN.isAlpha(\'x\'): "
                            + ParameterPlayLN.isAlpha('x'));
        System.out.println("ParameterPlayLN.isAlpha(\'A\'): "
                            + ParameterPlayLN.isAlpha('A'));
        System.out.println("ParameterPlayLN.isAlpha(\'7\'): "
                            + ParameterPlayLN.isAlpha('7') + "\n");
    }

}