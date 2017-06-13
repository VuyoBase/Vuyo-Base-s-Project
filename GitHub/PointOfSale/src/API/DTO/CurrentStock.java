package API.DTO;

public class CurrentStock {

	private Long quantity;
	private Long id;
	private String refill;

	public CurrentStock() {

	}

	public CurrentStock(Long quantity, Long id, String refill) {
		this.quantity = quantity;
		this.id = id;
		this.refill = refill;
	}

	public Long getQuantity() {
		return quantity;
	}

	public Long getId() {
		return id;
	}

	public String getRefill() {
		return refill;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setRefill(String refill) {
		this.refill = refill;
	}

}
