import java.util.Scanner;
class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    Kubus kubus = new Kubus();
    Balok balok = new Balok();
    Prisma prisma = new Prisma();
    Bola bola = new Bola();
    Tabung tabung = new Tabung();
    Persegi persegi = new Persegi();
    PersegiPanjang pp = new PersegiPanjang();
    Lingkaran lingkar = new Lingkaran();
    Segitiga segitiga = new Segitiga();
    Trapesium trapesium = new Trapesium();

    Boolean ulang = false;
    while(true){
      System.out.println("===== BANGUN RUANG =====");
      System.out.println("1. KUBUS");
      System.out.println("2. BALOK");
      System.out.println("3. PRISMA SEGITIGA");
      System.out.println("4. BOLA");
      System.out.println("5. TABUNG");
      System.out.println("...");
      System.out.println();
      System.out.println("===== BANGUN DATAR =====");
      System.out.println("6. PERSEGI");
      System.out.println("7. PERSEGI PANJANG");
      System.out.println("8. LINGKARAN");
      System.out.println("9. SEGITIGA");
      System.out.println("10. TRAPESIUM");
      System.out.println("...");
      System.out.println();
      System.out.print("==>");
      int chose = scan.nextInt();
      if(chose==1){
        System.out.println("------------------------");
        System.out.print("Input panjang sisi : ");
        kubus.setPanjang(scan.nextInt());
        System.out.println("Luas kubus   : "+kubus.getLuasKubus()+" cm");
        System.out.println("Volume kubus : "+kubus.getVolumeKubus()+" cm");
      }
      else if(chose==2){
        System.out.println("------------------------");
        System.out.println("Input panjang : ");
        balok.setPanjang(scan.nextInt());
        System.out.println("Input lebar   : ");
        balok.setLebar(scan.nextInt());
        System.out.println("Input tinggi  : ");
        balok.setTinggi(scan.nextInt());
        System.out.println("Luas Balok   : "+balok.getLuasBalok()+" cm");
        System.out.println("Volume Balok : "+balok.getVolumeBalok()+" cm");
      }
      else if(chose==3){
        System.out.println("------------------------");
        System.out.println("Input panjang : ");
        prisma.setPanjang(scan.nextInt());
        System.out.println("Input lebar   : ");
        prisma.setLebar(scan.nextInt());
        System.out.println("Input tinggi  : ");
        prisma.setTinggi(scan.nextInt());
        System.out.println("Luas Prisma   : "+prisma.getLuasPrisma()+" cm");
        System.out.println("Volume Prisma : "+prisma.getVolumePrisma()+" cm");
      }
      else if(chose==4){
        System.out.println("------------------------");
        System.out.println("Input radius : ");
        bola.setRadius(scan.nextInt());
        System.out.println("Luas Bola   : "+bola.getLuasBola()+" cm");
        System.out.println("Volume Bola : "+bola.getVolumeBola()+" cm");
      }
      else if(chose==5){
        System.out.println("------------------------");
        System.out.println("Input radius : ");
        tabung.setRadius(scan.nextInt());
        System.out.println("Input tinggi : ");
        tabung.setTinggi(scan.nextInt());
        System.out.println("Luas Tabung   : "+tabung.getLuasTabung()+" cm");
        System.out.println("Volume Tabung : "+tabung.getVolumeTabung()+" cm");
      }
      else if(chose==6){
        System.out.println("------------------------");
        System.out.println("Input panjang : ");
        persegi.setPanjang(scan.nextInt());
        System.out.println("Luas Persegi     : "+persegi.getLuasPersegi()+" cm");
        System.out.println("Keliling Persegi : "+persegi.getKelilingPersegi()+" cm");
      }
      else if(chose==7){
        System.out.println("------------------------");
        System.out.println("Input panjang : ");
        pp.setPanjang(scan.nextInt());
        System.out.println("Input lebar   : ");
        pp.setLebar(scan.nextInt());
        System.out.println("Luas Persegi Panjang     : "+pp.getLuasPP()+" cm");
        System.out.println("Keliling Persegi Panjang : "+pp.getKelilingPP()+" cm");
      }else if(chose==8){
        System.out.println("------------------------");
        System.out.println("Input radius : ");
        lingkar.setRadius(scan.nextInt());
        System.out.println("Luas Lingkaran     : "+lingkar.getLuasLingkaran()+" cm");
        System.out.println("Keliling Lingkaran : "+lingkar.getKelilingLingkaran()+" cm");
      }
      else if(chose==9){
        System.out.println("------------------------");
        System.out.println("Input alas   : ");
        segitiga.setSisiAlas(scan.nextInt());
        System.out.println("Input tinggi : ");
        segitiga.setTinggi(scan.nextInt());
        System.out.printf("Luas Segitiga     : %.2f cm \n",segitiga.getLuasSegitiga());
        System.out.printf("Keliling Segitiga : %.2f cm \n",segitiga.getKelilingSegitiga());
      }
      else if(chose==10){
        System.out.println("------------------------");
        System.out.println("Input sisi alas   : ");
        trapesium.setSisiAlas(scan.nextInt());
        System.out.println("Input sisi atas   : ");
        trapesium.setSisiAtas(scan.nextInt());
        System.out.println("Input tinggi      : ");
        trapesium.setTinggi(scan.nextInt());
        System.out.println("Input sisi miring : ");
        trapesium.setSisiMiring(scan.nextInt());
        System.out.printf("Luas Trapesium     : %.2f cm \n",trapesium.getLuasTrapesium());
        System.out.printf("Keliling Trapesium : %.2f cm \n",trapesium.getKelilingTrapesium());
      }else{
        break;
      }
      //
      System.out.println("------------------------");
      System.out.println("continue(y/n)?");
      String chose2 = scan.next();
      if(chose2.equals("y")){
        continue;
      }else{
        break;
      }
    }
  }
}
