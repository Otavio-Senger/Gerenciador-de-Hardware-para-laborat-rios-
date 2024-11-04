
package br.com.DTO;


public class laboratorioDTO {
   private int id_lab;
   private String letra_lab;
   private maquinaDTO id_eq;
   private manutencaoDTO id_mn;

    public int getId_lab() {
        return id_lab;
    }

    public void setId_lab(int id_lab) {
        this.id_lab = id_lab;
    }

    public String getLetra_lab() {
        return letra_lab;
    }

    public void setLetra_lab(String letra_lab) {
        this.letra_lab = letra_lab;
    }

    public maquinaDTO getId_eq() {
        return id_eq;
    }

    public void setId_eq(maquinaDTO id_eq) {
        this.id_eq = id_eq;
    }

    public manutencaoDTO getId_mn() {
        return id_mn;
    }

    public void setId_mn(manutencaoDTO id_mn) {
        this.id_mn = id_mn;
    }
   
   
}
