<!DOCTYPE html>
<html>
<head>
    <title>Exibir Perguntas - Jogo de Perguntas e Respostas</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
        }

        h1 {
            text-align: center;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }

        table th, table td {
            padding: 10px;
            border: 1px solid #ccc;
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

        .button-container button.edit {
            background-color: #4287f5;
        }

        .button-container button.delete {
            background-color: #f54242;
        }
		
		.button-container {
            text-align: center;
        }

        .button-container input {
            padding: 10px 20px;
            background-color: #4CAF50;
            color: #fff;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
    </style>
</head>
<body>
    <h1>Exibir Perguntas - Jogo de Perguntas e Respostas</h1>

    <table>
        <thead>
            <tr>
                <th>Pergunta e alternativas</th>
                <th>Ações</th>
            </tr>
        </thead>
        <tbody>
            <?php
            // Ler as perguntas do arquivo "perguntas.txt"
            $perguntas = file("perguntas.txt", FILE_IGNORE_NEW_LINES);

            foreach ($perguntas as $pergunta) {
                echo "<tr>";
                echo "<td>" . $pergunta . "</td>";
                echo "<td class='button-container'>";
                echo "<button class='edit' onclick='editarPergunta(\"" . $pergunta . "\")'>Editar Pergunta</button>";
                echo "<button class='delete' onclick='excluirPergunta(\"" . $pergunta . "\")'>Excluir Pergunta</button>";
                echo "</td>";
                echo "</tr>";
            }
            ?>
        </tbody>
    </table>
	
	<div class="button-container">
        <input type='button' value='Voltar a Home' onclick="window.location.href = 'home.php'">
    </div>
</body>
</html>