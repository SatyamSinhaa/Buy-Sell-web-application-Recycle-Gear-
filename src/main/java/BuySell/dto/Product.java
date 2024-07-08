package BuySell.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String category;
	private String name;
	private int price;
	private String description;
	private String image;
	private String user;
	
	public Product(String category, String name, int price, String description, String image, String user) {
		super();
		this.category = category;
		this.name = name;
		this.price = price;
		this.description = description;
		this.image = image;
		this.user = user;
	}

	public Product() {
		super();
	}
	
	

	@Override
	public String toString() {
		return "Product [id=" + id + ", category=" + category + ", name=" + name + ", price=" + price + ", description="
				+ description + ", image=" + image + ", user=" + user + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	
}
