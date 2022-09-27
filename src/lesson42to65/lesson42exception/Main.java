package lesson42to65.lesson42exception;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().someMethod());
        try {
            throw new IndexOutOfBoundsException();
        } catch (IndexOutOfBoundsException e){
            try {
                throw  new ArrayIndexOutOfBoundsException();
            } catch (ArrayIndexOutOfBoundsException ex){

            }
        }

    }
    String someMethod(){
        try {Object o;
            System.out.println("try");
            o = null;
            o.getClass();
            //throw new Exception();
            return "try2";
        } catch (Exception e){
            System.out.println("catch");
            return "catch2";
        } finally {
            System.out.println("finally");
            System.exit(0);
            return "finally2";
        }
    }
}
