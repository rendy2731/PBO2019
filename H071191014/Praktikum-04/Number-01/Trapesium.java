class Trapesium extends BangunDatar{
  public double getLuasTrapesium(){
    return ((sisiAlas+sisiAtas)*tinggi)/2;
  }
  public double getKelilingTrapesium(){
    return sisiAlas+sisiAtas+(sisiMiring*2);
  }
}
