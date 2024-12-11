package calculoSalario;

public class promotorExtra extends promotor {

    public float bonusTransporte() {
        return 20 *get_qtdias();
    }

    @Override
    public float get_salario() {
        return super.get_salario() + bonusTransporte();
    }   

    public promotorExtra(int q, float vlr, String n) {
        super(q, vlr, n);
    }   
    public promotorExtra() {
        set_nome("João");
        set_qtdias(20);
        set_valorDiaria(100);
    }   
}
