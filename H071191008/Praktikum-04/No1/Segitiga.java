class Segitiga extends BangunDatar{
  public double getLuasSegitiga(){
    return 0.5*sisiAlas*tinggi;
  }
  public double getKelilingSegitiga(){
    double phytagoras = Math.sqrt(Math.pow(sisiAlas/2, 2)+Math.pow(tinggi, 2));
    return sisiAlas+(phytagoras*2);
  }
}
