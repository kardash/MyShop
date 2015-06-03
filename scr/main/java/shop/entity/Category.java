package shop.entity;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
@Entity
public class Category extends BaseEntity {
	
	
     private String nameCategory;
     private String description;
      @Lob
     private byte[] photo;
     private String namePhoto;
     
     @OneToMany(mappedBy="category")
     private Collection<Product> products;
	
    
	public String getNameCategory() {
		return nameCategory;
	}
	public void setNameCategory(String nameCategory) {
		this.nameCategory = nameCategory;
	}
	public String getDescriptor() {
		return description;
	}
	public void setDescriptor(String descriptor) {
		this.description = descriptor;
	}
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	public String getNamePhoto() {
		return namePhoto;
	}
	public void setNamePhoto(String namePhoto) {
		this.namePhoto = namePhoto;
	}
	public Collection<Product> getProducts() {
		return products;
	}
	public void setProducts(Collection<Product> products) {
		this.products = products;
	}
	public Category() {
		super();
		
	}
	public Category(String nameCategory, String description, byte[] photo,
			String namePhoto) {
		super();
		this.nameCategory = nameCategory;
		this.description = description;
		this.photo = photo;
		this.namePhoto = namePhoto;
	}
       
}
