package ma.enset.dao;

public class IDaoImpl implements IDao{

    @Override
    public int getData() {
        System.out.println("Hello from Database");
        return 45;
    }
}
