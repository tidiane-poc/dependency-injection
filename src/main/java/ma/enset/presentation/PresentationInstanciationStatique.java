package ma.enset.presentation;

import ma.enset.dao.IDao;
//import ma.enset.dao.IDaoImpl;
import ma.enset.ext.IDaoImpl;
import ma.enset.metier.IMetier;
import ma.enset.metier.IMetierImpl;

public class PresentationInstanciationStatique {
    public static void main(String[] args) {
        IDao dao = new IDaoImpl();
        IMetier metier = new IMetierImpl(dao);
        System.out.println("Result: " + metier.calcul());
    }
}
