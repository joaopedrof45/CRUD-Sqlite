package com.github.mayconmoraesdm.entidades;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Acao {


    public  void insere() {

        Scanner tecla = new Scanner(System.in);
        System.out.println("Inserindo contato");
        try {
            Contato contato = new Contato();
            System.out.println("Digite o nome");
            String nome=tecla.nextLine();

            System.out.println("Digite o primeiro telefone");
            String tel1=tecla.nextLine();

            System.out.println("Digite o segundo telefone");
            String tel2=tecla.nextLine();

            System.out.println("Digite o primeiro celular");
            String cel1=tecla.nextLine();

            System.out.println("Digite o segundo celular");
            String cel2=tecla.nextLine();
            System.out.println("Digite o Email");
            String email=tecla.nextLine();


            //inserindo na instancia contato.
            contato.setNome(nome);
            contato.setTelefone(tel1);
            contato.setTelefone2(tel2);
            contato.setCelular(cel1);
            contato.setCelular2(cel2);
            contato.setEmail(email);
            //e depois chamando o metodo que faz a inserção da instancia  realmente no banco
            contato.insere();
            System.out.println("==============================");
            System.out.println("Contato Inserido com Sucesso");
            System.out.println("==============================");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void listaTodos() throws SQLException {
        System.out.println("Listando  Todos Contatos");
        Contato contato = new Contato();
        List<Contato> contatos = contato.busca();
        if (contatos.size() == 0) {
            System.out.printf("Nenhum contato na agenda!");
        } else {
            contatos.forEach(c -> System.out.println(String.format("Id: %d\nNome: %s\nTelefone: %s\nTelefone2: %s\nCelular: %s\nCelular2: %s\nE-mail: %s\n" ,
                    c.getId(), c.getNome(), c.getTelefone(),c.getTelefone2(), c.getCelular(),c.getCelular2(), c.getEmail())));
        }
    }



    public void lista() {
        System.out.println("digite um id para buscar:");
        Scanner tecla = new Scanner(System.in);
        int id = tecla.nextInt();
        System.out.println("Listando o Contato pelo Id");
        Contato c = new Contato(id);
        System.out.println(String.format("Id: %d\nNome: %s\nTelefone: %s\nTelefone2: %s\nCelular: %s\nCelular2: %s\nE-mail: %s\n",
                c.getId(), c.getNome(), c.getTelefone(), c.getTelefone2(), c.getCelular(), c.getCelular2(), c.getEmail()));
    }

    public void listarnome() throws SQLException {
        System.out.println("digite o nome a ser buscado:");
        Scanner tecla = new Scanner(System.in);
        String nome = tecla.nextLine();
        System.out.println("Listando o Contato Pelo nome");
        Contato c = new Contato();
        c.buscar(nome);
        System.out.println(String.format("Id: %d\nNome: %s\nTelefone: %s\nTelefone2: %s\nCelular: %s\nCelular2: %s\nE-mail: %s\n",
                c.getId(), c.getNome(), c.getTelefone(), c.getTelefone2(), c.getCelular(), c.getCelular2(), c.getEmail()));
    }



    public  void altera() {

        Scanner tecla = new Scanner(System.in);
        try {
            System.out.println("Alterando contato");
            System.out.println("Digite o id a ser alterado");
            int id = tecla.nextInt();
            Contato contato = new Contato(id);
            System.out.println("digite o número para qual campo alterar:");
            System.out.println("[1]Todos");
            System.out.println("[2]:nome");
            System.out.println("[3]:Telefone 1");
            System.out.println("[4]:Telefone 2");
            System.out.println("[5]:Celular 1");
            System.out.println("[6]:Celular 2");
            System.out.println("[7]:Email");
            int escolha = tecla.nextInt();

            switch (escolha){
                case 1:
                    tecla.nextLine();
                    System.out.println("digite o nome");
                    String nome = tecla.nextLine();
                    System.out.println("digite o Telefone 1");
                    String telefone1 = tecla.nextLine();
                    System.out.println("digite o Telefone 2");
                    String telefone2 = tecla.nextLine();
                    System.out.println("digite o Celular 1");
                    String celular1 = tecla.nextLine();
                    System.out.println("digite o Celular 2");
                    String celular2 = tecla.nextLine();
                    System.out.println("digite o Email");
                    String email = tecla.nextLine();

                    contato.setNome(nome);
                    contato.setTelefone(telefone1);
                    contato.setTelefone2(telefone2);
                    contato.setCelular(celular1);
                    contato.setCelular2(celular2);
                    contato.setEmail(email);
                    contato.altera();

                    System.out.println("==============================");
                    System.out.println("Contato Alterado com Sucesso");
                    System.out.println("==============================");
                    break;
                case 2:
                    System.out.println("digite o nome");
                    tecla.nextLine();
                    String nome1 = tecla.nextLine();
                    contato.setNome(nome1);
                    contato.altera();
                    System.out.println("==============================");
                    System.out.println("Contato Alterado com Sucesso");
                    System.out.println("==============================");
                    break;
                case 3:
                    System.out.println("digite o Telefone 1");
                    tecla.nextLine();
                    String telefone11 = tecla.nextLine();
                    contato.setTelefone(telefone11);
                    contato.altera();
                    System.out.println("==============================");
                    System.out.println("Contato Alterado com Sucesso");
                    System.out.println("==============================");
                    break;
                case 4:
                    System.out.println("digite o Telefone 2");
                    tecla.nextLine();
                    String telefone22 = tecla.nextLine();
                    contato.setTelefone2(telefone22);
                    contato.altera();
                    System.out.println("==============================");
                    System.out.println("Contato Alterado com Sucesso");
                    System.out.println("==============================");
                    break;
                case 5:
                    System.out.println("digite o Celular 1");
                    tecla.nextLine();
                    String celular11 = tecla.nextLine();
                    contato.setCelular(celular11);
                    contato.altera();
                    System.out.println("==============================");
                    System.out.println("Contato Alterado com Sucesso");
                    System.out.println("==============================");
                    break;
                case 6:
                    System.out.println("digite o Celular 2");
                    tecla.nextLine();
                    String celular22 = tecla.nextLine();
                    contato.setCelular2(celular22);
                    contato.altera();
                    System.out.println("==============================");
                    System.out.println("Contato Alterado com Sucesso");
                    System.out.println("==============================");
                    break;
                case 7:
                    System.out.println("digite o Email");
                    tecla.nextLine();
                    String email1 = tecla.nextLine();
                    contato.setEmail(email1);
                    contato.altera();
                    System.out.println("==============================");
                    System.out.println("Contato Alterado com Sucesso");
                    System.out.println("==============================");
                    break;


            }






        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



    public  void exclui() {
        Scanner tecla = new Scanner(System.in);
        try {
            System.out.println("Excluindo contato");
            System.out.println("Digite o id a ser excluido");
            int id = tecla.nextInt();
            Contato contato = new Contato(id);
            contato.exclui();
            System.out.println("==============================");
            System.out.println("Contato Excluido com Sucesso");
            System.out.println("==============================");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



}
