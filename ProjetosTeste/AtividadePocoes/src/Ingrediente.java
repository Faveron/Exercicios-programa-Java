import Enumeraveis.NomeIngredientes;
import Enumeraveis.TipoIngrediente;

public class Ingrediente {
    private TipoIngrediente tipo;
    private NomeIngredientes nome;

    public Ingrediente(TipoIngrediente tipo, NomeIngredientes nome) {
        this.tipo = tipo;
        this.nome = nome;
    }

    public NomeIngredientes getNome() {
        return nome;
    }
}
