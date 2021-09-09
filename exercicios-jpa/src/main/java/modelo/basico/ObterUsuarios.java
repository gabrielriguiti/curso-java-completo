package modelo.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class ObterUsuarios {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence
                .createEntityManagerFactory("exercicios-jpa");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        String jpql = "select u from Usuario u";

        TypedQuery<Usuario> query = entityManager.createQuery(jpql, Usuario.class);

        query.setMaxResults(5);

        List<Usuario> usuarios = query.getResultList();

//        List<Usuario> usuarios = entityManager
//                .createQuery("select u from Usuario u", Usuario.class)
//                .setMaxResults(5)
//                .getResultList();


        for (Usuario usuario : usuarios) {

            System.out.println("ID: " + usuario.getId()
                    + " E-mail: " + usuario.getEmail());
        }

        entityManager.close();
        entityManagerFactory.close();
    }
}
