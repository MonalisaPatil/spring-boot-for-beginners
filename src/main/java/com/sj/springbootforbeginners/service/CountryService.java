package com.sj.springbootforbeginners.service;

import com.sj.springbootforbeginners.model.CapitalCity.CapitalCity;
import com.sj.springbootforbeginners.model.country.CountryDataItem;
import com.sj.springbootforbeginners.repository.CountryRepository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Autowired
    RestTemplate restTemplate;

    public List<CountryDataItem> getAllCountries() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity request = new HttpEntity<>( headers);
        ResponseEntity<CountryDataItem[]> countryData = restTemplate.getForEntity("https://restcountries.com/v3.1/all", CountryDataItem[].class, request);
        return Arrays.asList(countryData.getBody());
    }

    public void loadAllCountriesToDb(){
        List<CountryDataItem> countryDataItems = getAllCountries();
        countryRepository.saveAll(countryDataItems);
    }

    public List<CapitalCity> getAllCapitalCity() {
        ResponseEntity<CapitalCity[]> capitalCity= null;
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity request = new HttpEntity<>( headers);
        try {
            capitalCity = restTemplate.getForEntity("https://restcountries.com/v3.1/capital/tallinn", CapitalCity[].class, request);
        }catch (Exception e){
            System.out.println("error occurred while retrieing capital city");
            capitalCity= new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return Arrays.asList(capitalCity.getBody());
    }

    public  List<String> getAllTimeZones(){
        List<CountryDataItem> allCountryData = countryRepository.findAll();
        List<String> c = new ArrayList<>();
        for(CountryDataItem temp: allCountryData){
            c.addAll(temp.getTimezones());
        }
        return c;
    }

    public List<CountryDataItem> getAllRegionWrtInput(String input){
        List<CountryDataItem> allData = countryRepository.findAll();
        List<CountryDataItem> CountryRegion = new ArrayList<>();
        for(CountryDataItem temp: allData){
            if ((temp.getRegion().equals(input))){
                CountryRegion.add(temp);
            }
        }
        return CountryRegion;
    }

    public List<String> getCountryWrtDriveway(String input){
        List<CountryDataItem> allDatata = countryRepository.findAll();
        List<String> region = new ArrayList<>();
        for(CountryDataItem temp: allDatata){
            if (temp.getCar().getSide().equals(input)){
                region.add(temp.getName().getOfficial());
            }
        }
        return region;
    }


}
