package com.github.mayconmoraesdm.main;

import com.github.mayconmoraesdm.entidades.Acao;
import com.github.mayconmoraesdm.entidades.Contato;
import com.github.mayconmoraesdm.entidades.Entidade;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws SQLException {

        Acao a = new Acao();
        Scanner tecla = new Scanner(System.in);
        int opcao=0;

        do{

            System.out.println("============================");
            System.out.println("MENU AGENDA 2.0 BY JOAO PEDRO");
            System.out.println("DIGITE ALGUMA DAS OPÇÕES SEGUINTES PARA FAZER AS OPERAÇÕES");
            System.out.println("[1]-Listar Todos os Contatos");
            System.out.println("[2]-Listar algum Contato especifico pelo Id");
            System.out.println("[3]-Listar algum Contato especifico pelo Nome");
            System.out.println("[4]-Inserir novo contato");
            System.out.println("[5]-Alterar contato");
            System.out.println("[6]-Excluir Contato");
            System.out.println("[7]-Sair");
            System.out.println("============================");
            opcao = tecla.nextInt();
            if(opcao==1){
                a.listaTodos();
                voltar(); // metodo que verifica se usuario quer continuar esta como static no main
            }else if(opcao==2){
                a.lista();
                 voltar();

            } else if (opcao==3){
                a.listaNome();
                voltar();
            } else if(opcao==4) {
                 a.insere();
                 voltar();
             }else if(opcao==5){
                a.altera();
                 voltar();
            }else if(opcao==6){
                a.exclui();
                 voltar();
            };



        }while(opcao!=7);


    }




    public static void voltar() {
        Scanner tecla = new Scanner(System.in);
        System.out.println("Continuar as operações?");
        System.out.println("Sim =1");
        System.out.println("Não =2");
        int op = tecla.nextInt();
        if(op==2){
            System.out.println("Voce escolheu finalizar as operações até mais :D");
            System.exit(0);
        }

    }





}
