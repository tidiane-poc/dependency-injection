package ma.enset.presentation;

import ma.enset.dao.IDao;
import ma.enset.metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class PresentationInstanciationDynamique {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        Scanner configFile = new Scanner(new File("config.txt"));
        String daoClassName = configFile.next();
        String metierClassName = configFile.next();
        IDao dao = (IDao) Class
                .forName(daoClassName)
                .getConstructors()[0]
                .newInstance();
        IMetier metier = (IMetier) Class
                .forName(metierClassName)
                .getConstructor(IDao.class)
                .newInstance(dao);
        System.out.println("Result: " + metier.calcul());
        configFile.close();
    }
}
