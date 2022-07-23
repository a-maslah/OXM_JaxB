package test;

import test.metier.Compte;
import test.metier.ListCompte;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.Date;
import java.util.List;

public class JaxBSerialisationXML {

    public static void main(String[] args) throws JAXBException {

        //Compte compte = new Compte(1L,9000,new Date());

        JAXBContext jaxbContext = JAXBContext.newInstance(ListCompte.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);

        ListCompte listCompte = new ListCompte();
        listCompte.addCompte(new Compte(1L,10000,new Date()));
        listCompte.addCompte(new Compte(2L,9000,new Date()));
        marshaller.marshal(listCompte,System.out);
        marshaller.marshal(listCompte,new File("listcompte.xml"));


    }
}
