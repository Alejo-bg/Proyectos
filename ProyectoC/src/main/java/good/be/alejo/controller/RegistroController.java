package good.be.alejo.controller;

import java.util.ArrayList;
import java.util.List;

import good.be.alejo.bean.Country;
import good.be.alejo.bean.Registro;
import good.be.alejo.bean.Portero;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class RegistroController {
	
	
	
	
	
	
	@RequestMapping(value = "/registro/{id}", method = RequestMethod.GET,headers="Accept=application/json")
	 public Registro getRegistroById(@PathVariable String id)
	 {
	  List<Registro> registros = new ArrayList<Registro>();
	  //listOfCountries=createCountryList();
	 
	  for (Registro registro:registros) {
	   if(registro.getPlaca().equals(id))
	    return registro;
	  }
	  
	  return null;
	 }
	
	

}
