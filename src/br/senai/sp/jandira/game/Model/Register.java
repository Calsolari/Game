package br.senai.sp.jandira.game.Model;

import java.util.Scanner;


public class Register {
    /* Instancia Scanner*/
    Scanner teclado = new Scanner(System.in);

    /*Instancia player */
    Player player = new Player();

    Output output = new Output();

    /*Instancia enemy */
    Enemy enemy = new Enemy();

    public static void register() {
    }

    public void BothRegister() {

        PlayerRegister();
        EnemyRegister();

    }

    public void PlayerRegister(){
        System.out.println("-------------Cadastro Player---------------");
        System.out.print("Qual o seu nome: ");
        player.name = teclado.nextLine();
        System.out.print("Escolha sua skin (red - green - blue): ");
        player.skin = teclado.nextLine();
        System.out.println("----------Cadastro Realizado---------------");

        output.PrintPlayer(player);
    }
    public void EnemyRegister(){
        System.out.println("-------------Cadastro Enemy---------------");
        System.out.print("Qual o seu nome: ");
        enemy.name = teclado.nextLine();
        System.out.print("Escolha sua skin (red - green - blue): ");
        enemy.skin = teclado.nextLine();
        System.out.println("----------Cadastro Realizado---------------");
        output.PrintEnemy(enemy);
    }
    public void Decision(){

        String decision;

        System.out.println("----------- Seja Bem vindo!! -----------------");
        System.out.println("O que deseja cadastrar? (Player - Enemy - Ambos)");
        decision = teclado.nextLine();

        switch (decision){

            case "Player":
                PlayerRegister();
                break;

            case "Enemy":
                EnemyRegister();
                break;

            case "Ambos":
                BothRegister();
                break;

            default:
                System.out.println("Escolha uma opção válida");


        }
    }
}
