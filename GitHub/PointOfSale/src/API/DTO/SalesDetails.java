package API.DTO;

public class SalesDetails {

	private Long Id;
	private String name;
	private Long StockCode;
	private String MeasurementType;

	public SalesDetails() {
		super();
	}

	public SalesDetails(Long id, String name, Long stockCode, String measurementType) {
		super();
		Id = id;
		this.name = name;
		StockCode = stockCode;
		MeasurementType = measurementType;
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
