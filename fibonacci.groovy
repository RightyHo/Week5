int fibo(int n){
	if(n==1 || n==2){
		return 1
	} else {
		int result = fibo(n-1) + fibo(n-2)
		return result
	}
}

int fibonacci(int n){
	int prev = 1, prior = 1, result
	if(n==1 || n==2){
		return 1
	} else {
		for(i=3;i<=n;i++){
			result = prev + prior
			prior = prev
			prev = result
		}
		return result
	}
}

println "Result of Recursive Fibonacci method: " + fibo(8)
println "Result of Iterative Fibonacci method: " + fibonacci(8)