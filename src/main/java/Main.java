import com.barros.control.PessoaControl;
import com.barros.view.GeralView;

public class Main {
	public static void main(String[] args) {
		GeralView gView = new GeralView();
		PessoaControl pC = new PessoaControl();
		
		gView.Inicio();
		pC.receber();
		
	}
}
