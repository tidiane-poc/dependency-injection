package ma.enset.metier;

import ma.enset.dao.IDao;
import org.springframework.stereotype.Component;

@Component("metier")
public class IMetierImpl implements IMetier {
    private IDao dao;
    public IMetierImpl(IDao dao) {
        this.dao = dao;
    }
    @Override
    public double calcul() {
        int data = dao.getData();
        return data * 23.5;
    }
}
