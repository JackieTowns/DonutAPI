package co.grandcircus.donutAPI.model;

import java.util.List;

public class DonutDetailsResponse {

	private Long id;
	private String name;
	private Integer calories;
	private List<String> extras;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public Integer getCalories() {
		return calories;
	}

	public void setCalories(Integer calories) {
		this.calories = calories;
	}

	public List<String> getExtras() {
		return extras;
	}

	public void setExtras(List<String> extras) {
		this.extras = extras;
	}

	@Override
	public String toString() {
		return "DonutDetailsResponse [name=" + name + ", id=" + id + ", calories=" + calories + ", extras=" + extras
				+ "]";
	}


}
