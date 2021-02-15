Proceso Calculadora
	
	
	Definir simbolo Como Caracter;
	Definir num1, num2, numOp Como Entero;
	Definir res Como Real;
	
	Escribir "Introduce el simbolo para tu operacion +,-,*,/,e";
	Leer simbolo;
	
	SI (simbolo='+' O simbolo='-' O simbolo='*' O simbolo='/' O simbolo='e') Entonces
		//simbolo valido, pedir números y operar
		Escribir "Introduce el primer numero";
		Leer num1;
		
		Escribir "Introduce el segundo número";
		Leer num2;
		
		Si simbolo = "+" Entonces
			res <- num1 + num2;
		SiNo
			Si simbolo = "-" Entonces
				res <- num1 - num2;
			SiNo
				Si simbolo = "*" Entonces
					res <- num1 * num2;
				SiNo
					Si simbolo = "/" Entonces
						res <- num1 / num2;
					SiNo
						Si simbolo = "e" Entonces
							res <- redon(num1/num2);
						FinSi
					FinSi
				FinSi
				
			FinSi
		FinSi
		
	SiNo
		Escribir "Operación no reconocida";
	FinSi
	
	
	Escribir  "El resultado es ", res;
	
	
FinProceso