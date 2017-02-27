/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*chiede la postazione, stampa i programmi della postazione, effettua il cambiamento della data del programma desiderato
 stampa il programma con la data dell'aggiornamento più vecchia*/

/**
 *
 * @author LucaSosti
 */
import java.io.*;
import java.util.*;

public class First {

    public static void main(String args[]) {
        
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(input);
        GregorianCalendar dataAttuale = new GregorianCalendar();

        PC_Programmi pc = new PC_Programmi(); //istanziato la classe con l'oggetto
        //crate variabili
        int conPostazione = 0;
        int conProgrammi = 0;
        String postazione = null;
        String nomProgramma = null;
       
        int giorno = dataAttuale.get(GregorianCalendar.DATE);
        int mese = dataAttuale.get(GregorianCalendar.MONTH) + 1;
        int anno = dataAttuale.get(GregorianCalendar.YEAR);
        int annoMinore[] = new int[pc.numPC];//viene asegnato l'anno minore
        String nomeMinore[] = new String[pc.numPC];//viene assegnato il nome del programma con la data minore

        System.out.println("Benvenuto.");
        System.out.println("Prego inserisca la sua postazione: ");
        //stampa le postazioni
        while (conPostazione < pc.numPC) {
            System.out.println(pc.nomePC[conPostazione]);
            conPostazione++;
        }
        //inserimento postazione desiderata
        try {
            postazione = tastiera.readLine();
        } catch (IOException e) {
            System.err.println("Errore");
        }
        //confronto postazione
        if (postazione.equals("PC_00")) {
            pc.pc_00();
            //stampa i programmi della postazione desiderata
            System.out.println("I programmi di questa postazione sono: ");
            while (conProgrammi < pc.numProgrammi) {
                System.out.println(pc.nomeProgramma[conProgrammi]);
                conProgrammi++;
            }
        } else {
            if (postazione.equals("PC_01")) {
                pc.pc_01();
                //stampa i programmi della postazione desiderata
                System.out.println("I programmi di questa postazione sono: ");
                while (conProgrammi < pc.numProgrammi) {
                    System.out.println(pc.nomeProgramma[conProgrammi]);
                    conProgrammi++;
                }
            } else {
                //stampa un errore se la postazione non esiste oppure è sbagliata
                System.out.println("Mi scusi, ma la postazione al momento non è disponibile oppure non esiste.");
                System.out.println("Grazie.");
                System.exit(0);//chiudo il programma
            }
        }
        //inserimento programma desiderato
        System.out.println("Prego, inserisca il programma che vuole cambiare la data di aggiornamento: ");
        try {
            nomProgramma = tastiera.readLine();
        } catch (IOException e) {
            System.err.println("Errore");
        }
        conProgrammi = 0;
        while (conProgrammi < pc.numProgrammi) {
            if (nomProgramma.equals(pc.nomeProgramma[conProgrammi])) {
                System.out.println("La data del programma selezionato sarà modificato automaticamente attraverso la data corrente.");
                
                break;//esco dal ciclo

            }
            //stama l'errore se il nome del programma non esiste oppure è sbagliato
            if (conProgrammi == 1) {
                System.out.println("Mi scusi ma ha sbagliato ha scrivere il programma oppure il programma non esisite.");
                System.out.println("Grazie.");
                System.exit(0);//chiudo il programma
            }
            conProgrammi++;

        }//


        
        pc.giornoDefault[conProgrammi] = giorno;
        pc.meseDefault[conProgrammi] = mese;
        pc.annoDefault[conProgrammi] = anno;
        System.out.println("La data dell'aggiornamento che è stato creato automaticamente è: " + pc.giornoDefault[conProgrammi] + "/" + pc.meseDefault[conProgrammi] + "/" + pc.annoDefault[conProgrammi] + ".");
        System.out.println("Questa data è riferita al programma: " + pc.nomeProgramma[conProgrammi] + ".");
        //}

        conPostazione = 0;
        annoMinore[conPostazione] = pc.annoDefault[0];
        nomeMinore[conPostazione] = pc.nomeProgramma[0];
        conProgrammi = 1;
        while (conProgrammi < pc.numProgrammi) {
            if (annoMinore[conPostazione] > pc.annoDefault[conProgrammi]) {
                annoMinore[conPostazione] = pc.annoDefault[conPostazione];
                nomeMinore[conPostazione] = pc.nomeProgramma[conPostazione];
                conProgrammi++;
            }

            if (postazione.equals("PC_01")) {
                pc.pc_00();
            }
            if (postazione.equals("PC_00")) {
                pc.pc_01();
            }

            conPostazione++;
            annoMinore[conPostazione] = pc.annoDefault[0];
            nomeMinore[conPostazione] = pc.nomeProgramma[0];
            conProgrammi = 1;
            while (conProgrammi < pc.numProgrammi) {
                if (annoMinore[conPostazione] > pc.annoDefault[conProgrammi]) {
                    annoMinore[conPostazione] = pc.annoDefault[conPostazione];
                    nomeMinore[conPostazione] = pc.nomeProgramma[conPostazione];
                }
                conProgrammi++;
            }

            if (annoMinore[0] > annoMinore[1]) {
                System.out.println("Il programma con la data di aggiornamento più vecchia è: " + nomeMinore[1]);
            } else {
                System.out.println("Il programma con la data di aggiornamento più vecchia è: " + nomeMinore[0]);
            }

        }
    }
}
