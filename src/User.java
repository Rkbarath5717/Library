public abstract class User {
    private int id;
    private String name;

    User(int id,String name){
        this.id=id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract int getBorrowLimit();

    public void displayUser(){
        System.out.println("Id : "+ id);
        System.out.println("Name : "+ name);
    }
}
