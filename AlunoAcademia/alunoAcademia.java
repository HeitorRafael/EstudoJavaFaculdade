package AlunoAcademia;

public class alunoAcademia {
   private String _nome;
   private int _qtModalidade;
   private float _valorModalidade;

    public String get_nome() {
        return _nome;
    }

    public void set_nome(String _nome) {
        this._nome = _nome;
    }

    public int get_qtModalidade() {
        return _qtModalidade;
    }

    public void set_qtModalidade(int _qtModalidade) {
        this._qtModalidade = _qtModalidade;
    }

    public float get_valorModalidade() {
        return _valorModalidade;
    }

    public void set_valorModalidade(float _valorModalidade) {
        this._valorModalidade = _valorModalidade;
    }

    public float get_mensalidade (){
        return get_qtModalidade() * get_valorModalidade();
    }

    alunoAcademia(){
        _nome = " ";
        _qtModalidade = 0;
        _valorModalidade= 0;
    }

    alunoAcademia(String n, int qtd, float vlr){
        _nome = n;
        _qtModalidade = qtd;
        _valorModalidade = vlr;
    }
}
