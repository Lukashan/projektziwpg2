/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectjava;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author student
 */
public class wczytanie_pliku {
    public void wczytaj_plik() throws IOException{
    try{
     System.out.println("Podaj ścieżkę dostępu do pliku: ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String sciezka = br.readLine();
            FileReader in = new FileReader(sciezka);
}
    catch(FileNotFoundException e) {
            System.out.println("Plik nie istnieje");
            System.exit(1);
}
    }
}
