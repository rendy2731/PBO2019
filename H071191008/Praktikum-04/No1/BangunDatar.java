class BangunDatar{
  protected double panjang,lebar,radius,tinggi;
  protected double sisiAtas, sisiAlas, sisiMiring;

  public void setPanjang(double panjang){
    this.panjang = panjang;
  }
  public void setLebar(double lebar){
    this.lebar = lebar;
  }
  public void setRadius(double radius){
    this.radius = radius;
  }
  public void setTinggi(double tinggi){
    this.tinggi = tinggi;
  }
  public void setSisiAlas(double sisiAlas){
    this.sisiAlas = sisiAlas;
  }
  public void setSisiAtas(double sisiAtas){
    this.sisiAtas = sisiAtas;
  }
  public void setSisiMiring(double sisiMiring){
    this.sisiMiring = sisiMiring;
  }

  //Getter
  public double getPanjang(){
    return panjang;
  }
  public double getLebar(){
    return lebar;
  }
  public double getRadius(){
    return radius;
  }
  public double getTinggi(){
    return tinggi;
  }
  public double getSisiAlas(){
    return sisiAlas;
  }
  public double getSisAtas(){
    return sisiAtas;
  }
  public double getSisiMiring(){
    return sisiMiring;
  }
}
