package com.mycompany.Classes;

public class Evento{

	private String codigo;

	private String data;

	private double latitude;

	private double longitude;
        
        public Evento(String codigo, String data, double latitude, double longitude){
            this.codigo = codigo;
            this.data = data;
            this.latitude = latitude;
            this.longitude = longitude;
        }
        public double getLatitude(){
            return this.latitude;
        }
        public double getLongitude(){
            return this.longitude;
        }
        public String getCodigo(){
            return this.codigo;
        }
        public String getDescricao(){
            return ("\n " + this.codigo + ", " +this.data + ", " +this.latitude +", " +this.longitude);
        }

}
