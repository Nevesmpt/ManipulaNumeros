
package manipulanumeros;

import java.util.Scanner;


public class ManipulaNumeros {

    public static Scanner ler = new Scanner(System.in);
    public static int x, y;
    public static void main(String[] args) {
        
        int op;
        do{
            System.out.println("Menu de operação com numeros");
            System.out.println("1 - Maior de 2 numeros");
            System.out.println("2 - Ordenar valores decrescentes");
            System.out.println("3 - Soma ímpares multiplica pares");
            System.out.println("4 - Troca valores entre variaveis");
            System.out.println("5 - Compara números");
            System.out.println("6 - Calcular média de aluno");
            System.out.println("7 - Calcular custo de carro");
            System.out.println("8 - Calcular crédito");
            
            System.out.println("0 - Sair");
            System.out.println("Seleccione a opção pretendida");
            op = ler.nextInt();
            switch(op){
                case 0: break;
                case 1:
                    lerValores("Insira um valor", "Insira outro valor");
                    MaiorNumero.maior2(x,y);
                    break;
                case 2:
                    do{
                        ler1Valor("Insira um valor");
                    }while(x<=0);
                    NumeroDecrescente.ordenaDecrescente(x);
                    break;
                case 3: somaImparesMultiplicaPares();break;
                case 4: 
                    lerValores("Insira um valor", "Insira outro valor");
                    TrocaNumero.trocaValoresEntreVariáveis(x,y);
                    break;
                case 5:
                    lerValores("Insira um valor", "Insira outro valor");
                    ComparaNumero.comparar2Valores(x,y);
                    break;
                case 6:
                    MediaAluno.registaNotas();
                    break;
                case 7:
                    Carro.calculaValorFinal();
                    break;
                case 8:
                    Banco.calculaCredito();
                    break;
                    
                
                default: System.out.println("Insira opção válida");
            }
            
        }while(op!=0);
    }

    private static void lerValores(String s1, String s2) {
        System.out.println(s1);
        x = ler.nextInt();
        System.out.println(s2);
        y = ler.nextInt();
    }

    private static void ler1Valor(String s1) {
        System.out.println(s1);
        x = ler.nextInt();
    }

    private static void somaImparesMultiplicaPares() {
        int soma = 0;
        long multiplica = 1;
        x = 1;        
    for (; x<=30; x++){
        if (x%2!=0)
            soma = soma + x;
        else
            multiplica = multiplica*x;
    }
    System.out.println(soma);
    System.out.println(multiplica);
    
                      
           
    
    
            
       
         
    }
    
}
