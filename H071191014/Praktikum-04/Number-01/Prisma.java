class Prisma extends BangunRuang{

  
  public double getLuasPrisma(){
    return (panjang*lebar)+(3*panjang*tinggi);
  }
  public double getVolumePrisma(){
    return panjang*lebar*tinggi;
  }
}
