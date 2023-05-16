<!DOCTYPE html>
<html>
<head>
    <title>Criar Pergunta - Jogo de Perguntas e Respostas</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
        }

        h1 {
            text-align: center;
        }

        label {
            font-weight: bold;
        }

        textarea {
            width: 100%;
            height: 150px;
        }
		
		input {
            width: 100%;
        }

        .button-container {
            text-align: center;
            margin-top: 20px;
        }

        .button-container button {
            padding: 10px 20px;
            background-color: #4CAF50;
            color: #fff;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            margin-right: 10px;
        }

        .button-container button.cancel {
            background-color: #ccc;
        }
    </style>
</head>
<body>
    <h1>Criar Pergunta - Jogo de Perguntas e Respostas</h1>

    <form action="salvar_pergunta.php" method="post">
        <div>
            <label for="enunciado">Insira o enunciado da questão:</label>
        </div>
        <div>
			<br>
			<input id="enunciado1" name="enunciado1" placeholder="Digite o enunciado da pergunta:">
			<br><br>
            <textarea id="enunciado" name="enunciado" placeholder="Digite as alternativas da questão que você digitou acima"></textarea>
        </div>
        <div class="button-container">
            <button type="submit" name="enviar">Enviar Pergunta</button>
            <button type="button" class="cancel" onclick="location.href='home.php'">Cancelar</button>
        </div>
    </form>
</body>
</html>
