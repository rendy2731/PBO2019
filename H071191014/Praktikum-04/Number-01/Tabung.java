class Tabung extends BangunRuang{

  public double getLuasTabung(){
    return 2*radius*3.14*tinggi;
  }
  public double getVolumeTabung(){
    return 3.14*Math.pow(radius, 2)*tinggi;
  }
}
