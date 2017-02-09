/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_2;

/**
 * Nindia Cahyaning Putri
 * 1301154567
 * IF3907
 */
public class Mahasiswa {
  

    private String NIM;
    private String Nama;
    private String Status;
    char [] Nilai;
    int i ; //digunakan untuk mengisi nilai array Nilai
    
    public Mahasiswa() {
        this.Status = "Tidak Lulus";
        this.i = 0;
        this.Nilai = new char [10];
        
    }
    /* Constructor mengeset string status = Tidak Lulus, dan mengeset nilai i = 0
    **menginstansiasi array Nilai berukuran 10
    */
    
    public Mahasiswa(String NIM, String Nama) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Status = "Tidak Lulus";
        this.i = 0;
        this.Nilai = new char [10];   
    }
    
    /* Setter dan Getter */

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public void setNilai(char Nilai) {
        this.Nilai[i] = Nilai;
    }
    
    

    public String getNIM() {
        return NIM;
    }

    public String getNama() {
        return Nama;
    }

    public String getStatus() {
        return Status;
    }

    public char getNilai(int i) {
        return Nilai[i];
    }

    

   public void addNilai (char Nilai){
        this.Nilai[i] = Nilai;
        i=i+1;
        }

    
   
    public char cekNilai (Mahasiswa m) 
    {
        int x;
        char y;
        for (char x = 'A' ; y <= 'E' ; y++) 
        {
            for (int z=0 ; z<i ; z++) 
            {
                if (y == Nilai [z])
                {
                    for (int p=0; p<=i; p++)
                    {   
                    if (y==m.Nilai [p])
                    return y;
   
                    }
                }
            }
        }
        return 0;
    }
}