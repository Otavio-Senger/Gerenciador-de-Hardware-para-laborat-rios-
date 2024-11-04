
package br.com.DTO;


public class maquinaDTO {
  private int id_eq;
  private String status;
  private laboratorioDTO letra_lab;
  private pecasDTO id_pc;
  private manutencaoDTO id_mn;

    public int getId_eq() {
        return id_eq;
    }

    public void setId_eq(int id_eq) {
        this.id_eq = id_eq;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public laboratorioDTO getLetra_lab() {
        return letra_lab;
    }

    public void setLetra_lab(laboratorioDTO id_lab) {
        this.letra_lab = id_lab;
    }

    public pecasDTO getId_pc() {
        return id_pc;
    }

    public void setId_pc(pecasDTO id_pc) {
        this.id_pc = id_pc;
    }

    public manutencaoDTO getId_mn() {
        return id_mn;
    }

    public void setId_mn(manutencaoDTO id_mn) {
        this.id_mn = id_mn;
    }

   
  
  
  
  
        
}
