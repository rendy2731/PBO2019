public class BangunRuang {
    final double pi = 3.14;
    double panjang, lebar, tinggi;
}

class Kubus extends BangunRuang {
    Kubus(double panjang) {
        this.panjang = panjang;
    }

    double getVolume() {
        return this.panjang * this.panjang * this.panjang;
    }

    double getLuasPermukaan() {
        return 6 * (this.panjang * this.panjang);
    }
}

class Balok extends BangunRuang {
    Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    double getVolume() {
        return this.panjang * this.lebar * this.tinggi;
    }  
    
    double getLuasPermukaan() {
        return 2 * ((this.panjang * this.lebar) + (this.panjang * this.tinggi) + (this.lebar * this.tinggi));
    }
}

class PrismaSegitiga extends BangunRuang {
    PrismaSegitiga(double alasSegitiga, double tinggiSegitiga, double tinggi) {
        panjang = alasSegitiga;
        lebar = tinggiSegitiga;
        this.tinggi = tinggi;
    }

    double getVolume() {
        return (0.5 * this.panjang * this.lebar) * this.tinggi;
    }

    double getLuasPermukaan() {
        return (this.panjang * 3) * this.tinggi + (this.panjang * this.lebar);
    }
}

class Bola extends BangunRuang {
    Bola(double jarijari) {
        panjang = jarijari;
    }

    double getVolume() {
        return 4/3 * this.pi * Math.pow(panjang, 3);
    }

    double getLuasPermukaan() {
        return 4 * this.pi * panjang * panjang;
    }
}

class Tabung extends BangunRuang {
    Tabung(double jarijari, double tinggi) {
        panjang = jarijari;
        this.tinggi = tinggi;
    }

    double getVolume() {
        return this.pi * panjang * panjang * this.tinggi;
    }

    double getLuasPermukaan() {
        return (2 * this.pi * panjang * panjang) + (this.pi * 2 * panjang * tinggi);
    }
}