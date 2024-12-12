package AlunoAcademia;

public class alunoBolsa extends alunoAcademia {
    private float _percentual;

    public float get_percentual() {
        return _percentual;
    }

    public void set_percentual(float _percentual) {
        this._percentual = _percentual;
    }

    @Override
    public float get_mensalidade() {
        return super.get_mensalidade() - (super.get_mensalidade() * _percentual / 100);
    }

    alunoBolsa() {
        super();
        this._percentual = 0;
    }

    alunoBolsa(String n, int q, float v, float p) {
        super(n, q, v);
        this._percentual = p;

    }
}