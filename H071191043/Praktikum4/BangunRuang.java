package app;

class BangunRuang {
    float luasPermukaan() {
        System.out.println("Luas Permukaan Bangun Datar");
        return 0;
    }
    float volume() {
        System.out.println("Volume Bangun Ruang");
        return 0;
    }
}
class Kubus extends BangunRuang {
    float sisi;

    @Override
    float luasPermukaan() {
        float luasPermukaan = 6 * (sisi * sisi);
        System.out.printf("Luas Permukaan Kubus\t : " + "%.2f",luasPermukaan);
        System.out.println();
        return luasPermukaan;
    }
    @Override
    float volume() {
        float volume = sisi * sisi * sisi;
        System.out.printf("Volume Kubus\t\t : " + "%.2f",volume);
        System.out.println();
        return volume;
    }
}
class Balok extends BangunRuang {
    float panjang;
    float lebar;
    float tinggi;

    @Override
    float luasPermukaan() {
        float luasPermukaan = (2 * panjang * lebar) + (2 * panjang * tinggi) + (2 * lebar * tinggi);
        System.out.printf("Luas Permukaan Balok\t : " + "%.2f",luasPermukaan);
        System.out.println();
        return luasPermukaan;
    }
    @Override
    float volume() {
        float volume = panjang * lebar * tinggi;
        System.out.printf("Volume Balok\t\t : " + "%.2f",volume);
        System.out.println();
        return volume;
    }
}
class PrismaSegitiga extends BangunRuang {
    float alas;
    float tinggiAlas;
    float tinggiPrisma;
    float luasAlas = (alas * tinggiAlas)/2; 

    @Override
    float luasPermukaan() {
        float luasPermukaan = (2 * luasAlas) + (3 * (tinggiPrisma * alas));
        System.out.printf("Luas Permukaan Kubus\t : " + "%.2f",luasPermukaan);
        System.out.println();
        return luasPermukaan;
    }
    @Override
    float volume() {
        float volume = luasAlas * tinggiPrisma;
        System.out.printf("Volume Kubus\t\t : " + "%.2f",volume);
        System.out.println();
        return volume;
    }
}
class Bola extends BangunRuang {
    float r;

    @Override
    float luasPermukaan() {
        float luasPermukaan = (float) (4 * Math.PI * Math.pow(r, 2));
        System.out.printf("Luas Permukaan Bola\t : " + "%.2f",luasPermukaan);
        System.out.println();
        return luasPermukaan;
    }
    @Override
    float volume() {
        float volume = (float) ((4 * Math.PI * Math.pow(r, 3)) / 3);
        System.out.printf("Volume Bola\t\t : " + "%.2f",volume);
        System.out.println();
        return volume;
    }
}
class Tabung extends BangunRuang {
    float r;
    float tinggi;

    @Override
    float luasPermukaan() {
        float luasPermukaan = (float) ((2 * Math.PI * Math.pow(r, 2)) + (Math.PI * (2 * r) * tinggi));
        System.out.printf("Luas Permukaan Tabung\t : " + "%.2f",luasPermukaan);
        System.out.println();
        return luasPermukaan;
    }
    @Override
    float volume() {
        float volume = (float) (Math.PI * Math.pow(r, 2) * tinggi);
        System.out.printf("Volume Tabung\t\t : " + "%.2f",volume);
        System.out.println();
        return volume;
    }
}