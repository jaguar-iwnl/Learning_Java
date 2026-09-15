public class Referencia
{
    private aluno1 a1, a2;

    public Referencia()
    {
        a1 = new aluno1("Carlos", 20);
        a2 = new aluno1("Ana", 23);
        System.out.println("O nome do aluno 1 é: "+ a1.recuperarNome());
        System.out.println("O nome do aluno 2 é: "+ a2.recuperarNome());

        a1 = a2;
        a2.definirNome("Flávia");
        System.out.println("O nome do aluno 1 é: "+ a1.recuperarNome());
        manipulaAluno(a1);
        System.out.println("O nome do aluno 1 é: "+ a1.recuperarNome());
    }
    public void manipulaAluno(aluno1 aluno1)
    {
        aluno1.definirNome("Márcia");
    }

    public static void main(String[] args)
    {
        Referencia r = new Referencia();
        System.out.println("Fim da execução.");
    }
}
