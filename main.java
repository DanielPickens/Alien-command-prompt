import java.util.*;
import java.io.*;
import java.math.*;

/**
 * My planet is being attacked by slimy reptilian aliens.
 * <---
 * .
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // game loop
        while (true) {
            String enemy1 = in.next(); // name of enemy 1
            int dist1 = in.nextInt(); // distance to enemy 1
            String enemy2 = in.next(); // name of enemy 2
            int dist2 = in.nextInt(); // distance to enemy 2

            // 
            // To debug: System.err.println;

            // Display enemy1 name when enemy1 is the closest, enemy2 otherwise
            if(dist1 < dist2) {
                System.out.println(enemy1);
            } else {
                System.out.println(enemy2);
            }
        }
    }
}
