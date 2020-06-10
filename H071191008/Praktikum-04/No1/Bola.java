class Bola extends BangunRuang{

  public double getLuasBola(){
    return 4*3.14*Math.pow(radius, 2);
  }
  public double getVolumeBola(){
    return (4/3)*3.14*Math.pow(radius, 3);
  }
}
