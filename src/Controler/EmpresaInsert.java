package Controler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.EmpresaDao;
import Model.Empresa;

/**
 * Servlet implementation class EmpresaInsert
 */
@WebServlet("/EmpresaInsert")
public class EmpresaInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpresaInsert() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Empresa empresa;
		EmpresaDao empresaDao;
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
		
		doGet(request, response);
	}

}
