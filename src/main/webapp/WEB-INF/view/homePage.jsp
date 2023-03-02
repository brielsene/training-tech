<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Training tech</title>
</head>

 <style>
    body {
      background-color: #282c34;
      color: #fff;
      font-family: Arial, sans-serif;
      margin: 0;
      padding: 0;
    }

    header {
      background-color: #61dafb;
      display: flex;
      justify-content: space-between;
      align-items: center;
      padding: 20px;
    }

    h1 {
      font-size: 48px;
      text-align: center;
      margin-top: 80px;
    }

    section {
      display: flex;
      flex-direction: column;
      align-items: center;
      margin: 50px;
    }

    p {
      font-size: 24px;
      margin: 10px 0;
    }

    button {
      background-color: #61dafb;
      color: #fff;
      font-size: 20px;
      padding: 10px 20px;
      border: none;
      border-radius: 5px;
      cursor: pointer;
    }

    button:hover {
      background-color: #282c34;
      color: #fff;
      
    }

    footer {
      background-color: #282c34;
      display: flex;
      justify-content: center;
      align-items: center;
      padding: 10px;
    }

    footer p {
      font-size: 16px;
      margin: 0;
    }
  </style>
</head>

<body>
  <header>
    
    <a href="/trainingtech/controller?acao=Logout">
    	<button>Logout</button>
    </a>
  </header>

  <h1>Olá ${usuarioLogado.nome}</h1>

  <section>
    <p>Peso: ${usuarioLogado.peso}</p>
    <p>Altura: ${usuarioLogado.altura}</p>
    
    <a href="/trainingtech/controller?acao=CalculaImc&id=${usuarioLogado.id }">
     <button >Calcular imc</button>
     </a>
    <p class="imc"></p>
    IMC: ${imc }
   
  </section>

<br><br><br><br><br><br><br><br><br><br><br><br>
  <footer>
    <p>Training Tech &copy; 2023</p>
  </footer>
</body>
</html>