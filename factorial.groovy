int facto(int n){
	if(n == 1){
		return 1
	} else {
		int result = n * facto(n - 1)
		return result
	}
}

int factorial(int n){
	int result = 1
	for(i=1;i<=n;i++){
		result = result * (i)
	}
	return result
}


println "The result using recursion is: " + facto(8)
println "The result using iteration is: " + factorial(8)