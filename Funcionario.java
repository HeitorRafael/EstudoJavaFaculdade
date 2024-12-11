public class Funcionario {
    // Atributos
    private String nome;
    private int idade;
    private char sexo;
    private double qtHoras;
    private double valorHora;
    private double salarioBruto;
    private double impostoRetido;
    private double salarioLiquido;

    //Construtor padrão
    public Funcionario() {
        this.nome = "Sem Nome";
        this.idade = 0;
        this.sexo = ' ';
        this.qtHoras = 0.0;
        this.valorHora = 0.0;
    }

    // Construtor com parametros
    public Funcionario(String nome, int idade, char sexo, double qtHoras, double valorHora) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.qtHoras = qtHoras;
        this.valorHora = valorHora;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getQtHoras() {
        return qtHoras;
    }

    public void setQtHoras(double qtHoras) {
        this.qtHoras = qtHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public double getImpostoRetido() {
        return impostoRetido;
    }

    public double getSalarioLiquido() {
        return salarioLiquido;
    }

    // Método para calcular o salário bruto
    public void calcularSalarioBruto() {
        salarioBruto = qtHoras * valorHora;
    }

    // Calcular o imposto retido
    public void calcularImpostoRetido() {
        if (salarioBruto <= 1903.93) {
            impostoRetido = 0;
        } else if (salarioBruto <= 2826.65) {
            impostoRetido = salarioBruto * 0.075 - 142.80;
        } else if (salarioBruto <= 3751.05) {
            impostoRetido = salarioBruto * 0.15 - 354.80;
        } else if (salarioBruto <= 4664.68) {
            impostoRetido = salarioBruto * 0.225 - 636.13;
        } else {
            impostoRetido = salarioBruto * 0.275 - 869.36;
        }
    }

    // Calcular o salário líquido
    public void calcularSalarioLiquido() {
        salarioLiquido = salarioBruto - impostoRetido;
    }

    // Reajuste do valor da hora
    public void reajustarValorDaHora(double percentual) {
        valorHora += (percentual / 100) * valorHora;
    }

    public static void main(String[] args) {
        // onstrutor padrão
        Funcionario funcionarioPadrao = new Funcionario();

        System.out.println("=== Funcionario com Construtor Padrão ===");
        System.out.println("Nome: " + funcionarioPadrao.getNome());
        System.out.println("Idade: " + funcionarioPadrao.getIdade());
        System.out.println("Sexo: " + funcionarioPadrao.getSexo());
        System.out.println("Salário Bruto: R$ " + funcionarioPadrao.getSalarioBruto());
        System.out.println("Imposto Retido: R$ " + funcionarioPadrao.getImpostoRetido());
        System.out.println("Salário Líquido: R$ " + funcionarioPadrao.getSalarioLiquido());

        // Testando o construtor parametrizado
        Funcionario funcionarioParametrizado = new Funcionario("Heitor", 29, 'M', 80, 35.5);

        funcionarioParametrizado.calcularSalarioBruto();
        funcionarioParametrizado.calcularImpostoRetido();
        funcionarioParametrizado.calcularSalarioLiquido();

        System.out.println("\n=== Funcionario com Construtor Parametrizado ===");
        System.out.println("Nome: " + funcionarioParametrizado.getNome());
        System.out.println("Idade: " + funcionarioParametrizado.getIdade());
        System.out.println("Sexo: " + funcionarioParametrizado.getSexo());
        System.out.println("Salário Bruto: R$ " + funcionarioParametrizado.getSalarioBruto());
        System.out.println("Imposto Retido: R$ " + funcionarioParametrizado.getImpostoRetido());
        System.out.println("Salário Líquido: R$ " + funcionarioParametrizado.getSalarioLiquido());
    }
}
