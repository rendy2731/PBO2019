package app;

class BangunDatar {
    float luas(){
        System.out.println("Luas Bangun Datar");
        return 0;
    }
    float keliling() {
        System.out.println("Keliling bangun Datar");
        return 0;
    }
}
class Persegi extends BangunDatar {
    float sisi;

    @Override
    float luas() {
        float luas = sisi * sisi;
        System.out.printf("Luas Persegi\t : " + "%.2f",luas);
        System.out.println();
        return luas;
    }
    @Override
    float keliling() {
        float keliling = 4 * sisi;
        System.out.printf("Keliling Persegi : " + "%.2f",keliling);
        System.out.println();
        return keliling;
    }
}
class Lingkarang extends BangunDatar {
    float r;

    @Override
    float luas() {
        float luas = (float) (Math.PI * Math.pow(r, 2));
        System.out.printf("Luas Lingkarang\t\t : " + "%.2f", luas);
        System.out.println();
        return luas;
    }
    @Override
    float keliling() {
        float keliling = (float) (Math.PI * (2 * r));
        System.out.printf("Keliling Lingkarang\t : " + "%.2f",keliling);
        System.out.println();
        return keliling;
    }
}
class PersegiPanjang extends BangunDatar {
    float panjang;
    float lebar;

    @Override
    float luas() {
        float luas = panjang * lebar;
        System.out.printf("Luas Persegi Panjang\t : " + "%.2f",luas);
        System.out.println();
        return luas;
    }
    @Override
    float keliling() {
        float keliling = 2 * (panjang + lebar);
        System.out.printf("Keliling Persegi Panjang : " + "%.2f",keliling);
        System.out.println();
        return keliling;
    }
}
class Segitiga extends BangunDatar {
    float alas;
    float tinggi;
    float sisiB;
    float sisiC;

    @Override
    float luas() {
        float luas = (alas * tinggi)/2;
        System.out.printf("Luas Segitiga\t\t : " + "%.2f",luas);
        System.out.println();
        return luas;
    }
    @Override
    float keliling() {
        float keliling = sisiB + sisiC + alas;
        System.out.printf("Keliling Segitiga\t : " + "%.2f",keliling);
        System.out.println();
        return keliling;
    }
}
class Trapesium extends BangunDatar {
    float sisiA;
    float sisiB;
    float sisiC;
    float sisiD;
    float tinggi;

    @Override
    float luas() {
        float luas = ((sisiA + sisiC) * tinggi)/2;
        System.out.printf("Luas Trapesium\t\t : " + "%.2f",luas);
        System.out.println();
        return luas;
    }
    @Override
    float keliling() {
        float keliling = sisiA + sisiB + sisiC + sisiD;
        System.out.printf("Keliling Trapesium\t : " + "%.2f",keliling);
        System.out.println();
        return keliling;
    }
}
