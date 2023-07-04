<?php
// Conexão com o banco de dados
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "bancodados";

$conn = new mysqli($servername, $username, $password, $dbname);

// Verifica a conexão
if ($conn->connect_error) {
    die("Falha na conexão com o banco de dados: " . $conn->connect_error);
}

// Obtém os dados da requisição
$data = json_decode(file_get_contents('php://input'), true);
$nome = $data['nome'];
$cpf = $data['cpf'];
$cargo = $data['cargo'];

// Insere a pergunta no banco de dados
$sql = "INSERT INTO fiscais (nome, cpf, cargo) VALUES ('$nome', '$cpf', '$cargo')";

if ($conn->query($sql) === TRUE) 
{
    $response = array('success' => true, 'message' => 'Fiscal Adcionado Com sucesso');
} 
else {
    $response = array('success' => false, 'message' => 'Fiscal NÃO Adcionado');
}

// Fecha a conexão com o banco de dados
$conn->close();

// Retorna a resposta como JSON
header('Content-Type: application/json');
echo json_encode($response);
?>