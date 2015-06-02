import java.io.*;
import java.util.Scanner;

/**
 * Created by emili on 6/1/2015.
 */
public class ItensSalvosEmArquivos {

    //devolve o número de linhas de um arquivo
    public int getNumLinhas(String localDoArquivo) throws IOException{
        int retorno = 0;
        try
        {
            int numDeLinhas = 0;
            int i = 0;

            //cria os objetos pra abrir e manipular o arquivo
            FileReader arqReader = new FileReader(localDoArquivo);
            BufferedReader lerArq = new BufferedReader(arqReader);

            String linha = lerArq.readLine();

            //percorre as linhas enquanto salva o número de linhas percorridas na variável de retorno
            //null é a condição de parada pois é o que será lido quando não houverem linhas no arquivo
            while (linha != null){
                numDeLinhas++;
                linha = lerArq.readLine();
            }
            arqReader.close();
            retorno = numDeLinhas;

        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
        }
        return retorno;
    }

    //retorna as linahs de um alquivo separadas em uma string cada
    public String getLinhas(String localDoArquivo, int numLinha) throws IOException {

        //cria uma string do tamanho de linhas do arquivo a ser manipulado
        String[] itensSeparadosParQuebraDeLinha = new String[getNumLinhas("C:\\Users\\emili\\Documents\\Usuarios.txt")];
        try
        {
            int i = 0;

            //cria os objetos pra abrir e manipular o arquivo
            FileReader arqReader = new FileReader(localDoArquivo);
            BufferedReader lerArq = new BufferedReader(arqReader);

            String linha = lerArq.readLine();

            //atribue cada linha do arquivo a uma string
            for(i = 0; i < getNumLinhas(localDoArquivo); i++)
            {
                itensSeparadosParQuebraDeLinha[i] = linha;
                linha = lerArq.readLine(); // lê da segunda até a última linha
                System.out.printf("\n%s", itensSeparadosParQuebraDeLinha[i]);
            }
            arqReader.close();

        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
        }
        return itensSeparadosParQuebraDeLinha[numLinha];
    }

    //retorna um campo específico de uma linha do arquivo
    public String getCamposDaLinha(String linha, int campoNaLinha, String localDoArquivo) {

        String codigo;

        String[] itemsSeparadosPorVirgula = linha.split(",");
        codigo = itemsSeparadosPorVirgula[campoNaLinha];

        return codigo;
    }

    public void Listar(String localDoArquivo) throws IOException{

        System.out.printf("\nEsses sao os usuarios cadastrados:\n");

        try
        {
            FileReader arqReader = new FileReader(localDoArquivo);
            BufferedReader lerArq = new BufferedReader(arqReader);

            String linha = lerArq.readLine();

            while (linha != null)
            {
                System.out.printf("%s\n", linha);
                linha = lerArq.readLine(); // lê da segunda até a última linha
            }
            arqReader.close();

        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
        }
        System.out.println();
    }

    //cria uma nova linha num arquivo cujo local é passado pro parâmetro bem como os campos para cada subtipo de usuário ou livro
    public void Cadastrar(String localDoArquivo, String status, String tipo, String codigo, String nome) throws IOException {

        int i;

        //cria os objetos necessários para criar e manipular arquivos
        FileWriter arquivoAlunos = new FileWriter(localDoArquivo, true);
        PrintWriter gravarArquivoAlunos = new PrintWriter(arquivoAlunos);

        //grava os campos separados por virgulas na linha do arquivo
        gravarArquivoAlunos.printf("%n%s,%s,%s", status, tipo, codigo);

        //separa a string q com o nome do livro ou usuário em um vetor de strings com as partes do nome
        String[] vetorDeStringDoNome = nome.split(" ");

        //grava as partes do nome separando-as com vírgulas
        for(i = 0; i < vetorDeStringDoNome.length; i++){
            gravarArquivoAlunos.printf(",%s", vetorDeStringDoNome[i]);
        }

        gravarArquivoAlunos.printf(".");
        arquivoAlunos.close();
    }

    //busca o campo "registro"
    public String[] busca(String localDoArquivo, String registro) throws IOException {
        String[] itensSeparadosParQuebraDeLinha = new String[getNumLinhas("C:\\Users\\emili\\Documents\\Usuarios.txt")];
        try
        {
            int i = 0;

            //declara os objetos que abrem e manipulam arquivos
            FileReader arqReader = new FileReader(localDoArquivo);
            BufferedReader lerArq = new BufferedReader(arqReader);

            String linha = lerArq.readLine();

            //testa se o campo das linhas do arquivo é igual ao parârametro passado
            for(i = 0; i < getNumLinhas(localDoArquivo); i++)
            {
                itensSeparadosParQuebraDeLinha[i] = linha;
                if(itensSeparadosParQuebraDeLinha[i] == registro){
                    break;
                }
                linha = lerArq.readLine();
                System.out.printf("\n%s", itensSeparadosParQuebraDeLinha[i]);
            }
            arqReader.close();

        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
        }
        //retorna o item
        return itensSeparadosParQuebraDeLinha;
    }
}