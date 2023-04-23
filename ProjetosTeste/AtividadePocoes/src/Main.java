import Enumeraveis.BasePocao;
import Enumeraveis.NomeIngredientes;
import Enumeraveis.TipoIngrediente;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Personagem wesley = new Personagem("Wesley", 10, 10, 10, 10);

        Pocao sdb = criarPocao(new Ingrediente(TipoIngrediente.FRUTA, NomeIngredientes.MORANGO_DO_NORDESTE), BasePocao.AGUA);
        Pocao mc = criarPocao(new Ingrediente(TipoIngrediente.FRUTA, NomeIngredientes.MORANGO_DO_NORDESTE), BasePocao.ALCOOL);

        Pocao pd = criarPocao(new Ingrediente(TipoIngrediente.FRUTA, NomeIngredientes.CACTU), BasePocao.AGUA);
        Pocao pa = criarPocao(new Ingrediente(TipoIngrediente.FRUTA, NomeIngredientes.CACTU), BasePocao.ALCOOL);

        Pocao ff = criarPocao(new Ingrediente(TipoIngrediente.PLANTA, NomeIngredientes.LAVANDA), BasePocao.AGUA);
        Pocao lv = criarPocao(new Ingrediente(TipoIngrediente.PLANTA, NomeIngredientes.LAVANDA), BasePocao.ALCOOL);

        Pocao pbb = criarPocao(new Ingrediente(TipoIngrediente.PLANTA, NomeIngredientes.TRIGO), BasePocao.AGUA);
        Pocao pttdtt = criarPocao(new Ingrediente(TipoIngrediente.PLANTA, NomeIngredientes.TRIGO), BasePocao.ALCOOL);

        System.out.println("\n\nPersonagem antes de aplicar as poções");
        System.out.println(wesley);

        wesley.tomarPocao(sdb);
        wesley.tomarPocao(mc);
        wesley.tomarPocao(pd);
        wesley.tomarPocao(pa);
        wesley.tomarPocao(ff);
        wesley.tomarPocao(lv);
        wesley.tomarPocao(pbb);
        wesley.tomarPocao(pttdtt);

        System.out.println("\nPersonagem depois de aplicar as poções");
        System.out.println(wesley);
    }

    public static Pocao criarPocao(Ingrediente ingrediente, BasePocao base) {
        Pocao p = null;
        switch (ingrediente.getNome()) {
            case MORANGO_DO_NORDESTE -> {
                if (base.equals(BasePocao.AGUA)) {
                    Map<String, Integer> map = new HashMap<>();
                    map.put("FOR", 0);
                    map.put("INT", 10);
                    map.put("DEF", 0);
                    map.put("DEF_MAG", 0);
                    p = new Pocao(base,"Sangue de Boi", ingrediente , map);
                }
                if (base.equals(BasePocao.ALCOOL)) {
                    Map<String, Integer> map = new HashMap<>();
                    map.put("FOR", 0);
                    map.put("INT", 0);
                    map.put("DEF", 0);
                    map.put("DEF_MAG", 10);
                    p = new Pocao(base,"Morango Chernobyl", ingrediente , map);
                }
            }
            case CACTU -> {
                if (base.equals(BasePocao.AGUA)) {
                    Map<String, Integer> map = new HashMap<>();
                    map.put("FOR", 10);
                    map.put("INT", 0);
                    map.put("DEF", 0);
                    map.put("DEF_MAG", 0);
                    p = new Pocao(base,"Pocao Detox", ingrediente , map);
                }
                if (base.equals(BasePocao.ALCOOL)) {
                    Map<String, Integer> map = new HashMap<>();
                    map.put("FOR", 0);
                    map.put("INT", 0);
                    map.put("DEF", 10);
                    map.put("DEF_MAG", 0);
                    p = new Pocao(base,"Pocao Alface", ingrediente , map);
                }
            }
            case LAVANDA -> {
                if (base.equals(BasePocao.AGUA)) {
                    Map<String, Integer> map = new HashMap<>();
                    map.put("FOR", 5);
                    map.put("INT", 5);
                    map.put("DEF", 0);
                    map.put("DEF_MAG", 0);
                    p = new Pocao(base,"Frescor do Fresco", ingrediente , map);
                }
                if (base.equals(BasePocao.ALCOOL)) {
                    Map<String, Integer> map = new HashMap<>();
                    map.put("FOR", 0);
                    map.put("INT", 0);
                    map.put("DEF", 5);
                    map.put("DEF_MAG", 5);
                    p = new Pocao(base,"Lavanda Vandala", ingrediente , map);
                }
            }
            case TRIGO -> {
                if (base.equals(BasePocao.AGUA)) {
                    Map<String, Integer> map = new HashMap<>();
                    map.put("FOR", 15);
                    map.put("INT", 0);
                    map.put("DEF", 0);
                    map.put("DEF_MAG", 0);
                    p = new Pocao(base,"Pocao Breja do Brejo", ingrediente , map);
                }
                if (base.equals(BasePocao.ALCOOL)) {
                    Map<String, Integer> map = new HashMap<>();
                    map.put("FOR", 0);
                    map.put("INT", 0);
                    map.put("DEF", 15);
                    map.put("DEF_MAG", 0);
                    p = new Pocao(base,"Pocao Tres Tigres de Trigo Tristes", ingrediente , map);
                }
            }
        }
        System.out.println("\n\tPoção " + p.getNOME().toUpperCase() + " criada com Sucesso!");
        return p;
    }
}