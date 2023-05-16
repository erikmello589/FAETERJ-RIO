<?php
    if (isset($_POST['pergunta']) 
	{
      $pergunta = $_POST['pergunta'];

      // Fazer algo com a variável enviada
      $nomeArquivo = 'perguntasDiscusiva.txt';
      $pergProcurada = "$pergunta";

      // Ler o conteúdo do arquivo para um array
      $linhas = file($nomeArquivo);

      // Abrir o arquivo em modo de escrita
      $arquivo = fopen($nomeArquivo, 'w');

      if ($arquivo) 
	  {
        foreach ($linhas as $linha) 
		{
          // Verificar se a linha contém a variável procurada
          if (strpos($linha, $pergProcurada) === false) 
		  {
            // Se não contém, escrever a linha novamente no arquivo
            fwrite($arquivo, $linha);
          }
        }
        fclose($arquivo);

        $mensagem =  "resposta de sucesso";
      } 
	  else 
	  {
        $mensagem = "Não foi possível abrir o arquivo.";
      }
    }
	else 
	{
      $mensagem = "deu ruim";
    }
?>

<!DOCTYPE html>
<html>
<head>
    <title>Excluir Pergunta - Jogo de Perguntas e Respostas</title>
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
    <h1>Excluir Pergunta - Jogo de Perguntas e Respostas</h1>

    <div class="message">
        <?php echo $mensagem; ?>
    </div>

    <div class="button-container">
        <button onclick="window.location.href = 'home.php'">Voltar à Home</button>
    </div>
</body>
</html>
