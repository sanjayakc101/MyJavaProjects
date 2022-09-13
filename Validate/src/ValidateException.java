import javax.swing.JOptionPane;
public class ValidateException {
	public static void main(String[] args) {

		while (true) {
			String id=JOptionPane.showInputDialog("Enter Id");
			if (id == "0"){
				JOptionPane.showMessageDialog(null,"Bye");
				return;
			}
			String name=JOptionPane.showInputDialog("Enter name");
			String out;
			try {
				validateId(id);
				out="Validated id: "+ id +"\n";
				JOptionPane.showMessageDialog(null,out);
				validateName(name);
				out="Validated name: "+ name +"\n";
				JOptionPane.showMessageDialog(null,out);
			}
			catch (IdNotAWholeNumberException e) {
				String msg=e.getMessage();
				System.out.println(msg);
			}
			catch (IdOutOfRangeException e) {
				String msg=e.getMessage();
				System.out.println(msg);
			}
			catch (NotAlphabeticException e) {
				String msg=e.getMessage();
				System.out.println(msg);
			}
			catch (NotSpecifiedException e) {

				String msg=e.getMessage();
				System.out.println(msg);
			}
			int i = Integer.parseInt(id);
			if(i == 0) {
				JOptionPane.showMessageDialog(null,"Bye");
				return;
			}
		}
	}
	public static void validateId (String sId)
			throws IdNotAWholeNumberException,
			IdOutOfRangeException {
		int idInt;
		try {
			idInt=Integer.parseInt(sId);
		}
		catch (NumberFormatException ex){
			throw new IdNotAWholeNumberException();
		}
		if (idInt < 1 || idInt > 999) {
			throw new IdOutOfRangeException ( ) ;
		}
	}
	public static void validateName (String name)
			throws NotSpecifiedException,
			NotAlphabeticException {
		if (name.equals("")){
			throw new NotSpecifiedException ();  
		}
		else if(!name.matches("[a-zA-Z]+")){
			throw new NotAlphabeticException ();
		}
	}
}