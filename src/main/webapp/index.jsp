<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
<title>Verifica triângulo</title>
</head>
<body>
	<div class="container">
		<h1 class="mt-3">Verifica triângulo</h1>
		<form method="post" action="TrianguloServlet">
		  <div class="mb-3 col-4">
		    <label for="exampleInputValor1" class="form-label">Lado 1</label>
		    <input type="text" class="form-control" name="lado1">
		  </div>
		 <div class="mb-3 col-4">
		    <label for="exampleInputValor2" class="form-label">Lado 2</label>
		    <input type="text" class="form-control" name="lado2">
		  </div>
		  <div class="mb-3 col-4">
		    <label for="exampleInputValor2" class="form-label">Lado 3</label>
		    <input type="text" class="form-control" name="lado3">
		  </div>
		  <button type="reset" class="btn btn-primary">Limpar</button>	
		   <button type="submit" class="btn btn-primary">Verificar</button>	
		</form>
	</div>
</body>
</html>