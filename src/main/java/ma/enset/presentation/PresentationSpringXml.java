package ma.enset.presentation;

import ma.enset.metier.IMetier;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresentationSpringXml {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("context.xml");
        IMetier metier = (IMetier) context.getBean("metier");
        System.out.println("Result: " + metier.calcul());
    }
}
