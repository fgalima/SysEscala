package Dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.sun.media.jfxmedia.events.NewFrameEvent;

import Controler.Conexao;
import Model.Empresa;

public class EmpresaDao extends Conexao {

	public static void inserir(Empresa e) throws SQLException{
		getConnection();
		
		stmt= conexao.prepareStatement("INSERT INTO empresa(cnpjempresa,inscricaoestadual, razao,email, telefone,idEndereco) VALUES (?,?,?,?,?,?)");
		
		stmt.setString(1, e.getCnpj());
		stmt.setString(2, e.getInscricaoestadual());
		stmt.setString(3, e.getRazao());
		stmt.setString(4, e.getEmail());
		stmt.setString(5, e.getTelefone());
		stmt.setInt(6, e.getIdEnde());
		stmt.executeUpdate();
	}
	public static void main(String[] args) throws SQLException {
		Empresa empresa= new Empresa();
		EmpresaDao empresaDao= new EmpresaDao();
		empresa.setCnpj("5525");
        empresa.setInscricaoestadual("17372");
        empresa.setRazao("maria");
        empresa.setEmail("teste@gmail.com");
        empresa.setTelefone("3774940");
        empresa.setIdEnde(1);

        empresaDao.inserir(empresa);
        
		
	}
}
