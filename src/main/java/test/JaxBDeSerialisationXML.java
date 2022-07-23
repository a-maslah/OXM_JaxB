package test;

import test.metier.Compte;
import test.metier.ListCompte;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.Date;

public class JaxBDeSerialisationXML {

    public static void main(String[] args) throws JAXBException {


        JAXBContext jaxbContext = JAXBContext.newInstance(ListCompte.class);

        Unmarshaller unmarshaller=jaxbContext.createUnmarshaller();
        ListCompte listCompte = (ListCompte) unmarshaller.unmarshal(new File("listcompte.xml"));
        for(Compte c:listCompte.getComptes()){
            System.out.println("--------------");
            System.out.println(c.getId());
            System.out.println(c.getSolde());
        }


    }
}
