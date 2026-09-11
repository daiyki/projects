START

	DEFINE Scanner
	DEFINE prodName
	DEFINE prodPrice
	DEFINE qty
	DEFINE amtPaid
	DEFINE subtotal
	DEFINE change

	OUTPUT "Enter product name"
	INPUT prodName 
	OUTPUT "Enter price"
	INPUT prodPrice
	OUTPUT "Enter quantity"
	INPUT qty 
	OUTPUT "Enter amount paid"
	INPUT prodPrice

	COMPUTE subtotal = prodPrice * qty
	COMPUTE change = amtPaid - subtotal

	OUTPUT "===== SALES TRANSACTION ====="
	OUTPUT "Product: " + prodName
	OUTPUT "Price: " + prodPrice
	OUTPUT "Quantity: " + qty
	OUTPUT "Subtotal: " + subtotal
	OUTPUT "Amount Paid: " + amtPaid
	OUTPUT "Change: " + change

END