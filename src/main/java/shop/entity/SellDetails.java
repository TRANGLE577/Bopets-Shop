package shop.entity;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="SELLDETAILS")

public class SellDetails {
	@Id
	@GeneratedValue
	private int Id;
//	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="SellID")
	private String sellID;
	
//	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ProductID")
	private String productID;
	
	@Column(name="Amount")
	private int amount;
	
	@Column(name="Price")
	private int price;
	
	


//	public SellDetails(String sellID, String productID, int amount, int price) {
//		super();
//		this.sellID = sellID;
//		this.productID = productID;
//		this.amount = amount;
//		this.price = price;
//	}

	public SellDetails() {
		super();
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getSellID() {
		return sellID;
	}

	public void setSellID(String sellID) {
		this.sellID = sellID;
	}

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	

	
	
	
	
	
	
}
