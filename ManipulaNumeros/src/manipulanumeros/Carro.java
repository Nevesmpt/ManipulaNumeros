
package manipulanumeros;


class Carro {

    static void calculaValorFinal() {
        double n;
        System.out.println("Insira custo de fábrica");
        n = ManipulaNumeros.ler.nextDouble(); //camel case
        n = n + (n*0.28) + (n*0.45);// pontos
        System.out.println("O custo final é "+n);
        
        
    }
    
}// nao esquecer chavetas
