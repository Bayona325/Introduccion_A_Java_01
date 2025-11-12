package com.adrian;

// import java.util.Objects;
// import java.util.Random;
import java.util.Scanner;

import com.adrian.ejercicios.bank.BankAccount;

public class Main {
    final static int maxRange = 10000;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        var account = new BankAccount();
        while (flag) {
            System.out.println("""
                    ++++++++++++++  MENU  ++++++++++++++
                            ** Ingrese la opcion deseada **
                    1. Consignar
                    2. Retirar
                    3. Ver Saldo
                    0. Salir
                    """);
            switch (scan.nextInt()) {
                case 1:
                    System.out.println("Ingrese el monto en numeros enteros a depositar: ");
                    account.deposit(scan.nextInt());
                    break;
                case 2:
                    System.out.println("Ingrese el monto en numeros enteros a retirar: ");
                    account.withdraw(scan.nextInt());
                    break;
                case 3:
                    System.out.println("Su Saldo es: $"+account.showBalance());
                    break;
                case 0:
                    // Salir
                    flag = false;

                    break;
                default:
                    System.out.println("Ingrese una opcion valida......\nPresione Enter para continuar.");
                    scan.nextLine();
                    break;
            }
        }
        scan.close();
    }
}