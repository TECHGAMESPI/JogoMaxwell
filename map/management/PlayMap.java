package map.management;

import java.util.Scanner;
import map.graph.Vertice;
import character.*;

public class PlayMap {

    Scanner input = new Scanner(System.in);

    Jewel jewel = new Jewel();
    Maxwell maxwell = new Maxwell();
    MapManagement map = new MapManagement();

    String mission = "";
    boolean x = false;
    boolean y = false;
    boolean z = false;



    public PlayMap () {

       // verifica quando o jogo deve parar 

        while (true) {
            if (this.displayOptions().getCity() == map.nargumun){
                if (this.maxwell.getCoins() >= 10) {
                    System.out.println("Parabéns, você chegou ao seu objetivo, foi condecorado como rei");
                }

                else if (this.maxwell.getCoins() >= 4) {
                    System.out.println("Parabéns, você chegou ao seu objetivo, foi condecorado como lorder");
                }

                else {
                    System.out.println("Voceê perdeu!!, você chegou ao seu objetivo com poucas moedas, foi condecorado como servo");
                }
                break;
            }

            else if (this.jewel.getWeightJewel() > this.maxwell.getLimiarJewel()){
                System.out.println("Você perdeu!!! A joia ultrapassou o limite suportado por maxwell");
                break;
            }

            else if (this.maxwell.getCoins() <= 0) {
                System.out.println("Você perdeu!!! Maxwell ficou sem moedas de transportes, nao é possivel viajar");
                break;
            }
        }
        
    }

    public Vertice displayOptions () {

        // exibe as informaçoes no jogo

        System.out.println("\nCidade Atual: " + map.getCurrentCity().getCity().getName());
        System.out.println("Moedas: " + this.maxwell.getCoins());
        System.out.println("Poder da joia: " + this.jewel.getWeightJewel());
        System.out.println("Peso suportado da joia: " + this.maxwell.getLimiarJewel()  + "\n\n");

        // Vendedor: pergunta se quer trocar moeda por limiar de joia

        Scanner scan = new Scanner(System.in);
        System.out.println("\nMercador: Deseja trocar 1 moeda por 1 limiar de joia? [1 - sim / 2 - não]");
        System.out.print("> "); int opcao = scan.nextInt();

        if (opcao == 1) {
            this.maxwell.setCoins(this.maxwell.getCoins() - 1);
            this.maxwell.setLimiarJewel(this.maxwell.getLimiarJewel() + 1);
        }

        System.out.println(this.mission);

        // Se as missoes estiverem ativas, verifica se esta na cidade do objetivo, se estiver, a missao é finalizada
        
        if (this.maxwell.getStatusMission()) {

            if (this.x) {
                if (this.map.getCurrentCity().getCity() == map.grand_duchy_of_smalia) {
                    System.out.println("\nRecebeu as luvas do poder... Missão concluida!\n");
                    System.out.println("\nRecebeu 2 moedas e 2 limiar de joia\n");
                    this.maxwell.setCoins(this.maxwell.getCoins() + 2);
                    this.maxwell.setStatusMission(false);
                    this.maxwell.setLimiarJewel(this.maxwell.getLimiarJewel() + 2);;
                }
            }

            if (this.y) {
                if (this.map.getCurrentCity().getCity() == map.principality_of_kasya) {
                    System.out.println("\nRecebeu as botas do poder... Missão concluida!\n");
                    System.out.println("\nRecebeu 3 moedas e 1 limiar de joia\n");
                    this.maxwell.setCoins(this.maxwell.getCoins() + 2);
                    this.maxwell.setStatusMission(false);
                    this.maxwell.setLimiarJewel(this.maxwell.getLimiarJewel() + 2);;
                }
            }

            if (this.z) {
                if (this.map.getCurrentCity().getCity() == map.ubud) {
                    System.out.println("\nRecebeu a Gloria dos Retornados... Missão concluida!\n");
                    System.out.println("\nRecebeu 10 moedas e perdeu 4 limiar de joia\n");
                    this.maxwell.setCoins(this.maxwell.getCoins() + 10);
                    this.maxwell.setStatusMission(false);
                    this.maxwell.setLimiarJewel(this.maxwell.getLimiarJewel() - 4);;
                }
            }


            if (this.maxwell.getStatusMission()) {

                Scanner input = new Scanner (System.in);
                System.out.println("Deseja cancelar a missão? [1 - sim / 2 - não]");
                System.out.print("> "); int opc = input.nextInt();
                
                if (opc == 1) {
                    this.maxwell.setStatusMission(false);
                    System.out.println("Missão cancelada...");
                }
            }
            
    }

        // Verifica se na cidade possui uma missao

        if (map.getCurrentCity().getCity() == map.kingdom_of_kalb && !this.maxwell.getStatusMission()) {
            Scanner input = new Scanner(System.in);
            System.out.println("Esta cidade possui uma missão... Deseja aceitar? [1 - sim / 2 - não]");
            System.out.print("> "); int opc = input.nextInt();

            if (opc == 1) {
                this.maxwell.setCoins(this.maxwell.getCoins() + 4);
                this.maxwell.setStatusMission(true);
                System.out.println("\nMissão: Vá até a cidade de Grand Duchy of Smalia e receba as luvas do poder\n");
                this.mission = "\nMissão: Vá até a cidade de Grand Duchy of Smalia e receba as luvas do poder\n";
                this.x = true;
            }
        }

        if (map.getCurrentCity().getCity() == map.defalsia && !this.maxwell.getStatusMission()) {
            Scanner input = new Scanner(System.in);
            System.out.println("Esta cidade possui uma missão... Deseja aceitar? [1 - sim / 2 - não]");
            System.out.print("> "); int opc = input.nextInt();

            if (opc == 1) {
                this.maxwell.setCoins(this.maxwell.getCoins() + 6);
                this.maxwell.setStatusMission(true);
                System.out.println("\nMissão: Vá até a cidade de Principality of Kasya e receba as botas do poder\n");
                this.mission = "\nMissão: vá até a cidade de Principality of Kasya e receba as botas do poder\n";
                this.y = true;
            }
        }

        if (map.getCurrentCity().getCity() == map.vunese_of_empire && !this.maxwell.getStatusMission()) {
            Scanner input = new Scanner(System.in);
            System.out.println("Esta cidade possui uma missão... Deseja aceitar? [1 - sim / 2 - não]");
            System.out.print("> "); int opc = input.nextInt();

            if (opc == 1) {
                this.maxwell.setCoins(this.maxwell.getCoins() + 1);
                this.maxwell.setStatusMission(true);
                System.out.println("\nMissão: Vá até a cidade de Ubud e receba a Gloria dos retornados\n");
                this.mission = "\nMissão: Vá até a cidade de Ubud e receba a Gloria dos returnados\n";
                this.z = true;
            }
        }

        // Verifica qual a cidade que o jogador quer ird

        System.out.println("\nViajar: \n");

        for (int x = 1; x < map.getCurrentCity().getSizeSaida() + 1; x++) {
            System.out.println(x + " " + map.getCurrentCity().getListCity(x).getCity().getName() + " ( joia + "+ map.getCurrentCity().getListCity(x).getCity().getPowerJewel() + " )");
        }

        System.out.print("\n> "); map.opc = input.nextInt();
        map.setCurrentCity(map.getCurrentCity().getListCity(map.opc));

        this.jewel.setWeightJewel(map.getCurrentCity().getCity().getPowerJewel() + this.jewel.getWeightJewel());
        this.maxwell.setCoins(this.maxwell.getCoins() - 1);

        return map.getCurrentCity();
    }
}



