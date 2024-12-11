package calculoSalario;

public class main {
    
    public static void main(String[] args) {
        promotor A = new promotor();
        supervisor B = new supervisor();
        promotorExtra C = new promotorExtra();

        A.set_qtdias(3); A.set_valorDiaria(19.37F); A.set_nome("Marcelo");
        B.set_qtdias(3); B.set_valorDiaria(19.37F); B.set_nome("João");
        C.set_qtdias(3); C.set_valorDiaria(19.37F); C.set_nome("Felipe");
       
        System.out.printf("Salario do Marcelo: %.2f\n", A.get_salario());
        System.out.printf("Salario do João: %.2f\n", B.get_salario());
        System.out.printf("Salario do Felipe: %.2f\n", C.get_salario());
    }
}
