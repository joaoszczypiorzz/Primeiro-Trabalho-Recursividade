import java.util.Scanner; //importando biblioteca para o Scanner


public class Main{
    public static void main(String[] args) {

        int N; //variavel de entrada de dados do usuário
        Scanner read = new Scanner(System.in);


        System.out.println("Informe quantos números você deseja que seu array tenha: ");
        N = read.nextInt();
        int vetor[] = new int [N];


        //chamando função recursiva para preencher o vetor
        preencherVetor(vetor, 0, read);


        System.out.println("Vetor preenchido: ");
        //funcao recursiva para exibir o vetor na tela
        exibirVetor(vetor, 0);
    }


    /**
     * Função que preenche o meu vetor pedinndo entradas de dados do usuário e armazenando elas dentro do Vetor,
     * Vetor esse que tem o seu tamanho também definido pelo usuário
     * @param Vetor Passando vetor como referencia para a função saber onde guardar os inputs do usuário
     * @param posicao A possição serve mais como o controlador dentro da minha função
     * @param read passando o Scanner para não ter que definir outro dentro da função
     * @author João Szczypior
     */
    public static void preencherVetor(int [] Vetor, int posicao, Scanner read){


        if(posicao == Vetor.length) { //condição de parada
            return;
        }
        System.out.println("Digite um Número para a posição " + posicao);
        Vetor [posicao] = read.nextInt();


        preencherVetor(Vetor,  posicao + 1, read );


    }

    /**
     * Função para exibir o Vetor na tela ao usuário
     * @param Vetor passando o vetor como parametro
     * @param posicao  Essa refrencia vem para servir como uma especie de contador
     */
    public static void exibirVetor(int [] Vetor, int posicao){


        if(posicao == Vetor.length){
            return;
        }
        System.out.println("vetor[" +posicao+"] = " + Vetor[posicao]);

        exibirVetor(Vetor, posicao + 1);
    }


}