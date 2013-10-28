int getHanoiMoves(int nDisks) {
	if(nDisks == 1){
		return 1
	} else {
		int result = getHanoiMoves(nDisks-1)+ 1 + getHanoiMoves(nDisks-1)
		return result
	}
}
























