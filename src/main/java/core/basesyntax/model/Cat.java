package core.basesyntax.model;

public class Cat {
    private int age;
    private String name;
    private String ownerName;

    @Override
    public String toString() {
        return "Cat{"
                + "age=" + age
                + ", name='" + name + '\''
                + ", ownerName='" + ownerName + '\''
                + '}';
    }
}
