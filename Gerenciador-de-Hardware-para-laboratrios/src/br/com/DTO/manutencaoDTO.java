
package br.com.DTO;

import java.sql.Date;


public class manutencaoDTO {
    private int id_mn;
    private Date data_mn;
    private String status_mn;
    private String hora_mn;
    private String tipo_mn;
    private UsuarioDTO id_usu;
    private maquinaDTO id_eq;
    private pecasDTO id_pc;

    public int getId_mn() {
        return id_mn;
    }

    public void setId_mn(int id_mn) {
        this.id_mn = id_mn;
    }

    public Date getData_mn() {
        return data_mn;
    }

    public void setData_mn(Date data_mn) {
        this.data_mn = data_mn;
    }

    public String getStatus_mn() {
        return status_mn;
    }

    public void setStatus_mn(String status_mn) {
        this.status_mn = status_mn;
    }

    public String getHora_mn() {
        return hora_mn;
    }

    public void setHora_mn(String hora_mn) {
        this.hora_mn = hora_mn;
    }

    public String getTipo_mn() {
        return tipo_mn;
    }

    public void setTipo_mn(String tipo_mn) {
        this.tipo_mn = tipo_mn;
    }

    public UsuarioDTO getId_usu() {
        return id_usu;
    }

    public void setId_usu(UsuarioDTO id_usu) {
        this.id_usu = id_usu;
    }

    public maquinaDTO getId_eq() {
        return id_eq;
    }

    public void setId_eq(maquinaDTO id_eq) {
        this.id_eq = id_eq;
    }

    public pecasDTO getId_pc() {
        return id_pc;
    }

    public void setId_pc(pecasDTO id_pc) {
        this.id_pc = id_pc;
    }
    
    
    
}
