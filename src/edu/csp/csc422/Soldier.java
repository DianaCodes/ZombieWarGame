/*
 * Concordia CSC422 - Zombie War Group Assignment.
 * by Diana Arita, Rob Nelson, Andrew Nielsen, Dean Peterson.
 * 2019-02-10
 */
package edu.csp.csc422;

public class Soldier extends Survivor {
    public static int count = 0;
    
    public Soldier() {
        setName("Soldier " + count++);
        setHealth(100);
    }

}
