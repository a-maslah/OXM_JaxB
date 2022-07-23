package test;

import test.metier.Compte;
import test.metier.ListCompte;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.SchemaOutputResolver;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.Date;

public class JaxBSchemaGeneration {

    public static void main(String[] args) throws JAXBException, IOException {



        JAXBContext jaxbContext = JAXBContext.newInstance(ListCompte.class);

        jaxbContext.generateSchema(new SchemaOutputResolver() {
            @Override
            public Result createOutput(String namespaceUri, String suggestedFileName) throws IOException {
                File f = new File("listecomptes.xsd");
                StreamResult streamResult = new StreamResult(f);
                streamResult.setSystemId(f.getName());
                return streamResult;
            }
        });


    }
}
