package designPatterns;

public class SingletonClass {

    private SingletonClass() {}

    private static SingletonClass singletonObj;

    private int number;
    private String name;

    public static SingletonClass createSingletonObject() {
        if (singletonObj == null) {
            singletonObj = new SingletonClass();
            return singletonObj;
        } else {
            return singletonObj;
        }
    }
}
