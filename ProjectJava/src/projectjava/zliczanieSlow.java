/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectjava;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

/**
 *
 * @author student
 */
public class zliczanieSlow {

    public static int numberOfWords(FileReader r) throws IOException {
        LineNumberReader ln = new LineNumberReader(r);
        int count = 0;
        while (ln.readLine() != null) {
            count++;
        }
        return count;
    }

}
