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

// Consulta todas as perguntas de texto
$sql = "SELECT * FROM candidatos ORDER BY nome ASC";
$result = $conn->query($sql);

// Array para armazenar os candidatos
$candidatos = array();

if ($result->num_rows > 0) {
    while ($row = $result->fetch_assoc()) {
        // Adiciona o candidato ao array de candidatos
        $candidato = array(
            'id' => $row['id_candidato'],
            'nome' => $row['nome'],
            'rg' => $row['rg'],
            'cpf' => $row['cpf'],
            'email' => $row['email'],
            'cargo' => $row['cargo']
        );
        $candidatos[] = $candidato;
    }
}


// Fecha a conexão com o banco de dados
$conn->close();

// Retorna a resposta como JSON
$response = array(
    'candidatos' => $candidatos
);

header('Content-Type: application/json');
echo json_encode($response);
?>