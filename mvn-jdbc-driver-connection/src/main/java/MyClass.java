/*
 * A Simple POJO class just for reference of MongoClient while connecting java with mongoDB
 */
public class MyClass {

    /**
     * @NotNull
     */
    private int Id;

    /**
     * @NotNull
     */
    private String name;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
