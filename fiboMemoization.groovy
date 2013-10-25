int fibo(int n){
	if(n==1 || n==2){
		return 1
	} else {
		int result = fibo(n-1) + fibo(n-2)
		return result
	}
}

int fibonacci(int n){
	int[] fibMemo = new int[n+1]
	if(n==1 || n==2){
		fibMemo[n] = 1
		return fibMemo[n]
	} else if(fibMemo[n] != 0){
		return fibMemo[n]
	} else {
		fibMemo[n] = fibonacci(n-1) + fibonacci(n-2)
		return fibMemo[n]
	}
}

println "Key in the element number of the fibonacci sequence that you would like to know: "
int seq = Integer.parseInt(System.console().readLine())

println "Run with memoization or not?"
println "1 - with memoization"
println "2 - without memoization"
int option = Integer.parseInt(System.console().readLine())

switch(option){
case 1:	println "Result of Recursive Fibonacci method WITH memoization: " + fibonacci(seq)  
		break;
case 2: println "Result of Recursive Fibonacci method without memoization: " + fibo(seq)
		break;
}
