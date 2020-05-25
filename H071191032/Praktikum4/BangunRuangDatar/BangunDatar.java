public class BangunDatar {
    final double pi = 3.14;
    double panjang, lebar;
}

class Persegi extends BangunDatar {
    Persegi(double sisi) {
        this.panjang = sisi;
    }

    double getLuas() {
        return this.panjang * this.panjang;
    }

    double getKeliling() {
        return 4 * this.panjang;
    }
}

class PersegiPanjang extends BangunDatar {
    PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    double getLuas() {
        return this.panjang * this.lebar;
    }

    double getKeliling() {
        return 2 * (this.panjang + this.lebar);
    }
}

class Lingkaran extends BangunDatar {
    Lingkaran(double jarijari) {
        this.panjang = jarijari;
    }

    double getLuas() {
        return this.pi * this.panjang * this.panjang;
    }

    double getKeliling() {
        return 2 * this.pi * this.panjang;
    }
}

class Segitiga extends BangunDatar {
    double tinggi;
    Segitiga(double alas, double tinggi, double sisiMiring) {
        this.panjang = alas;
        this.lebar = sisiMiring;
        this.tinggi = tinggi;
    }

    double getLuas() {
        return 0.5 * this.panjang * this.tinggi;
    }

    double getKeliling() {
        return this.panjang + this.lebar + this.tinggi;
    }
}

class Trapesium extends BangunDatar {
    double sisiAtas, sisiMiring;
    Trapesium(double alas, double tinggi, double sisiAtas, double sisiMiring) {
        this.panjang = alas;
        this.lebar = tinggi;
        this.sisiAtas = sisiAtas;
        this.sisiMiring = sisiMiring;
    }

    double getLuas() {
        return ((this.panjang + this.sisiAtas) * this.lebar) / 2;
    }

    double getKeliling() {
        return this.panjang + this.lebar + this.sisiAtas + this.sisiMiring;
    }
}


