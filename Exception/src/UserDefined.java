class MyException extends Exception{
    public MyException(String s){
        super(s);
    }
}
  
class UserDefined{
    public static void main(String args[]){
        try{
            throw new MyException("Exception Dilakukan");
        }
        catch (MyException ex){
            System.out.println("Exception Terjadi");
            System.out.println(ex.getMessage());
        }
    }
}