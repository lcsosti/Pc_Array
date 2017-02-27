/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LucaSosti
 */
public class PC_Programmi {

    protected String nomePC[]; //array
    protected int numPC = 2; //contatore con n PC

    protected String nomeProgramma[];//array nome programma
    protected int giornoDefault[];//array giorno 
    protected int meseDefault[];//mese 
    protected int annoDefault[];//anno
    protected int numProgrammi = 2; //contatore n Programmi dentro Pc

    
    //
    public PC_Programmi() {
        //istanzo aaray
        this.nomePC = new String[this.numPC];
        this.nomePC[0] = "PC_00";//asseganato nome
        this.nomePC[1] = "PC_01";//ass. nome
        this.nomeProgramma = new String[this.numProgrammi];
        //istanzo array
        this.giornoDefault = new int[this.numProgrammi];
        this.meseDefault = new int[this.numProgrammi];
        this.annoDefault = new int[this.numProgrammi];
                
    }
                
//assegna nome,date programma
    public void pc_00() {
        int contatore_00 = 0;
        this.nomeProgramma[contatore_00] = "Spotify";
        this.giornoDefault[contatore_00] = 18;
        this.meseDefault[contatore_00] = 04;
        this.annoDefault[contatore_00] = 2016;
        contatore_00++;
        this.nomeProgramma[contatore_00] = "iTunes";
        this.giornoDefault[contatore_00] = 30;
        this.meseDefault[contatore_00] = 07;
        this.annoDefault[contatore_00] = 2015;
    }

    //assegna nome,date programma
    public void pc_01() {
        int contatore_01 = 0;
        this.nomeProgramma[contatore_01] = "NetBeans IDE";
        this.giornoDefault[contatore_01] = 20;
        this.meseDefault[contatore_01] = 01;
        this.annoDefault[contatore_01] = 2016;
        contatore_01++;
        this.nomeProgramma[contatore_01] = "uTorrent";
        this.giornoDefault[contatore_01] = 10;
        this.meseDefault[contatore_01] = 12;
        this.annoDefault[contatore_01] = 2010;
    }

}
