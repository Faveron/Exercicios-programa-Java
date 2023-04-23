import Enumeraveis.BasePocao;

import java.util.Map;

public class Pocao {
    final private BasePocao BASE;
    final private String NOME;
    final private Ingrediente INGREDIENTE;
    final private Map<String, Integer> EFEITO;

    public Pocao(BasePocao base, String nome, Ingrediente ingrediente, Map<String, Integer> efeito) {
        this.BASE = base;
        this.NOME = nome;
        this.INGREDIENTE = ingrediente;
        this.EFEITO = efeito;
    }

    public String getNOME() {
        return NOME;
    }

    public void AplicarEfeto(Personagem p) {
        p.setForca(p.getForca() + EFEITO.get("FOR"));
        p.setInteligencia(p.getInteligencia() + EFEITO.get("INT"));
        p.setDefesa(p.getDefesa() + EFEITO.get("DEF"));
        p.setDefesaMagica(p.getDefesaMagica() + EFEITO.get("DEF_MAG"));
    }
}
