package modelo.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NovoUsuario {

    public static void main(String[] args) throws ClassNotFoundException {

        EntityManagerFactory entityManagerFactory = Persistence
                .createEntityManagerFactory("exercicios-jpa");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Usuario novoUsuario = new Usuario("Leonardo", "leonardo@lanche.com.br");

        entityManager.getTransaction().begin();
        entityManager.persist(novoUsuario);
        entityManager.getTransaction().commit();
        entityManager.close();

        System.out.println("O ID gerado foi: " + novoUsuario.getId());

        entityManagerFactory.close();

    }
}
