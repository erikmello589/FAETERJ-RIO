<?php
if (isset($_POST['enviar']) && !empty($_POST['enunciado'])) {
    $enunciado = $_POST['enunciado1'];
	$pergunta = $_POST['enunciado'];

    // Abre o arquivo "perguntas.txt" em modo de escrita
    $file = fopen("perguntas.txt", "a");

    // Escreve o enunciado da pergunta no arquivo
    fwrite($file, $enunciado . PHP_EOL);
	fwrite($file, $pergunta . ";" . PHP_EOL);

    // Fecha o arquivo
    fclose($file);

    $mensagem = "Pergunta salva com sucesso!";
} else {
    $mensagem = "Erro ao salvar a pergunta. Certifique-se de preencher o enunciado corretamente.";
}
?>

<!DOCTYPE html>
<html>
<head>
    <title>Salvar Pergunta - Jogo de Perguntas e Respostas</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
        }

        h1 {
            text-align: center;
        }

        .message {
            text-align: center;
            margin-bottom: 20px;
        }

        .button-container {
            text-align: center;
        }

        .button-container button {
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
    <h1>Salvar Pergunta - Jogo de Perguntas e Respostas</h1>

    <div class="message">
        <?php echo $mensagem; ?>
    </div>

    <div class="button-container">
        <button onclick="window.location.href = 'home.php'">Voltar à Home</button>
    </div>
</body>
</html>
