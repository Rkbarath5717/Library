public class Faculty extends User{
    public Faculty(int id,String name){
        super(id, name);
    }

    @Override
    public int getBorrowLimit(){
        return 5;
    }
}
