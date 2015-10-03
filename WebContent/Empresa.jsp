<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Empresa</title>

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">

</head>
<body>

  <form class="form-horizontal" action="Controler.EmpresaInsert" method="post" role="form">
    <div class="container">
    <fieldset>
  <legend>Informações da Empresa</legend>
  <div class="form-group">
  <label class="control-label col-sm-2">CNPJ*</label>
  <div class="col-sm-7">
   <input type="text" class="form-control" id="cnpj" name="cnpj" placeholder="Cnpj Empresa">
  </div>
</div>
   <div class="form-group">
    <label class="control-label col-sm-2" for="email">Inscrição Estadual*</label>
    <div class="col-sm-7">
      <input type="text" class="form-control" id="inscricao" name="inscricao" placeholder="Email">
    </div>
  </div>

  <div class="form-group">
    <label class="control-label col-sm-2">Razão Social*</label>
    <div class="col-sm-7">
     <input type="text" class="form-control" id="razao" name="razao">
    </div>
  </div>
 

  <div class="form-group">
    <label class="control-label col-sm-2">Email*</label>
    <div class="col-sm-7">
     <input type="text" class="form-control" id="email" name="email">
    </div>
  </div>
  
  <div class="form-group">
    <label class="control-label col-sm-2">Telefone*</label>
    <div class="col-sm-7">
     <input type="text" class="form-control" id="telefone" name="telefone">
    </div>
  </div>

            
    <div class="form-group"> 
    <div class="col-sm-offset-2 col-sm-6">
      <button type="submit" class="btn btn-default pull-right">Enviar</button>
    </div>
  </div>
</fieldset>
</div>
</form>

 

   <div id="footer">
      <div class="container">
        <p class="muted credit">SysTiPortal - 2015 By Matheus Sousa.</p>
      </div>
    </div>
    

</body>
</html>