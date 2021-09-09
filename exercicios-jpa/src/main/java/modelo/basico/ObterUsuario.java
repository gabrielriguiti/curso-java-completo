package modelo.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ObterUsuario {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence
                .createEntityManagerFactory("exercicios-jpa");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Usuario usuario = entityManager.find(Usuario.class, 7L);

        System.out.println(usuario.getNome());

        entityManagerFactory.close();
        entityManager.close();
    }
}
