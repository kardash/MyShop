package shop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
  
@Entity
@Table(name="product")
public class Product extends BaseEntity {
	
     
	 @Column(name="designation")
	 private String designation;
	 
	 @Column(name="descriptor")
	 private String descriptor;
	 
	 @Column(name="price")
	 private double price;
	 
	 @Column(name="selected")
	 private boolean selected;
	 
	 @Column(name="photo")
	 private String photo;
	 
	 @Column(name="quentity")
	 private int quentity;
	 
	 @ManyToOne
	 @JoinColumn(name="idCategory")
	 private Category category;
	 
	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDescriptor() {
		return descriptor;
	}
	public void setDescriptor(String descriptor) {
		this.descriptor = descriptor;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public int getQuentity() {
		return quentity;
	}
	public void setQuentity(int quentity) {
		this.quentity = quentity;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Product() {
		super();
	}
	public Product(String designation, String descriptor, double price,
			boolean selected, String photo, int quentity) {
		super();
		this.designation = designation;
		this.descriptor = descriptor;
		this.price = price;
		this.selected = selected;
		this.photo = photo;
		this.quentity = quentity;
	}
	
	
}
