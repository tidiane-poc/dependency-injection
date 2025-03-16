package ma.enset.ext;

import ma.enset.dao.IDao;

public class IDaoImpl implements IDao {

    @Override
    public int getData() {
        System.out.println("Hello from sensors");
        return 45;
    }
}
