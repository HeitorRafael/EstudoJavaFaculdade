package calculoSalario;

public class supervisor extends promotor {

    @Override
    public float get_salario() {
        return super.get_salario() + (super.get_salario() * 0.05f) * get_qtdias();
    }

    public supervisor(int q, float vlr, String n) {
        super(q, vlr, n);
    }   
    public supervisor() {
        set_nome("João");
        set_qtdias(20);
        set_valorDiaria(100);
    }
}

