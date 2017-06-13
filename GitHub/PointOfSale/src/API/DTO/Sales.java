package API.DTO;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Sales implements Serializable {

	private String Id;
	private double UnitPrice;
	private Integer Quantity;
	private List<CurrentStock> list;

	public Sales() {
		super();
	}

	public Sales(String id, double unitPrice, Integer quantity, List<CurrentStock> list) {
		super();
		this.Id = id;
		this.UnitPrice = unitPrice;
		this.Quantity = quantity;
		this.list = list;
	}

	public String getId() {
		return Id;
	}

	public double getUnitPrice() {
		return UnitPrice;
	}

	public Integer getQuantity() {
		return Quantity;
	}

	public List getList() {
		return list;
	}

	public void setId(String id) {
		Id = id;
	}

	public void setUnitPrice(double unitPrice) {
		UnitPrice = unitPrice;
	}

	public void setQuantity(Integer quantity) {
		Quantity = quantity;
	}

	public void setList(String list) {
		list = list;
	}

}
