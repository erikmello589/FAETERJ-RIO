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
$rg = $data['rg'];
$cpf = $data['cpf'];
$email = $data['email'];
$cargo = $data['cargo'];

// Insere a pergunta no banco de dados
$sql = "INSERT INTO candidatos (nome, rg, cpf, email, cargo) VALUES ('$nome', '$rg', '$cpf', '$email', '$cargo')";

if ($conn->query($sql) === TRUE) 
{
    $response = array('success' => true, 'message' => 'Candidato Adcionado Com sucesso');
} 
else {
    $response = array('success' => false, 'message' => 'Candidato NÃO adcionado');
}

// Fecha a conexão com o banco de dados
$conn->close();

// Retorna a resposta como JSON
header('Content-Type: application/json');
echo json_encode($response);
?>