package modelo;

import java.util.Objects;

public class Palavra {
    private String palavra;

    public Palavra(String palavra) {
        this.palavra = palavra;
    }

    public String getPalavra() {
        return palavra;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Palavra palavra1)) return false;
        return Objects.equals(getPalavra(), palavra1.getPalavra());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPalavra());
    }

    @Override
    public String toString() {
        return "\nPalavras{" +
                "\npalavra= '" + palavra + '\'' +
                '}';
    }
}
