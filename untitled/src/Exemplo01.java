public class Exemplo01 {
    // tudo que tem parênteses (parâmetro) são métodos
// se o static está presente, então é orientado a objeto

    static void main(){
        int x = 3, y = 5; // variavel local
        somar(x, y);
    }

    static void somar(int x, int y) {
        int resultado = x + y;
        System.out.println(resultado);
    }
}
