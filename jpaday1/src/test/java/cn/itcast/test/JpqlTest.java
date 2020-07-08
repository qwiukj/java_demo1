package cn.itcast.test;

import org.junit.Test;

import javax.persistence.*;
import java.util.List;

public class JpqlTest {
    @Test
    public  void testFindAll(){
        EntityManagerFactory myJpa = Persistence.createEntityManagerFactory("myJpa");
        EntityManager em = myJpa.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        String jpql= "from Custom order by custId desc";
        //select count(custId) from Custom;
        //query.getSingleResult();
        Query query = em.createQuery(jpql);
        List resultList = query.getResultList();
        for (Object o : resultList) {
            System.out.println(o);
        }

        tx.commit();
        em.close();
        myJpa.close();


    }
}
