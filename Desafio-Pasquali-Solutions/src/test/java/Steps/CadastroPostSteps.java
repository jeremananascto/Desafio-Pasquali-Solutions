package Steps;

import Endpoints.Endpoint;
import Logic.CadastroPostLogic;
import Model.CadastroPostRequest;
import TestData.DataPostRequest;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import io.restassured.response.Response;


public class CadastroPostSteps {
    private Response response;
    private CadastroPostRequest cadastroPostRequest;
    private CadastroPostRequest cadastroPostRequestComTitleSemValor;

    private CadastroPostRequest cadastroPostRequestComBodySemValor;
    private CadastroPostRequest cadastroPostRequestComUserIdNegativo;

    private CadastroPostRequest cadastroPostRequestComValorZeroNoUserId;

    private CadastroPostRequest cadastroPostRequestComCampoUserIdECamposTitleEbodyVazios;

    private CadastroPostRequest cadastroPostRequestSemEnviarOCampoUserId;

    private CadastroPostRequest cadastroPostRequestSemEnviarOCampoTitle;

    private CadastroPostRequest cadastroPostRequestSemEnviarOCampoBody;

    private CadastroPostRequest cadastroPostRequestSemEnviarCampoUserIdTitleBody;
    CadastroPostLogic cadastroPostLogic = new CadastroPostLogic();


    @Dado("que estou cadastrando um post com todos os campos preenchidos")
    public void que_estou_cadastrando_um_post_com_todos_os_campos_preenchidos() {
        cadastroPostLogic.prepararRequisicaoPost();

    }

    @Quando("eu envio a solicitacao POST com todos os campos preenchiodos")
    public void eu_envio_a_solicitacao_POST_com_todos_os_campos_preenchiodos() {
        cadastroPostRequest = DataPostRequest.criarCadastroPostRequestComDadosPadrao();
        cadastroPostLogic.enviarPostRequest(Endpoint.POSTS, cadastroPostRequest.toJsonString());



    }

    @Então("valido os campos enviados com o codigo de status {int}")
    public void valido_os_campos_enviados_com_o_codigo_de_status(Integer int1) {
        cadastroPostLogic.validarCamposEStatus(int1);
        cadastroPostLogic.validarValorDoAtributo("title", cadastroPostRequest.getTitle());
        cadastroPostLogic.validarValorDoAtributo("body", cadastroPostRequest.getBody());
        cadastroPostLogic.validarValorDoAtributo("userId", String.valueOf(cadastroPostRequest.getUserId()));




    }

    @Dado("que estou cadastrando um post com o campo title sem valor")
    public void que_estou_cadastrando_um_post_com_o_campo_title_sem_valor() {
        cadastroPostLogic.prepararRequisicaoPost();

    }

    @Quando("eu envio a solicitacao POST com campo title sem valor")
    public void eu_envio_a_solicitacao_POST_com_campo_title_sem_valor() {
        cadastroPostRequestComTitleSemValor = DataPostRequest.criarCadastroPostRequestComTitleSemValor();
        cadastroPostLogic.enviarPostRequest(Endpoint.POSTS, cadastroPostRequestComTitleSemValor.toJsonString());


    }

    @Então("valido se o campo title esta vazio com o código de status {int}")
    public void valido_se_o_campo_title_esta_vazio_com_o_código_de_status(Integer int1) {
        cadastroPostLogic.validarCamposEStatus(int1);
        cadastroPostLogic.validarValorDoAtributo("title", "");
        cadastroPostLogic.validarValorDoAtributo("body", cadastroPostRequestComTitleSemValor.getBody());
        cadastroPostLogic.validarValorDoAtributo("userId", String.valueOf(cadastroPostRequestComTitleSemValor.getUserId()));




    }

    @Dado("que estou cadastrando um post com o campo body sem valor")
    public void que_estou_cadastrando_um_post_com_o_campo_body_sem_valor() {
        cadastroPostLogic.prepararRequisicaoPost();

    }

    @Quando("eu envio a solicitacao POST com o campo body sem valor")
    public void eu_envio_a_solicitacao_POST_com_o_campo_body_sem_valor() {
        cadastroPostRequestComBodySemValor = DataPostRequest.criarCadastroPostRequestComBodySemValor();
        cadastroPostLogic.enviarPostRequest(Endpoint.POSTS, cadastroPostRequestComBodySemValor.toJsonString());

    }


    @Então("valido se o campo body esta vazio com o código de status {int}")
    public void valido_se_o_campo_body_esta_vazio_com_o_código_de_status(Integer int1) {

        cadastroPostLogic.validarCamposEStatus(int1);
        cadastroPostLogic.validarValorDoAtributo("title", cadastroPostRequestComBodySemValor.getTitle());
        cadastroPostLogic.validarValorDoAtributo("body", "");
        cadastroPostLogic.validarValorDoAtributo("userId", String.valueOf(cadastroPostRequestComBodySemValor.getUserId()));

    }

    @Dado("que estou cadastrando um post com um valor negativo no campo userID")
    public void que_estou_cadastrando_um_post_com_um_valor_negativo_no_campo_userID() {
        cadastroPostLogic.prepararRequisicaoPost();

    }

    @Quando("eu envio a solicitacao POST com o valor negativo")
    public void eu_envio_a_solicitacao_POST_com_o_valor_negativo() {
        cadastroPostRequestComUserIdNegativo = DataPostRequest.criarCadastroPostRequestComUserIdNegativo();
        cadastroPostLogic.enviarPostRequest(Endpoint.POSTS, cadastroPostRequestComUserIdNegativo.toJsonString());


    }

    @Então("valido se o campo UserID esta com valor negativo com o código de status {int}")
    public void valido_se_o_campo_UserID_esta_com_valor_negativo_com_o_código_de_status(Integer int1) {


        cadastroPostLogic.validarCamposEStatus(int1);
        cadastroPostLogic.validarValorDoAtributo("title", cadastroPostRequestComUserIdNegativo.getTitle());
        cadastroPostLogic.validarValorDoAtributo("body", cadastroPostRequestComUserIdNegativo.getBody());
        cadastroPostLogic.validarValorDoAtributo("userId", String.valueOf(cadastroPostRequestComUserIdNegativo.getUserId()));


    }

    @Dado("que estou cadastrando um post com um valor {int} no campo userID")
    public void que_estou_cadastrando_um_post_com_um_valor_no_campo_userID(Integer int1) {

        cadastroPostLogic.prepararRequisicaoPost();


    }

    @Quando("eu envio a solicitacao POST com o valor {int}  no campo userId")
    public void eu_envio_a_solicitacao_POST_com_o_valor_no_campo_userId(Integer int1) {
        cadastroPostRequestComValorZeroNoUserId = DataPostRequest.criarCadastroPostRequestComUserIdZero();
        cadastroPostLogic.enviarPostRequest(Endpoint.POSTS, cadastroPostRequestComValorZeroNoUserId.toJsonString());

    }

    @Então("valido se o campo UserID esta com valor {int} com o código de status {int}")
    public void valido_se_o_campo_UserID_esta_com_valor_com_o_código_de_status(Integer int1, Integer int2) {


        cadastroPostLogic.validarCamposEStatus(int2);
        cadastroPostLogic.validarValorDoAtributo("title", cadastroPostRequestComValorZeroNoUserId.getTitle());
        cadastroPostLogic.validarValorDoAtributo("body", cadastroPostRequestComValorZeroNoUserId.getBody());
        cadastroPostLogic.validarValorDoAtributo("userId", String.valueOf(cadastroPostRequestComValorZeroNoUserId.getUserId()));


    }

    @Dado("que estou cadastrando um post com valor {int} no campo userId e campos title e body vazios")
    public void que_estou_cadastrando_um_post_com_valor_no_campo_userId_e_campos_title_e_body_vazios(Integer int1) {
        cadastroPostLogic.prepararRequisicaoPost();
    }

    @Quando("eu envio a solicitacao POST para o endpoint de posts")
    public void eu_envio_a_solicitacao_POST_para_o_endpoint_de_posts() {
        cadastroPostRequestComCampoUserIdECamposTitleEbodyVazios = DataPostRequest.criarCadastroPostRequestComUserIdZeroEcamposTitleBodyVazios();
        cadastroPostLogic.enviarPostRequest(Endpoint.POSTS, cadastroPostRequestComCampoUserIdECamposTitleEbodyVazios.toJsonString());

    }

    @Então("valido se os campos body e title estao vazios e o campo userID está com o valor {int} com o código de status {int}")
    public void valido_se_os_campos_body_e_title_estao_vazios_e_o_campo_userID_está_com_o_valor_com_o_código_de_status(Integer int1, Integer int2) {


        cadastroPostLogic.validarCamposEStatus(int2);
        cadastroPostLogic.validarValorDoAtributo("title", "");
        cadastroPostLogic.validarValorDoAtributo("body", "");
        cadastroPostLogic.validarValorDoAtributo("userId", String.valueOf(cadastroPostRequestComCampoUserIdECamposTitleEbodyVazios.getUserId()));

    }

    @Dado("que estou cadastrando um post sem enviar o campo userID")
    public void que_estou_cadastrando_um_post_sem_enviar_o_campo_userID() {
        cadastroPostLogic.prepararRequisicaoPost();



    }

    @Quando("eu envio a solicitacao POST com o campo userId")
    public void eu_envio_a_solicitacao_POST_com_o_campo_userId() {
        cadastroPostRequestSemEnviarOCampoUserId = DataPostRequest.criarCadastroPostRequestSemEnviarOCampoUserId();
        cadastroPostLogic.enviarPostRequest(Endpoint.POSTS, cadastroPostRequestSemEnviarOCampoUserId.toJsonString());


    }

    @Então("valido que o campo userId nao esta presente com o código de status {int}")
    public void valido_que_o_campo_userId_nao_esta_presente_com_o_código_de_status(Integer int1) {





        cadastroPostLogic.validarCamposEStatus(int1);
        cadastroPostLogic.validarValorDoAtributo("title", cadastroPostRequestSemEnviarOCampoUserId.getTitle());
        cadastroPostLogic.validarValorDoAtributo("body", cadastroPostRequestSemEnviarOCampoUserId.getBody());
        cadastroPostLogic.validarAusenciaAtributo("userId");




    }

    @Dado("que estou cadastrando um post sem enviar o campo title")
    public void que_estou_cadastrando_um_post_sem_enviar_o_campo_title() {
        cadastroPostLogic.prepararRequisicaoPost();


    }

    @Quando("eu envio a solicitacao POST sem enviar o campo title")
    public void eu_envio_a_solicitacao_POST_sem_enviar_o_campo_title() {
        cadastroPostRequestSemEnviarOCampoTitle = DataPostRequest.criarCadastroPostRequestSemEnviarOCampoOTitle();
        cadastroPostLogic.enviarPostRequest(Endpoint.POSTS, cadastroPostRequestSemEnviarOCampoTitle.toJsonString());



    }

    @Então("valido que o campo title nao esta presente com o código de status {int}")
    public void valido_que_o_campo_title_nao_esta_presente_com_o_código_de_status(Integer int1) {
        cadastroPostLogic.validarCamposEStatus(int1);
        cadastroPostLogic.validarValorDoAtributo("title", cadastroPostRequestSemEnviarOCampoTitle.getTitle());
        cadastroPostLogic.validarValorDoAtributo("body", cadastroPostRequestSemEnviarOCampoTitle.getBody());

        cadastroPostLogic.validarAusenciaAtributo("title");


    }

    @Dado("que estou cadastrando um post sem enviar o campo body")
    public void que_estou_cadastrando_um_post_sem_enviar_o_campo_body() {
        cadastroPostLogic.prepararRequisicaoPost();



    }

    @Quando("eu envio a solicitacao POST nao enviando o campo body")
    public void eu_envio_a_solicitacao_POST_nao_enviando_o_campo_body() {
        cadastroPostRequestSemEnviarOCampoBody = DataPostRequest.criarCadastroPostRequestSemEnviarOCampoBody();
        cadastroPostLogic.enviarPostRequest(Endpoint.POSTS, cadastroPostRequestSemEnviarOCampoBody.toJsonString());


    }

    @Então("valido que o campo body nao esta presente com o código de status {int}")
    public void valido_que_o_campo_body_nao_esta_presente_com_o_código_de_status(Integer int1) {

        cadastroPostLogic.validarCamposEStatus(int1);
        cadastroPostLogic.validarValorDoAtributo("title", cadastroPostRequestSemEnviarOCampoBody.getTitle());
        cadastroPostLogic.validarValorDoAtributo("userId", String.valueOf(cadastroPostRequestSemEnviarOCampoBody.getUserId()));

        cadastroPostLogic.validarAusenciaAtributo("body");


    }


    @Dado("que estou cadastrando um post sem enviar os campos userID, title, body")
    public void que_estou_cadastrando_um_post_sem_enviar_os_campos_userID_title_body() {
        cadastroPostLogic.prepararRequisicaoPost();


    }

    @Quando("eu envio a solicitacao POST para o endpoint não enviando os campos userID, title, body")
    public void eu_envio_a_solicitacao_POST_para_o_endpoint_não_enviando_os_campos_userID_title_body() {
        cadastroPostRequestSemEnviarCampoUserIdTitleBody = DataPostRequest.criarCadastroPostRequestSemEnviarOCampoBodyTitleUserId();
        cadastroPostLogic.enviarPostRequest(Endpoint.POSTS, cadastroPostRequestSemEnviarCampoUserIdTitleBody.toJsonString());



    }

    @Então("valido que o campo userID esta presente com valor nulo e os campos title e body preenchidos com valores")
    public void valido_que_o_campo_userID_esta_presente_com_valor_nulo_e_os_campos_title_e_body_preenchidos_com_valores() {

        cadastroPostLogic.validarCamposEStatus(201);
        cadastroPostLogic.validarAusenciaAtributo("body");
        cadastroPostLogic.validarAusenciaAtributo("title");
        cadastroPostLogic.validarAusenciaAtributo("userId");


    }


}
