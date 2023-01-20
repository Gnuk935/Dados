
import com.barros.control.PessoaControl;
import com.barros.control.VeiculoControl;
import com.barros.view.GeralView;

public class Main {
	public static void main(String[] args) {
		GeralView gView = new GeralView();
		PessoaControl pC = new PessoaControl();
		VeiculoControl vC = new VeiculoControl();
		
		gView.Inicio();
		pC.receberPessoa();
		vC.receberVeiculo();
		gView.fim();

	}
}
