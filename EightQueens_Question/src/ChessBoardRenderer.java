public class ChessBoardRenderer {
	public boolean isBlackSquare(int square) {

		// WRITE YOUR LOGIC HERE...
		System.out.println(square);
		float sq_num=square%8;
		if(((square-sq_num)/8)%2==1 && sq_num%2==0)
			return true;
		else if(((square-sq_num)/8)%2==0 && sq_num%2==1)
			return true;
		else
			return false;
			
	}
}
