package cn.itcast.test;

import cn.itcast.domain.Custom;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaTest {
    @Test
    public void test(){
EntityManager em = Persistence.createEntityManagerFactory("myJpa").createEntityManager();
EntityTransaction tx = em.getTransaction();
tx.begin();
Custom c = new Custom();
c.setCustName("liu");
em.persist(c);
tx.commit();
em.close();
    }}
