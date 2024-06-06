echo "Enter a string: "
read string
vowels=0
consonants=0
for (( i=0; i<${#string}; i++)); do
	char=${string:$i:1}
	if [[ $char == [aeiou] ]]; then
		((vowels++))
	elif [[ $char == [bcdefghjklmnpqrstvwxyz] ]]; then
		((consonants++))
	fi
done
echo "Number of vowels: " $vowels
echo "Number of consonants: " $consonants

