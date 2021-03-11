package colecoes;

public class Usuario {

    String nome;

    Usuario(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Meu nome é " + this.nome + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario)) return false;

        Usuario usuario = (Usuario) o;

        return nome != null ? nome.equals(usuario.nome) : usuario.nome == null;
    }

//    @Override
//    public int hashCode() {
//        return nome != null ? nome.hashCode() : 0;
//    }
}
