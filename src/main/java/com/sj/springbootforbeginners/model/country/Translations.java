package com.sj.springbootforbeginners.model.country;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Translations{

	@JsonProperty("hun")
	private Hun hun;

	@JsonProperty("swe")
	private Swe swe;

	@JsonProperty("zho")
	private Zho zho;

	@JsonProperty("est")
	private Est est;

	@JsonProperty("fin")
	private Fin fin;

	@JsonProperty("pol")
	private Pol pol;

	@JsonProperty("kor")
	private Kor kor;

	@JsonProperty("ces")
	private Ces ces;

	@JsonProperty("tur")
	private Tur tur;

	@JsonProperty("ara")
	private Ara ara;

	@JsonProperty("rus")
	private Rus rus;

	@JsonProperty("por")
	private Por por;

	@JsonProperty("bre")
	private Bre bre;

	@JsonProperty("fra")
	private Fra fra;

	@JsonProperty("deu")
	private Deu deu;

	@JsonProperty("ita")
	private Ita ita;

	@JsonProperty("per")
	private Per per;

	@JsonProperty("spa")
	private Spa spa;

	@JsonProperty("urd")
	private Urd urd;

	@JsonProperty("nld")
	private Nld nld;

	@JsonProperty("jpn")
	private Jpn jpn;

	@JsonProperty("hrv")
	private Hrv hrv;

	@JsonProperty("srp")
	private Srp srp;

	@JsonProperty("slk")
	private Slk slk;

	@JsonProperty("cym")
	private Cym cym;

	public void setHun(Hun hun){
		this.hun = hun;
	}

	public Hun getHun(){
		return hun;
	}

	public void setSwe(Swe swe){
		this.swe = swe;
	}

	public Swe getSwe(){
		return swe;
	}

	public void setZho(Zho zho){
		this.zho = zho;
	}

	public Zho getZho(){
		return zho;
	}

	public void setEst(Est est){
		this.est = est;
	}

	public Est getEst(){
		return est;
	}

	public void setFin(Fin fin){
		this.fin = fin;
	}

	public Fin getFin(){
		return fin;
	}

	public void setPol(Pol pol){
		this.pol = pol;
	}

	public Pol getPol(){
		return pol;
	}

	public void setKor(Kor kor){
		this.kor = kor;
	}

	public Kor getKor(){
		return kor;
	}

	public void setCes(Ces ces){
		this.ces = ces;
	}

	public Ces getCes(){
		return ces;
	}

	public void setTur(Tur tur){
		this.tur = tur;
	}

	public Tur getTur(){
		return tur;
	}

	public void setAra(Ara ara){
		this.ara = ara;
	}

	public Ara getAra(){
		return ara;
	}

	public void setRus(Rus rus){
		this.rus = rus;
	}

	public Rus getRus(){
		return rus;
	}

	public void setPor(Por por){
		this.por = por;
	}

	public Por getPor(){
		return por;
	}

	public void setBre(Bre bre){
		this.bre = bre;
	}

	public Bre getBre(){
		return bre;
	}

	public void setFra(Fra fra){
		this.fra = fra;
	}

	public Fra getFra(){
		return fra;
	}

	public void setDeu(Deu deu){
		this.deu = deu;
	}

	public Deu getDeu(){
		return deu;
	}

	public void setIta(Ita ita){
		this.ita = ita;
	}

	public Ita getIta(){
		return ita;
	}

	public void setPer(Per per){
		this.per = per;
	}

	public Per getPer(){
		return per;
	}

	public void setSpa(Spa spa){
		this.spa = spa;
	}

	public Spa getSpa(){
		return spa;
	}

	public void setUrd(Urd urd){
		this.urd = urd;
	}

	public Urd getUrd(){
		return urd;
	}

	public void setNld(Nld nld){
		this.nld = nld;
	}

	public Nld getNld(){
		return nld;
	}

	public void setJpn(Jpn jpn){
		this.jpn = jpn;
	}

	public Jpn getJpn(){
		return jpn;
	}

	public void setHrv(Hrv hrv){
		this.hrv = hrv;
	}

	public Hrv getHrv(){
		return hrv;
	}

	public void setSrp(Srp srp){
		this.srp = srp;
	}

	public Srp getSrp(){
		return srp;
	}

	public void setSlk(Slk slk){
		this.slk = slk;
	}

	public Slk getSlk(){
		return slk;
	}

	public void setCym(Cym cym){
		this.cym = cym;
	}

	public Cym getCym(){
		return cym;
	}

	@Override
 	public String toString(){
		return 
			"Translations{" + 
			"hun = '" + hun + '\'' + 
			",swe = '" + swe + '\'' + 
			",zho = '" + zho + '\'' + 
			",est = '" + est + '\'' + 
			",fin = '" + fin + '\'' + 
			",pol = '" + pol + '\'' + 
			",kor = '" + kor + '\'' + 
			",ces = '" + ces + '\'' + 
			",tur = '" + tur + '\'' + 
			",ara = '" + ara + '\'' + 
			",rus = '" + rus + '\'' + 
			",por = '" + por + '\'' + 
			",bre = '" + bre + '\'' + 
			",fra = '" + fra + '\'' + 
			",deu = '" + deu + '\'' + 
			",ita = '" + ita + '\'' + 
			",per = '" + per + '\'' + 
			",spa = '" + spa + '\'' + 
			",urd = '" + urd + '\'' + 
			",nld = '" + nld + '\'' + 
			",jpn = '" + jpn + '\'' + 
			",hrv = '" + hrv + '\'' + 
			",srp = '" + srp + '\'' + 
			",slk = '" + slk + '\'' + 
			",cym = '" + cym + '\'' + 
			"}";
		}
}