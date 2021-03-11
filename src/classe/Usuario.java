package classe;

public class Usuario {

    String nome;
    String email;

    public boolean equals(Object object) {

        if (object instanceof Usuario) {

            Usuario outro = (Usuario) object;

            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email.equals(this.email);

            return nomeIgual && emailIgual;

        } else {

            return false;
        }
    }

    // O hashcode será abordado em outro aula.

    public int hashCode() {

        return 0;
    }
}
