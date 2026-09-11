START

	DEFINE Scanner
	DEFINE prelim
	DEFINE midterm
	DEFINE finals

	OUTPUT "Enter Prelim Score"
	INPUT prelim
	OUTPUT "Enter Midterm Score"
	INPUT midterm
	OUTPUT "Enter Final Score"
	INPUT final

	COMPUTE total = prelim + midterm + final
	COMPUTE average = total / 3

	OUTPUT "===== STUDENT GRADE RESULT ====="
	OUTPUT "Prelim Score: " + prelim
	OUTPUT "Midterm Score: " + midterm
	OUTPUT "Final Score: " + final
	OUTPUT "Total Score: " + total
	OUTPUT "Average: " + average
END