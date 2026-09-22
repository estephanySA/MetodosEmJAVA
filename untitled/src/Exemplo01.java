public class Exemplo01 {
    // tudo que tem parênteses (parâmetro) são métodos
    // se o static está presente, então é orientado a objeto
    // void nunca vai retornar nada, então não com "return"
    // return pode ser usado por int se a variavel que vai usar for int


    static void main(){
        int x = 3, y = 5; // variavel local
        int resultado = x + y;
        resultado = somar(x,y);
        System.out.println(resultado);

    }

    /*static void somar(int x, int y) {
        int resultado = x + y;
        resultado = somar(x,y);
        System.out.println(resultado);
    }*/

    static int somar(int x, int y) {
        int resultado = x + y;
        return resultado;

    }


}
