package BuySell.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import BuySell.dto.Product;
import BuySell.dto.User;

public class Crud {
	EntityManager em=Persistence.createEntityManagerFactory("satyam").createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public void saveUser(User user) throws Exception{
		et.begin();
		em.persist(user);
		et.commit();
	}
	
	public User userLogin(String email) throws Exception{
		Query q = em.createQuery("select a from User a where email=?1");
		q.setParameter(1, email);
		System.out.println(q.getSingleResult());
		return (User) q.getSingleResult();
	}
	
	public void addProduct(Product p) {
		et.begin();
		em.persist(p);
		et.commit();
	}
	
	public List fetch(String category){
		Query q = em.createQuery("select c from Product c where category=?1");
		q.setParameter(1, category);
		return q.getResultList();
	}

	public Product buy(int id) {
		Product db = em.find(Product.class, id);
		return db;
	}

	public int fetchPrice(int id) {
		Product db = em.find(Product.class, id);
		return db.getPrice();
	}

	public void deleteProduct(int id) {
		Product db = em.find(Product.class, id);
		et.begin();
		em.remove(db);
		et.commit();
	}

	public List<Product> myProducts(String u) {
		Query q = em.createQuery("select a from Product a where user=?1");
		q.setParameter(1, u);
		return q.getResultList();
	}

	public User fetchUser(String u) {
		Query q = em.createQuery("select a from User a where email=?1");
		q.setParameter(1, u);
		return (User) q.getSingleResult();
	}

	

	

	
}
