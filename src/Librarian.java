public class Librarian extends User{
    Librarian(int id,String name){
        super(id, name);
    }

    @Override
    public int getBorrowLimit(){
        return 10;
    }
}
