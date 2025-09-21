// 1. Abra a o IntelliJ (link para dowload https://www.jetbrains.com/idea/download/)
// 2. Crie o projeto: CalculadoraExemplo (no slide tem uns prints de como criar)
// 3. Crie 3 classes: Calculadora, Main, CalculadoraTest
// 4. Crie pelo menos 2 métodos para cada método da classe Calculadora

// Crie o projeto: CalculadoraExemplo
// Crie 3 classes: Calculadora, Main, CalculadoraTest
// Crie pelo menos 2 métodos para cada método da classe Calculadora

public class Main{
    public static void main(String[] args){
        System.out.println("Calculadora Java");
        Calculadora operacao = new Calculadora(5, 5);
        TesteCalculara testeOperacao = new TesteCalculara(5, 5);
        operacao.Soma();
        testeOperacao.TSoma();
        // operacao.Subtracao();
        // operacao.Multiplicacao();
        // operacao.Divisao();
    }
}

class Calculadora{
    //declarar variável
    int numb1, numb2;
    // contrrutor
    public Calculadora( int numb1, int numb2){
        this.numb1 = numb1;
        this.numb2 = numb2;
    }
    //método/ função
    public void Soma(){
     System.out.println("A soma de " + numb1 + " + " + numb2 + " = " +( numb1 + numb2));
    }

    public void Subtracao(){
        System.out.println("A subitração de " + numb1 + " - " + numb2 + " = " + (numb1 - numb2));
    }

    public void Multiplicacao(){
        System.out.println("A multiplicação de " + numb1 + " X " + numb2 + " = " + (numb1 * numb2));
    }

    public void Divisao(){
        if(numb1 == 0 || numb2 == 0)
            return;
        System.out.println("A divisão de " + numb1 + " / " + numb2 + " = " + (numb1 / numb2));
    }

}

class TesteCalculara{
    //declarar variável
    int tnumb1, tnumb2;
    // contrrutor

    public TesteCalculara( int tnumb1, int tnumb2){
        this.tnumb1 = tnumb1;
        this.tnumb2 = tnumb2;
    }
    //método/ função
    @Test
    public void TSoma(){
        System.out.println("O resultado esperado de " + tnumb1 + " + " + tnumb2 + " = " + (tnumb1 + tnumb2));
    //  if((tnumb1 + tnumb2) == Calculadora Operacao()){
    //      System.out.println("OK!")
    //  }else{
    //      System.out.println("false", throw error);
    //  }
    }

    @Test
    public void TSubtracao(){
        System.out.println("O resultado esperado de " + tnumb1 + " - " + tnumb2 + " = " + (tnumb1 - tnumb2));
    }

    @Test
    public void TMultiplicacao(){
        System.out.println("O resultado esperado de " + tnumb1 + " X " + tnumb2 + " = " + (tnumb1 * tnumb2));
    }

    @Test
    public void TDivisao(){
        if(tnumb1 == 0 || tnumb2 == 0)
            return;
        System.out.println("O resultado esperado de " + tnumb1 + " / " + tnumb2 + " = " + (tnumb1 / tnumb2));
    }

}