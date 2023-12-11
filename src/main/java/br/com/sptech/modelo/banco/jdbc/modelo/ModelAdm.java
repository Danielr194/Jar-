package br.com.sptech.modelo.banco.jdbc.modelo;

public class ModelAdm extends ModelUsuario {

    public ModelAdm() {
    }

    public ModelAdm(Integer idUsuario, String nome, String email, String senha, String fraseSeguranca, String area, String cargo, Integer fkEmpresa, Integer fkTipoUsuario) {
        super(idUsuario, nome, email, senha, fraseSeguranca, area, cargo, fkEmpresa, fkTipoUsuario);
    }


    @Override
    public String toString() {
        return "AdmModel{}";
    }
}

