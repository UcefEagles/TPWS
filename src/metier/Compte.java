package metier;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;
import java.util.Date;

@XmlRootElement(name = "compte")
//@XmlAccessorType(XmlAccessType.FIELD)
public class Compte implements Serializable {

            private  long code;
            private double solde;
            //@XmlTransient
            private Date datecreation;

    public long getCode() {
        return code;
    }

    public double getSolde() {
        return solde;
    }

    public Date getDatecreation() {
        return datecreation;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void setDatecreation(Date datecreation) {
        this.datecreation = datecreation;
    }

    public Compte() {
        super();
    }

    public Compte(long code, double solde, Date datecreation) {
        this.code = code;
        this.solde = solde;
        this.datecreation = datecreation;
    }

}
