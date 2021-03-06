package com.ivanfebriansyah.uts;

public class Siswa {
    int id;
    String nama, kelas, nomer, semester,nilaikehadiran, nilaitugas, nilaiuts, nilaiuas, joiningdate,
            nilaiakhir;

    public Siswa(int id, String nama, String kelas, String nomer, String semester,
                 String nilaikehadiran, String nilaitugas, String nilaiuts, String nilaiuas,
                 String nilaiakhir, String joiningdate){
        this.id=id;
        this.nama=nama;
        this.kelas=kelas;
        this.nomer=nomer;
        this.semester=semester;
        this.nilaikehadiran=nilaikehadiran;
        this.nilaitugas=nilaitugas;
        this.nilaiuts=nilaiuts;
        this.nilaiuas=nilaiuas;
        this.nilaiakhir=nilaiakhir;
        this.joiningdate=joiningdate;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getKelas() {
        return kelas;
    }

    public String getNomer() {
        return nomer;
    }

    public String getSemester() {
        return semester;
    }

    public String getNilaikehadiran() {
        return nilaikehadiran;
    }

    public String getNilaitugas() {
        return nilaitugas;
    }

    public String getNilaiuts() {
        return nilaiuts;
    }

    public String getNilaiuas() {
        return nilaiuas;
    }

    public String getJoiningdate() {
        return joiningdate;
    }

    public String getNilaiakhir() {
        return nilaiakhir;
    }



    public static String hitungNilaiAkhir(String nilaikehadiran, String nilaitugas, String nilaiuts, String nilaiuas) {
        double total = (0.1 * Integer.parseInt(nilaikehadiran)) + (0.2 *  Integer.parseInt(nilaitugas))
                + (0.3 *  Integer.parseInt(nilaiuts)) + (0.4 *  Integer.parseInt(nilaiuas));
        String strGrade;

        if (total >= 80&&total<=100) {
            strGrade = "A";
        } else if (total >= 70&&total<=80) {
            strGrade = "B";
        } else if (total >= 60&&total<=70) {
            strGrade = "C";
        } else if (total >= 50&&total<=60) {
            strGrade = "D";
        } else {
            strGrade = "E";
        }

        return String.valueOf(total+" Grade "+strGrade);
    }


}
