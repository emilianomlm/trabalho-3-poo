import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;



public class Main {

    //será o que vai ser executado qaundo o programa for rodado
    public static void main(String[] args) throws IOException
    {
        //são criados os objetos das classes necessarias
        Usuario usuario = new Usuario();
        Livros livro = new Livros();
        Scanner input = new Scanner(System.in);

        //são declaradas variaáveis necessárias
        String disponibilidade = "1";
        String tipo = "0";
        String registro = "0";
        String nome = "emiliano maia lobo menezes";
        int resposta;
        boolean digitoIncorreto;

        //imprime o menu na tela
        System.out.println("\nO que voce deseja fazer?\n1 -> cadastrar livro texto\n2 -> cadastrar livro geral \n3-> cadastrar" +
                "  usuario aluno\n4 -> cadastrar usuario professor\n5 -> cadastrar usuario da comunidade\n6 -> listar livros" +
                "\n7 -> listar usuarios");

        //le o comando e determina o que será feito através de comandos "if"
        resposta = input.nextInt();

        //cada if é correspondente a um dos possíveis comandos entrados
        //a logica por traz do código está do arquivo READEME
        if(resposta == 1){
            tipo = "0";
            registro = input.nextLine(); //essa linha nao faz nada e sem ela o codigo não funciona corretamente. nao sei o motivo.
            System.out.println("Qual o registro do livro?");
            registro = input.nextLine();
            System.out.println("Qual o nome do livro?");
            nome = input.nextLine();
            livro.Cadastrar("C:\\Users\\emili\\Documents\\Livros.txt", disponibilidade, tipo, registro, nome);
        }
        if(resposta == 2){
            tipo = "1";
            registro = input.nextLine(); //essa linha nao faz nada e sem ela o codigo não funciona corretamente. nao sei o motivo.
            System.out.println("Qual o registro do livro?");
            registro = input.nextLine();
            System.out.println("Qual o nome do livro?");
            nome = input.nextLine();
            livro.Cadastrar("C:\\Users\\emili\\Documents\\Livros.txt", disponibilidade, tipo, registro, nome);
        }
        if(resposta == 3 || resposta == 4 || resposta == 5){
           //esses comandos "if" correspondem às variáveis equivalentes nos campos de cada tipo de usuário
            if(resposta == 3){
                tipo = "0";
                disponibilidade = "4";
            }
            if(resposta == 4){
                tipo = "1";
                disponibilidade = "6";
            }
            if(resposta == 5){
                tipo = "2";
                disponibilidade = "2";
            }
            registro = input.nextLine(); //essa linha nao faz nada e sem ela o codigo não funciona corretamente. nao sei o motivo.
            System.out.println("Qual o RG do cadastrante?");
            registro = input.nextLine();
            System.out.println("Qual o nome do cadastrante?");
            nome = input.nextLine();
            usuario.Cadastrar("C:\\Users\\emili\\Documents\\Usuarios.txt", disponibilidade, tipo, registro, nome);
        }
        if(resposta == 6){
            livro.Listar();
        }
        if(resposta == 7){
            usuario.Listar();
        }
    }
}




