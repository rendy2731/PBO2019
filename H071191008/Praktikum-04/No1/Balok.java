class Balok extends BangunRuang{

  public double getLuasBalok(){
    return (2*(panjang*lebar))+(2*(panjang*tinggi))+(2*(lebar*tinggi));
  }
  public double getVolumeBalok(){
    return panjang*lebar*tinggi;
  }
}
