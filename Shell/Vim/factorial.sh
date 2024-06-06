n=5
p=1
for((i=1; i<=n; i++)); do
	p=$((p*i))
done
echo "5 factorial is " $p
