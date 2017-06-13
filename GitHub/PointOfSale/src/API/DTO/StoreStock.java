
package API.DTO;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class StoreStock implements Serializable {
	private Long Id;
	private String name;
	private Long StockCode;
	private String MeasurementType;

	public StoreStock(Long id, String name, Long stockCode, String measurementType) {
		Id = id;
		this.name = name;
		StockCode = StockCode;
		MeasurementType = measurementType;

	}

	public StoreStock() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return Id;
	}

	public String getName() {
		return name;
	}

	public Long getStockCode() {
		return StockCode;
	}

	public String getMeasurementType() {
		return MeasurementType;
	}

	public void setId(Long id) {
		Id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStockCode(Long stockCode) {
		StockCode = stockCode;
	}

	public void setMeasurementType(String measurementType) {
		MeasurementType = measurementType;
	}

}
