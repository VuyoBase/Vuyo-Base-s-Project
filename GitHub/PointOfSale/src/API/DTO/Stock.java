package API.DTO;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Stock implements Serializable {

	// fields
	// Default constructor
	// argument constructor
	// getters and setters

	private Long id;
	private String name;
	private String measurementType;

	public Stock() {

	}

	public Stock(Long id, String name, String measurementType) {
		this.id = id;
		this.name = name;
		this.measurementType = measurementType;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getMType() {
		return measurementType;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMeasurementType(String measurementType) {
		this.measurementType = measurementType;
	}

}
