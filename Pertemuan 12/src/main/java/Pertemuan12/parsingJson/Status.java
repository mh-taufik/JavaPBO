package Pertemuan12.parsingJson;

public class Status {
	private String code, description;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		String print = "Status: " + this.code + "\nDeskripsi: " + description + "\n";
		return print;
	}
}
