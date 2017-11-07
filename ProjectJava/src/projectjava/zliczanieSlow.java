/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectjava;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class zliczanieSlow {

    public static int numberOFWords(FileReader r) {
    Scanner skaner = new Scanner(r);
    int count = 0;
    while (skaner.hasNext()) {
        skaner.next();
        count++;
    }
    skaner.close();
    return count;
}

}
