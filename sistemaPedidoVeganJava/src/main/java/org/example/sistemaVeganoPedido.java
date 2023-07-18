package org.example;

import java.io.IOException;
import java.util.Scanner;

public class sistemaVeganoPedido {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int numOrders;

        System.out.print(("Insira o número de pedidos: "));
        numOrders = ler.nextInt();

        for(int i = 1; i < numOrders + 1; i++){
            String prato;
            int calorias;
            String res = "";
            char question;

            System.out.print("Insira o nome do prato desejado: ");
            prato = ler.next();

            System.out.print("Quantas calorias possui o prato: ");
            calorias = ler.nextInt();

            System.out.print("O cliente é vegano? (s/n): ");
            question = (char)System.in.read();

            if(question == 's'){
                res = "É VEGANO";
            } else if (question == 'n') {
                res = "NÃO-VEGANO";
            }

            System.out.printf("Pedido %d : %s (%s) - %d calorias", i, prato, res, calorias);
            System.out.println("");
        }


    }
}
