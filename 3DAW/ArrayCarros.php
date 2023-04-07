<!DOCTYPE html>
<html>
<head>
</head>
<body>
<h1> 3DAW </h1>

<?php

	echo "<h2> Atividade array de carros </h2>";
	echo "<br>";

	$Carros = array ("Uno", "Palio", "Gol", "Passat");

	for($x=0 ; $x<count($Carros); $x++)
	{
		echo "<p> Carro ", $x+1, ": $Carros[$x]</p>";
		echo "<br>";
	}
?>
</body>
</html>
