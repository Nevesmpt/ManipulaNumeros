
package manipulanumeros;


class Banco {

    static void calculaCredito() {
        
        double n;
        double c;
        System.out.println("Insira o seu saldo médio");
        n = ManipulaNumeros.ler.nextDouble(); //camel case
        switch((int)n/200) { //switch so recebe inteiros ou caracteres
            case 0:
                //0-199
                System.out.println("O seu saldo é "+n+"Não tem direito a crédito");    //nao existe credito        
            break;
            case 1:
                //201-400
                c = n*0.20;
                System.out.println("O seu saldo é "+n+"O seu crédito é"+c);
            break;
            case 2:
                //401-600
                c = n*0.30;
                System.out.println("O seu saldo é "+n+"O seu crédito é"+c);
            break;          
            default:
                //+601
                c = n*0.40;
                System.out.println("O seu saldo é "+n+"O seu crédito é"+c);
    
        
    }
    
}
}