package config;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class CountriesCircuitBraeker {

    @GetMapping("/defaultCountries")
    public Map<String,String> defaultCountries(){
        Map<String,String> countries = new HashMap<>();
        countries.put("message","default Countries");
        countries.put("countries","Senegal,France,Mali,Maroc");
        return  countries;
    }
}
