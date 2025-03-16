package ma.enset.dao;

import org.springframework.stereotype.Component;

@Component("daoDatabase")
public class IDaoImpl implements IDao{

    @Override
    public int getData() {
        System.out.println("Hello from Database");
        return 45;
    }
}
