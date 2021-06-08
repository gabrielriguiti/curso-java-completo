package modelo.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NovoUsuario {

    public static void main(String[] args) throws ClassNotFoundException {

        EntityManagerFactory entityManagerFactory = Persistence
                .createEntityManagerFactory("exercicios-jpa");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Usuario novoUsuario = new Usuario("Djalma", "djalma@lanche.com.br");

        entityManager.persist(novoUsuario);
        entityManager.close();

        entityManagerFactory.close();

    }
}
