public class Endereco
{
    //Atributos
    private String nomeRua;
    private int numero;

    //Métodos
    public Endereco(String nomeRua, int numero)
    {
        this.nomeRua = nomeRua;
        this.numero = numero;
    }

    //Getters e Setters
    public String getNomeRua()
    {
        return nomeRua;
    }
    public void setNomeRua(String nomeRua)
    {
        this.nomeRua = nomeRua;
    }

    public int getNumero()
    {
        return numero;
    }
    public void setNumero(int numero)
    {
        this.numero = numero;
    }

    public static void main(String[] args)
    {
        Endereco end = new Endereco("Rua X", 7);
        System.out.println(end.getNomeRua()+", "+end.getNumero());
    }
}
