package steps;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class LoginSteps extends  {

    @Dado() do("^que estou na tela de login$")
    public void que_estou_na_tela_de_login() {

    }

    @Quando() do("^preencho login \"([^\"]*)\" e senha \"([^\"]*)\"$")
    public void preencho_login_e_senha(String arg1, String arg2) {

    }

    @Quando("^clico em Login$")
    public void clico_em_Login() {

    }

    @Então() tão("^vejo mensagem de login com sucesso$")
    public void vejo_mensagem_de_login_com_sucesso() {

    }

    @Dado("^que estou na tela de login$")
    public void queEstouNaTelaDeLogin() {
    }

    @Quando("^preencho login \"([^\"]*)\" e senha \"([^\"]*)\"$")
    public void preenchoLoginESenha(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Então("^vejo mensagem de login com sucesso$")
    public void vejoMensagemDeLoginComSucesso() {
    }

    @Então("^vejo mensagem \"([^\"]*)\" de campo não preenchido$")
    public void vejoMensagemDeCampoNaoPreenchido(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
