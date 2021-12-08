package Pertemuan12.parsingJson;

public class Status {
	private String code, description;

	@Override
	public String toString() {
		return this.code + " | " + this.description + " | ";
	}
}
