rows=5
for((i=1;i<=rows;i++)); do
	for((j=rows-1;j>=i;j--)); do
		echo -n " "
	done
	for((k=1;k<=i;k++)); do
		echo -n "* "
	done
	echo
done

