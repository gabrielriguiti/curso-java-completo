package modelo.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlterarUsuario3 {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence
                .createEntityManagerFactory("exercicios-jpa");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        Usuario usuario = entityManager.find(Usuario.class, 7L);
        usuario.setNome("Leonardo");

        entityManager.detach(usuario);
        entityManager.merge(usuario);
        entityManager.getTransaction().commit();
        entityManager.close();

        entityManagerFactory.close();
    }
}
