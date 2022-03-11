
public class Test {
	public static void main(String args[]) 
	{
		MagicSquare one = new MagicSquare();
		
		one.fill();
		//one.riggedNotMagic();
		if(one.valid() && one.isMagic()) {
			System.out.println("Magic");
		}
		else if(!one.valid()){
			System.out.println("Not Valid");
		}
		else if(!one.isMagic()){
			System.out.println("Not Magic");
		}
	}
}
