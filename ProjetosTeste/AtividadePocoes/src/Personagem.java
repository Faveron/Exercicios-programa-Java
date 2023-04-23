public class Personagem {
    final private String NOME;
    private Integer forca;
    private Integer inteligencia;
    private Integer defesa;
    private Integer defesaMagica;

    public Personagem(String nome, Integer forca, Integer inteligencia, Integer defesa, Integer defesaMagica) {
        this.NOME = nome;
        this.forca = forca;
        this.inteligencia = inteligencia;
        this.defesa = defesa;
        this.defesaMagica = defesaMagica;
        System.out.println("\n\tPersonagem " + this.NOME.toUpperCase() + " criado com sucesso");
    }

    public Integer getForca() {
        return forca;
    }

    public void setForca(Integer forca) {
        this.forca = forca;
    }

    public Integer getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(Integer inteligencia) {
        this.inteligencia = inteligencia;
    }

    public Integer getDefesa() {
        return defesa;
    }

    public void setDefesa(Integer defesa) {
        this.defesa = defesa;
    }

    public Integer getDefesaMagica() {
        return defesaMagica;
    }

    public void setDefesaMagica(Integer defesaMagica) {
        this.defesaMagica = defesaMagica;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "\n\tnome = '" + NOME + '\'' +
                ", \n\tforca = " + forca +
                ", \n\tinteligencia = " + inteligencia +
                ", \n\tdefesa = " + defesa +
                ", \n\tdefesaMagica = " + defesaMagica +
                '}';
    }

    public void tomarPocao(Pocao p) {
        System.out.println("\n\t" + this.NOME + " está bebenda a poção " + p.getNOME());
        p.AplicarEfeto(this);
    }
}
