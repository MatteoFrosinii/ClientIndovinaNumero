package com.example;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class App 
{
    public static void main( String[] args )
    {
        try {
            Socket s = new Socket("localhost", 2750);

            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));
            DataOutputStream out = new DataOutputStream(s.getOutputStream());

            System.out.println("Scegli la difficolta:"+'\n');
            System.out.println("1 - indovina un numero da 1 a 10"+'\n');
            System.out.println("2 - indovina un numero da 1 a 50"+'\n');
            System.out.println("3 - indovina un numero da 1 a 100"+'\n');

            out.writeBytes(tastiera.readLine()+'\n');
            String risposta;

            do {
                System.out.println("Prova ad indovinare il numero: "+'\n');
                out.writeBytes(tastiera.readLine()+'\n');
                risposta = in.readLine()+'\n';
                if (risposta.equals("I"+'\n')){
                    System.out.println("Hai indovinato in " + in.readLine()  + " tentativi");
                    break;
                } else if (risposta.equals("m"+'\n')){
                    System.out.println("Hai sbagliato. Hint: il numero da indovinare è più piccolo di quello inserito");
                } else {
                    System.out.println("Hai sbagliato. Hint: il numero da indovinare è più grande di quello inserito");
                }
            } while (true);

            s.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
