package view;
import controller.PilhaConverteDecimal;
import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
		PilhaConverteDecimal controller = new PilhaConverteDecimal();
		
		int decimal = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um valor"));
		String valorConvertido = controller.decToBin(decimal);
		System.out.println(valorConvertido);
	}

}
