package Controler;

import Dao.EmpresaDao;
import Model.*;
 
import javax.servlet.http.HttpServletRequest;  

public class EmpresaController {
	
	HttpServletRequest request;
	Empresa empresa;
	EmpresaDao empresaDao;
	public void inserir(){
		try {

            String cnpj= request.getParameter("cnpj");
            String inscricao=request.getParameter("inscricao");
            String razao=request.getParameter("razao");
            
            String email=request.getParameter("email");
            String tel=request.getParameter("telefone");
            empresa= new Empresa();
            empresaDao= new EmpresaDao();
            
            empresa.setCnpj(cnpj);
            empresa.setInscricaoestadual(inscricao);
            empresa.setRazao(razao);
            empresa.setEmail(email);
            empresa.setTelefone(tel);
            empresa.setIdEnde(1);

          
        		 empresaDao.inserir(empresa);
            
            request.setAttribute("Empresa", "Gravado com sucesso!");  
            request.getRequestDispatcher("index.jsp");
            
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
  
  
             
        
         
       

}
