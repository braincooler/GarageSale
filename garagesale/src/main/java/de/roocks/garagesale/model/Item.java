package de.roocks.garagesale.model;

public class Item {
private Long id;
	
	private int amount;
	private Long parcel_id;
	private Long product_id;
	
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Item(Long id, int amount, Long parcel_id, Long product_id) {
		super();
		this.id = id;
		this.amount = amount;
		this.parcel_id = parcel_id;
		this.product_id = product_id;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Long getParcel_id() {
		return parcel_id;
	}
	public void setParcel_id(Long parcel_id) {
		this.parcel_id = parcel_id;
	}
	public Long getProduct_id() {
		return product_id;
	}
	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	}
}
