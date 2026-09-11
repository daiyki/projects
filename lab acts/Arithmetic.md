START

	DEFINE Scanner
	DEFINE firstNumber
	DEFINE secondNumber
	
	OUTPUT "Enter First Number:"
	INPUT firstNumber
	OUTPUT "Enter Second Number:"
	INPUT secondNumber

	COMPUTE sum = firstNumber + secondNUmber
	COMPUTE difference = firstNumber - secondNumber
	COMPUTE product = firstNumber * secondNumber
	COMPUTE quotient = firstNumber / secondNumber
	COMPUTE modulo = firstNUmber % secondNumber

	OUTPUT "===== ARITHMETIC OPERATIONS ====="
	OUTPUT "First Number: " + firstNumber
	OUTPUT "Second Number: " + secondNumber
	OUTPUT "Addition: " + sum
	OUTPUT "Subtraction: " + difference
	OUTPUT "Multiplication: " + product
	OUTPUT "Division: " + quotient
	OUTPUT "Modulus: " + modulo
END