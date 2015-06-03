package shop.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;



@Entity
public class Cart extends BaseEntity {
	
	@ManyToOne
	private User user;
	

	@ManyToOne
	private Product product;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cart(User user, Product product) {
		super();
		this.user = user;
		this.product = product;
	}

}

