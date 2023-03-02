<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Cadastro</title>
	<style>
		.login-form {
		    width: 400px;
		    margin: 0 auto;
		    background-color: #f2f2f2;
		    border: 1px solid #ccc;
		    border-radius: 5px;
		    padding: 20px;
		}

		.login-form h2 {
		    text-align: center;
		    font-size: 28px;
		    margin-bottom: 20px;
		}

		.form-group {
		    margin-bottom: 20px;
		}

		.form-group label {
		    display: block;
		    font-size: 18px;
		    margin-bottom: 5px;
		}

		.form-group input[type="text"],
		.form-group input[type="password"] {
		    width: 100%;
		    padding: 10px;
		    font-size: 16px;
		    border: 1px solid #ccc;
		    border-radius: 3px;
		    box-sizing: border-box;
		}

		input[type="submit"] {
		    display: block;
		    margin: 0 auto;
		    padding: 10px 20px;
		    font-size: 18px;
		    background-color: #4CAF50;
		    color: #fff;
		    border: none;
		    border-radius: 3px;
		    cursor: pointer;
		}
	</style>
</head>
<body>
	<div class="login-form">
		<h2>Cadastro de peso e altura</h2>
		<form action="/trainingtech/controller?acao=CadastroPesoEAltura" method="post">
			<div class="form-group">
				<label for="text">Altura:</label>
				<input type="text"  name="altura" required>
			</div>
			<div class="form-group">
				<label for="text">Peso:</label>
				<input type="text" name="peso" required>
			</div>
			<input type="submit" value="Calcular">
		</form>
	</div>
	<input type="hidden" value="${id }" id="id"/>
</body>
</html>