package lesson42to65.lesson60reflection;

import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        SomeClass someClass = new SomeClass();
        Class<? extends SomeClass> c = someClass.getClass();
        Class<SomeClass> c1 = SomeClass.class;
        System.out.println(c1.getName());
        Class.forName("lesson42to65.lesson60reflection.SomeClass");
        System.out.println("Констр");
        Constructor[] constructors = c.getDeclaredConstructors();
        for (Constructor con:constructors) {
            System.out.println(con.getName());
            Parameter[] parameters = con.getParameters();
            for (Parameter par:parameters) {
                System.out.println(par.getName());
                System.out.println(par.getType().getName());
            }
        }
        System.out.println("методы");
        Method[] methods = c.getDeclaredMethods();
        for (Method method: methods) {
            System.out.println(method.getName());
            Parameter[] parameters = method.getParameters();
            for (Parameter par:parameters) {
                System.out.println(par.getName());
                System.out.println(par.getType().getName());
            }
            System.out.println(Modifier.toString(method.getModifiers()));
            System.out.println(method.getReturnType());
            method.invoke(someClass,"Test");

        }
        System.out.println("Филды");
        Field[] field = c.getDeclaredFields();
        for (Field f:field) {
            System.out.println(f.getName());
            System.out.println(f.getType().getName());
            System.out.println(Modifier.toString(f.getModifiers()));
            f.setAccessible(true);
            System.out.println(f.getInt(someClass));
            f.setInt(someClass,5);
            System.out.println(f.getInt(someClass));
        }
    }
}
class SomeClass{
    private static transient int i;
   // String s;
    SomeClass(String s, Integer s1){
      //  this.s = s;
    }

    public SomeClass() {
    }

    public synchronized String someMethod(String s){
        System.out.println("Mettgtgsdgdfgsfgd");
        System.out.println(s);
        return s;
    }
}
