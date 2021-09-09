package modelo.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RemoverUsuario {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence
                .createEntityManagerFactory("exercicios-jpa");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Usuario usuario = entityManager.find(Usuario.class, 8L);

        if (usuario != null){

            entityManager.getTransaction().begin();
            entityManager.remove(usuario);
            entityManager.getTransaction().commit();
        }

        entityManager.close();
        entityManagerFactory.close();
    }
}
