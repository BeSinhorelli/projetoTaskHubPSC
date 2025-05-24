import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import models.Usuario;

public class Gerenciador {
    private static EntityManagerFactory emf;

    public static void main(String[] args) {
        emf = Persistence.createEntityManagerFactory("PU");
        EntityManager em = emf.createEntityManager();

        Usuario usuario = new Usuario(1, "muttley", "muttley@gmail.com", "1245");
        em.getTransaction().begin(); //abre para gravar o usuario
        em.persist(usuario); //grava o usuario
        em.getTransaction().commit(); //fecha após gravar o usuario
    }
}
