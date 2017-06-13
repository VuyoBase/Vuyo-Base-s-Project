package API.DTO;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Current_Stock implements Serializable {

	private Integer quantity;
	private String Id;
	private Integer refill;

	public Current_Stock() {
		super();
	}

	public Current_Stock(Integer quantity, String id, Integer refill) {
		super();
		this.quantity = quantity;
		Id = id;
		this.refill = refill;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public String getId() {
		return Id;
	}

	public Integer getRefill() {
		return refill;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public void setId(String id) {
		Id = id;
	}

	public void setRefill(Integer refill) {
		this.refill = refill;
	}

}
