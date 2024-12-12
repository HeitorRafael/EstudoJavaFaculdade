package calculoSalario.Testsolo;

public class promotor {
   private String _nome;
   private int _qtDias;
   private float _valorDiaria;

    public String get_nome() {
        return _nome;
    }

    public void set_nome(String _nome) {
        this._nome = _nome;
    }

    public int get_qtDiastDias() {
        return _qtDias;
    }

    public void set_qtDias(int ptDias) {
        this._qtDias = ptDias;
    }

    public float get_valorDiaria() {
        return _valorDiaria;
    }

    public void set_valorDiaria(float _valorDiaria) {
        this._valorDiaria = _valorDiaria;
    }

    public float get_salario(){
        return get_salario() * get_qtDiastDias();
    }

    promotor(){
        _nome = "Heitor";
        _qtDias = 10;
        _valorDiaria = 100;
    }

    promotor(int q, float vlr, String n){
        _qtDias = q;
        _valorDiaria = vlr;
        _nome = n;
    }
}
