echo "Enter number: "
read number
reverse=0
n=$number
while [[ $n -ne 0 ]]; do
	remainder=$((n%10))
	reverse=$((reverse * 10 + remainder))
	n=$((n/10))
done

echo "Reverse is: " $reverse
