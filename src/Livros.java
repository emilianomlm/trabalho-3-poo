import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by emili on 5/31/2015.
 */
public class Livros extends ItensSalvosEmArquivos{
    public void Listar() throws IOException{

        System.out.printf("\nEsses sao os livros cadastrados:\n");

        try
        {
            //declara os objetos das classes do java necess�rias para criar e manipular arquivos
            FileReader arqReader = new FileReader("C:\\Users\\emili\\Documents\\Livros.txt");
            BufferedReader lerArq = new BufferedReader(arqReader);

            String linha = lerArq.readLine();

            while (linha != null)//quando o arquivo chegar ao fim ser� lido "null" (n�o haver� mais linhas)
            //por isso essa � a condi��o de parada
            {
                System.out.printf("%s\n", linha);//imprime a linha atual
                linha = lerArq.readLine(); //// a linha seguinte at� chegar na condi��o de parada
            }
            arqReader.close(); //fecha o arquivo

        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
        }
    }
}
