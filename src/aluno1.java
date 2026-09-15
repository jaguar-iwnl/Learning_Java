public class aluno1
{
    private String nome;
    private int idade;

    public aluno1(String nome, int idade)
    {
        this.nome = nome;
        this.idade = idade;
    }
    public void definirNome(String nome)
    {
        this.nome = nome;
    }
    public void definirIdade(int idade)
    {
        this.idade = idade;
    }

    public void inserirNome(String nn)
    {
        nome = nn;
    }
    public String recuperarNome()
    {
        return this.nome;
    }
    /*public static void main(String[] args)
    {
        aluno1 a = new aluno1();
        a.inserirNome("Pessoa");
        System.out.println("Saída: " + a.recuperarNome());
    }*/
}
