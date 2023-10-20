package com.sj.springbootforbeginners.model.country;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("CountryData")
public class CountryDataItem{

	@JsonProperty("capital")
	private List<String> capital;

	@JsonProperty("flag")
	private String flag;

	@JsonProperty("independent")
	private boolean independent;

	@JsonProperty("landlocked")
	private boolean landlocked;

	@JsonProperty("postalCode")
	private PostalCode postalCode;

	@JsonProperty("flags")
	private Flags flags;

	@JsonProperty("capitalInfo")
	private CapitalInfo capitalInfo;

	@JsonProperty("ccn3")
	private String ccn3;

	@JsonProperty("coatOfArms")
	private CoatOfArms coatOfArms;

	@JsonProperty("demonyms")
	private Demonyms demonyms;

	@JsonProperty("fifa")
	private String fifa;

	@JsonProperty("cioc")
	private String cioc;

	@JsonProperty("car")
	private Car car;

	@JsonProperty("translations")
	private Translations translations;

	@JsonProperty("altSpellings")
	private List<String> altSpellings;

	@JsonProperty("area")
	private Object area;

	@JsonProperty("languages")
	private Languages languages;

	@JsonProperty("maps")
	private Maps maps;

	@JsonProperty("subregion")
	private String subregion;

	@JsonProperty("idd")
	private Idd idd;

	@JsonProperty("tld")
	private List<String> tld;

	@JsonProperty("unMember")
	private boolean unMember;

	@JsonProperty("gini")
	private Gini gini;

	@JsonProperty("continents")
	private List<String> continents;

	@JsonProperty("population")
	private int population;

	@JsonProperty("startOfWeek")
	private String startOfWeek;

	@JsonProperty("timezones")
	private List<String> timezones;

	@JsonProperty("name")
	private Name name;

	@JsonProperty("cca3")
	private String cca3;

	@JsonProperty("region")
	private String region;

	@JsonProperty("latlng")
	private List<Object> latlng;

	@JsonProperty("cca2")
	private String cca2;

	@JsonProperty("status")
	private String status;

	@JsonProperty("currencies")
	private Currencies currencies;

	@JsonProperty("borders")
	private List<String> borders;

	public void setCapital(List<String> capital){
		this.capital = capital;
	}

	public List<String> getCapital(){
		return capital;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public String getFlag(){
		return flag;
	}

	public void setIndependent(boolean independent){
		this.independent = independent;
	}

	public boolean isIndependent(){
		return independent;
	}

	public void setLandlocked(boolean landlocked){
		this.landlocked = landlocked;
	}

	public boolean isLandlocked(){
		return landlocked;
	}

	public void setPostalCode(PostalCode postalCode){
		this.postalCode = postalCode;
	}

	public PostalCode getPostalCode(){
		return postalCode;
	}

	public void setFlags(Flags flags){
		this.flags = flags;
	}

	public Flags getFlags(){
		return flags;
	}

	public void setCapitalInfo(CapitalInfo capitalInfo){
		this.capitalInfo = capitalInfo;
	}

	public CapitalInfo getCapitalInfo(){
		return capitalInfo;
	}

	public void setCcn3(String ccn3){
		this.ccn3 = ccn3;
	}

	public String getCcn3(){
		return ccn3;
	}

	public void setCoatOfArms(CoatOfArms coatOfArms){
		this.coatOfArms = coatOfArms;
	}

	public CoatOfArms getCoatOfArms(){
		return coatOfArms;
	}

	public void setDemonyms(Demonyms demonyms){
		this.demonyms = demonyms;
	}

	public Demonyms getDemonyms(){
		return demonyms;
	}

	public void setFifa(String fifa){
		this.fifa = fifa;
	}

	public String getFifa(){
		return fifa;
	}

	public void setCioc(String cioc){
		this.cioc = cioc;
	}

	public String getCioc(){
		return cioc;
	}

	public void setCar(Car car){
		this.car = car;
	}

	public Car getCar(){
		return car;
	}

	public void setTranslations(Translations translations){
		this.translations = translations;
	}

	public Translations getTranslations(){
		return translations;
	}

	public void setAltSpellings(List<String> altSpellings){
		this.altSpellings = altSpellings;
	}

	public List<String> getAltSpellings(){
		return altSpellings;
	}

	public void setArea(Object area){
		this.area = area;
	}

	public Object getArea(){
		return area;
	}

	public void setLanguages(Languages languages){
		this.languages = languages;
	}

	public Languages getLanguages(){
		return languages;
	}

	public void setMaps(Maps maps){
		this.maps = maps;
	}

	public Maps getMaps(){
		return maps;
	}

	public void setSubregion(String subregion){
		this.subregion = subregion;
	}

	public String getSubregion(){
		return subregion;
	}

	public void setIdd(Idd idd){
		this.idd = idd;
	}

	public Idd getIdd(){
		return idd;
	}

	public void setTld(List<String> tld){
		this.tld = tld;
	}

	public List<String> getTld(){
		return tld;
	}

	public void setUnMember(boolean unMember){
		this.unMember = unMember;
	}

	public boolean isUnMember(){
		return unMember;
	}

	public void setGini(Gini gini){
		this.gini = gini;
	}

	public Gini getGini(){
		return gini;
	}

	public void setContinents(List<String> continents){
		this.continents = continents;
	}

	public List<String> getContinents(){
		return continents;
	}

	public void setPopulation(int population){
		this.population = population;
	}

	public int getPopulation(){
		return population;
	}

	public void setStartOfWeek(String startOfWeek){
		this.startOfWeek = startOfWeek;
	}

	public String getStartOfWeek(){
		return startOfWeek;
	}

	public void setTimezones(List<String> timezones){
		this.timezones = timezones;
	}

	public List<String> getTimezones(){
		return timezones;
	}

	public void setName(Name name){
		this.name = name;
	}

	public Name getName(){
		return name;
	}

	public void setCca3(String cca3){
		this.cca3 = cca3;
	}

	public String getCca3(){
		return cca3;
	}

	public void setRegion(String region){
		this.region = region;
	}

	public String getRegion(){
		return region;
	}

	public void setLatlng(List<Object> latlng){
		this.latlng = latlng;
	}

	public List<Object> getLatlng(){
		return latlng;
	}

	public void setCca2(String cca2){
		this.cca2 = cca2;
	}

	public String getCca2(){
		return cca2;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	public void setCurrencies(Currencies currencies){
		this.currencies = currencies;
	}

	public Currencies getCurrencies(){
		return currencies;
	}

	public void setBorders(List<String> borders){
		this.borders = borders;
	}

	public List<String> getBorders(){
		return borders;
	}

	@Override
 	public String toString(){
		return 
			"CountryDataItem{" + 
			"capital = '" + capital + '\'' + 
			",flag = '" + flag + '\'' + 
			",independent = '" + independent + '\'' + 
			",landlocked = '" + landlocked + '\'' + 
			",postalCode = '" + postalCode + '\'' + 
			",flags = '" + flags + '\'' + 
			",capitalInfo = '" + capitalInfo + '\'' + 
			",ccn3 = '" + ccn3 + '\'' + 
			",coatOfArms = '" + coatOfArms + '\'' + 
			",demonyms = '" + demonyms + '\'' + 
			",fifa = '" + fifa + '\'' + 
			",cioc = '" + cioc + '\'' + 
			",car = '" + car + '\'' + 
			",translations = '" + translations + '\'' + 
			",altSpellings = '" + altSpellings + '\'' + 
			",area = '" + area + '\'' + 
			",languages = '" + languages + '\'' + 
			",maps = '" + maps + '\'' + 
			",subregion = '" + subregion + '\'' + 
			",idd = '" + idd + '\'' + 
			",tld = '" + tld + '\'' + 
			",unMember = '" + unMember + '\'' + 
			",gini = '" + gini + '\'' + 
			",continents = '" + continents + '\'' + 
			",population = '" + population + '\'' + 
			",startOfWeek = '" + startOfWeek + '\'' + 
			",timezones = '" + timezones + '\'' + 
			",name = '" + name + '\'' + 
			",cca3 = '" + cca3 + '\'' + 
			",region = '" + region + '\'' + 
			",latlng = '" + latlng + '\'' + 
			",cca2 = '" + cca2 + '\'' + 
			",status = '" + status + '\'' + 
			",currencies = '" + currencies + '\'' + 
			",borders = '" + borders + '\'' + 
			"}";
		}
}