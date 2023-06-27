package com.vitaniapermatasari_202102334.cuaca;

public class WeatherModel {
    private String main;
    private String descredption;
    private String icon;

    public WeatherModel(){
    }

    public String getMain () {return main;}

    public void setMain(String main) {this.main = main;}

    public String getDescredption () {return descredption;}

    public void setDescredption(String descredption) {this.descredption = descredption; }

    public String getIcon(){return icon;}

    public void setIcon(String ucon) {this.icon =  icon;}
}
