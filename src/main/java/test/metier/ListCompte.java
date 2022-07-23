package test.metier;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "listeComptes")
@XmlAccessorType(XmlAccessType.FIELD)
public class ListCompte {

    @XmlElement(name = "compte")
    private List<Compte> comptes=new ArrayList<>();


    public void addCompte(Compte c){
        this.comptes.add(c);
    }
    public List<Compte> getComptes() {
        return comptes;
    }

    public void setComptes(List<Compte> comptes) {
        this.comptes = comptes;
    }
}
