package pack;

public class Buffermethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer var= new StringBuffer("Eesha");
		var.append(" Eka");
		System.out.println(var);
		var.insert(6,"jin ");
		System.out.println(var);
		var.replace(6, 9,"ddd");
	    System.out.println(var);
        var.delete(6, 9);
        System.out.println(var);
        var.reverse();	
        System.out.println(var);
        }

}

