public class Aluno
{
    //Atributos
    private String nome;
    private int matricula;

    //Métodos
    public Aluno(String nome, int matricula)
    {
        this.nome = nome;
        this.matricula = matricula;
    }
    public String getNome()
    {
        return nome;
    }
    public int getMatricula()
    {
        return matricula;
    }
}
