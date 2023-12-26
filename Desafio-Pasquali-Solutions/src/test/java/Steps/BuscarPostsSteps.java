package Steps;

import Endpoints.Endpoint;
import Logic.BuscarPostLogic;
import Model.CadastroPostResponse;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class BuscarPostsSteps {

    BuscarPostLogic buscarPostLogic = new BuscarPostLogic();


    @Dado("que estou consultando todos os posts")
    public void que_estou_consultando_todos_os_posts() {
        buscarPostLogic.prepararRequisicaoGet();
    }

    @Quando("eu envio uma solicitação GET para {string}")
    public void eu_envio_uma_solicitação_GET_para(String string) {
        buscarPostLogic.enviarGetRequest(Endpoint.POSTS);
    }

    @Então("devo receber uma resposta com status {int}")
    public void devo_receber_uma_resposta_com_status(Integer int1) {
        buscarPostLogic.validarCamposEStatus(int1);
    }

    @Então("devo ver uma lista de posts")
    public void devo_ver_uma_lista_de_posts() {
        buscarPostLogic.validarListaDePosts(100);
        buscarPostLogic.validarHeaders();
    }

    @Dado("que estou consultando um post específico com Id")
    public void que_estou_consultando_um_post_específico_com_Id() {
        buscarPostLogic.prepararRequisicaoGet();
    }

    @Quando("o Id do post é válido")
    public void o_Id_do_post_é_válido() {
        buscarPostLogic.BuscarPorId(Endpoint.POSTS, 2);
    }

    @Então("devo ver os detalhes do post com Id correspondente")
    public void devo_ver_os_detalhes_do_post_com_Id_correspondente() {
        buscarPostLogic.validarCamposEStatus(200);
        buscarPostLogic.validarHeaders();
    }


    @Dado("que estou consultando um post com Id inválido")
    public void que_estou_consultando_um_post_com_Id_inválido() {
        buscarPostLogic.prepararRequisicaoGet();
    }

    @Quando("o Id do post é inválido")
    public void o_Id_do_post_é_inválido() {
        buscarPostLogic.BuscarPorId(Endpoint.POSTS, 0);
    }

    @Então("a mensagem de erro deve indicar que o post não foi encontrado {int}")
    public void a_mensagem_de_erro_deve_indicar_que_o_post_nao_foi_encontrado(Integer int1) {
        buscarPostLogic.validarCamposEStatus(int1);

    }


}
