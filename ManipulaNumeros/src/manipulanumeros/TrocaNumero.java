
package manipulanumeros;


class TrocaNumero {

    static void trocaValoresEntreVariáveis(int x, int y) {
        int z;
        System.out.println("Antes da troca x="+x+", y="+y);
        z = x;
        x = y;
        y = z;
        System.out.println("Depois da troca x="+x+",y="+y);
                
    }
    
}
