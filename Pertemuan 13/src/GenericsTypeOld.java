
public class GenericsTypeOld<T> {
	private T t;
	
	public T get(){
		return this.t;
	}
	
	public void set(T t1){
		this.t=t1;
	}
	
	public static void main(String args[]){
		GenericsTypeOld<String> type = new GenericsTypeOld<>();
		type.set("Java"); //valid
		GenericsTypeOld type1 = new GenericsTypeOld(); //raw type
		type1.set("Java"); //valid
		type1.set(10); //valid and autoboxing support
		System.out.println(type.getClass());
	}
}
