package tutorial;
 
import javax.persistence.*;
 
public class Main {
    public static void main(String[] args) {
        // Open a database connection
        // (create a new database if it doesn't exist yet):
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("$objectdb/db/points.odb");
        EntityManager em = emf.createEntityManager();
        removeData(em, 3001L);
        em.close();
        emf.close();
    }
    
    public static void persistData(EntityManager em){
    	em.getTransaction().begin();
        Figure f = new Figure();
        f.setName("Carré");
        em.persist(f);
        em.getTransaction().commit();
    }
    
    public static void removeData(EntityManager em, long id){
    	em.getTransaction().begin();
        Figure f = em.find(Figure.class, id);
        em.remove(f);
        em.getTransaction().commit();
    }
    
    public static Figure retrieveDataByName(EntityManager em, String name){
    	TypedQuery<Figure> query = em.createQuery("Select f from Figure f where f.name = :name", Figure.class);
    	query.setParameter("name", name);
    	return query.getSingleResult();
    }
}