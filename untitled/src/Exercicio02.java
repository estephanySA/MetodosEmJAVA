public class Exercicio02 {

    // exercicio com subtração//

    static void main(){
        int x = 3, y = 5; // variavel local
        int resultado;
        resultado = somar(x, y); // argumento --> valores enviados para o método//
        System.out.println("soma = " + resultado);
        resultado = subtrair(x,y);
        System.out.println("diferença: " + resultado);

    }

    static int somar(int x, int y) { // parâmetro -- >> variavel para receber os argumentos
        int resultado = x + y;
        return resultado;

    }
    static int subtrair(int x, int y) {
        int resultado = x - y;
        return resultado;

    }


    }

