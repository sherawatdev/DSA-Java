package designPatterns;

public final class ImmutableClass {

    public ImmutableClass(int number, String name) {
        this.number = number;
        this.name = name;
    }

    private final int number;
    private final String name;

    public int getNumber() {
        return this.number;
    }

    public String getName() {
        return this.name;
    }
}
