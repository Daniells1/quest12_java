package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Escreva uma letra");
        Scanner sc = new Scanner(System.in);
        char letra = sc.next().charAt(0);

        switch(letra){
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case'o':
            case 'O':
            case'u':
            case 'U':
                System.out.println("VOGAL");
                break;
            case '0':
            case '1':
            case '2':
            case '3':
            case'4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                System.out.println("Eu falei escreve uma letra!!");

                break;
            default:
                System.out.println("CONSOANTE");



        }
    }
    }

