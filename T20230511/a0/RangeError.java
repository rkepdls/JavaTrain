package T20230511.a0;

public class RangeError extends RuntimeException {
	RangeError(int n) { super("범위 밖 값: "+n); }
	}		
	class ParameterRangeError extends RangeError {
		ParameterRangeError(int n) { super(n); }
	}	
	class ResultRangeError extends RangeError {
		public ResultRangeError(int n) { super(n); }
	}
