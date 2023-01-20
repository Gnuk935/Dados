
import com.barros.control.PessoaControl;
import com.barros.control.VeiculoControl;
import com.barros.scanner.Scan;
import com.barros.view.GeralView;

public class Main {
	public static void main(String[] args) {
		GeralView gView = new GeralView();
		PessoaControl pC = new PessoaControl();
		VeiculoControl vC = new VeiculoControl();

		gView.Inicio();
		pC.receberPessoa();
		gView.fim();
		gView.cadVeic();
		int x = Scan.vrauInt();
		if (x == 1) {
			vC.receberVeiculo();
		}
	}
}
