package AlunoAcademia;

public class alunoSpin extends alunoAcademia {
    private int _sessoes;
    private float _valorSessao;

    public int get_sessoes() {
        return _sessoes;
    }

    public void set_sessoes(int _sessoes) {
        this._sessoes = _sessoes;
    }

    public float get_valorSessao() {
        return _valorSessao;
    }

    public void set_valorSessao(float _valorSessao) {
        this._valorSessao = _valorSessao;
    }

    @Override
    public float get_mensalidade() {
        return super.get_mensalidade() + (_sessoes * _valorSessao);
    }

    alunoSpin(){
        super();
        this._sessoes = 0;
        this._valorSessao = 0;
    }

    alunoSpin(String n, int q, float v, int s, float vs){
        super(n,q,v);
        this._sessoes = s;
        this._valorSessao = vs;

    }
}
