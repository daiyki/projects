START

	DEFINE Scanner
	DEFINE distance
	DEFINE time
	DEFINE speed

	OUTPUT "Enter distance traveled (km): "
	INPUT distance
	OUTPUT "Enter travel time (hours): "
	INPUT time

	COMPUTE speed = distance / time

	OUTPUT "===== TRAVEL INFORMATION ====="
	OUTPUT "Distance: ", distance
	OUTPUT "Time: ", time
	OUTPUT "Speed: ", speed

END