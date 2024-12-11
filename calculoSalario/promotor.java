package calculoSalario;

public class promotor {
    private String _nome;
    private int _qtdias;
    private float _valorDiaria;

    
    public String get_nome() {
        return _nome;
    }
    public void set_nome(String _nome) {
        this._nome = _nome;
    }
    public int get_qtdias() {
        return _qtdias;
    }
    public void set_qtdias(int _qtdias) {
        this._qtdias = _qtdias;
    }
    public float get_valorDiaria() {
        return _valorDiaria;
    }
    public void set_valorDiaria(float _valorDiaria) {
        this._valorDiaria = _valorDiaria;
    }
    public float get_salario() {
        return _qtdias * _valorDiaria;

    }

    public promotor(int q, float vlr, String n) {
        this._nome = n;
        this._qtdias = q;
        this._valorDiaria = vlr;
    }
    public promotor() {
        this._nome = "João";
        this._qtdias = 20;
        this._valorDiaria = 100;
    }

    

}
