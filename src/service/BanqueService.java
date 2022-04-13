package service;

import metier.Compte;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebService(name = "BanqueWs")
public class BanqueService {

    @WebMethod(operationName = "ConversionEuroToDh")
    public double conversion(@WebParam(name="monatant") double mt){

        return mt*11.3;
    }

    @WebMethod(operationName = "getcompte")
    public Compte getCompte(Long code){
        return new Compte(code,Math.random()*80000,new Date());
    }

    @WebMethod()
    public List<Compte> getComptes(){
        List<Compte> cptes=new ArrayList<>();
        cptes.add(new Compte(1L,Math.random()*80000,new Date()));
        cptes.add(new Compte(2L,Math.random()*80000,new Date()));
        return cptes;
    }


}
