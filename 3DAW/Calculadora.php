<!DOCTYPE HTML>
<html lang = "pt-br">
<head>
   <title>Atividade Calculadora 3DAW</title>
   <meta charset = "UTF-8">
</head>
<body>
   <form action="" method="post" >
      Primeiro Numero (Em caso de sen/cos/raiz, esse será o número levado em conta): <input name="num1" type="text" placeholder="0"><br>
	  <br>
      Segundo numero: <input name="num2" type="text" placeholder="0"><br>
	  <br>
      <input type="submit" name="operacao" value="+">     
      <input type="submit" name="operacao" value="-">     
      <input type="submit" name="operacao" value="*">  
	  <input type="submit" name="operacao" value="/">   	  
      <input type="submit" name="operacao" value="seno">
	  <input type="submit" name="operacao" value="cosseno">     
	  <input type="submit" name="operacao" value="raiz">     
   </form> 
<?php

   $numero1 = $_POST['num1'];
   $numero2 = $_POST['num2'];
   $op = $_POST['operacao'];

   if( !empty($op) ) 
   {
      if($op == '+')
         $c = $numero1 + $numero2;
      else if($op == '-')
         $c = $numero1 - $numero2;
      else if($op == '*')
         $c = $numero1*$numero2;
      else if($op == '/')
         $c = $numero1/$numero2;
	  else if($op == 'seno')
		 $c = sin($numero1);
	  else if($op == 'cosseno')
		 $c = cos($numero1);
	  else
		 $c = sqrt($numero1);


      echo "<br><p>O resultado da operação é: $c<p>";
   }

?>       
</body>
</html>