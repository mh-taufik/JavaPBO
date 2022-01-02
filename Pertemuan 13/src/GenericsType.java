public class GenericsType<T> {
	private Object t;
	
	public Object get() {
		return t;
	}
	
	public void set(Object t) {
		this.t = t;
	}
	
	public static void main(String args[]){
		GenericsType<String> type = new GenericsType();
		type.set("Java");
		String str = (String) type.get();
		//type casting, error prone and can cause ClassCastException
		System.out.println(str);
	}
}