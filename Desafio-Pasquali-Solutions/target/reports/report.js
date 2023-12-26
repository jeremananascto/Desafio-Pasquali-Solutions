$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/CadastrarPost.feature");
formatter.feature({
  "name": "Cadastrar Post",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@CadstroPost"
    }
  ]
});
formatter.scenario({
  "name": "Cadastrar post com todos os campos preenchidos",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@CadstroPost"
    },
    {
      "name": "@Positivos"
    }
  ]
});
formatter.step({
  "name": "que estou cadastrando um post com todos os campos preenchidos",
  "keyword": "Dado "
});
formatter.match({
  "location": "CadastroPostSteps.que_estou_cadastrando_um_post_com_todos_os_campos_preenchidos()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu envio a solicitacao POST com todos os campos preenchiodos",
  "keyword": "Quando "
});
formatter.match({
  "location": "CadastroPostSteps.eu_envio_a_solicitacao_POST_com_todos_os_campos_preenchiodos()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valido os campos enviados com o codigo de status 201",
  "keyword": "Então "
});
formatter.match({
  "location": "CadastroPostSteps.valido_os_campos_enviados_com_o_codigo_de_status(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Cadastrar post com o campo title sem valor",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@CadstroPost"
    }
  ]
});
formatter.step({
  "name": "que estou cadastrando um post com o campo title sem valor",
  "keyword": "Dado "
});
formatter.match({
  "location": "CadastroPostSteps.que_estou_cadastrando_um_post_com_o_campo_title_sem_valor()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu envio a solicitacao POST com campo title sem valor",
  "keyword": "Quando "
});
formatter.match({
  "location": "CadastroPostSteps.eu_envio_a_solicitacao_POST_com_campo_title_sem_valor()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valido se o campo title esta vazio com o código de status 201",
  "keyword": "Então "
});
formatter.match({
  "location": "CadastroPostSteps.valido_se_o_campo_title_esta_vazio_com_o_código_de_status(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Cadastrar post com o campo body sem valor",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@CadstroPost"
    }
  ]
});
formatter.step({
  "name": "que estou cadastrando um post com o campo body sem valor",
  "keyword": "Dado "
});
formatter.match({
  "location": "CadastroPostSteps.que_estou_cadastrando_um_post_com_o_campo_body_sem_valor()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu envio a solicitacao POST com o campo body sem valor",
  "keyword": "Quando "
});
formatter.match({
  "location": "CadastroPostSteps.eu_envio_a_solicitacao_POST_com_o_campo_body_sem_valor()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valido se o campo body esta vazio com o código de status 201",
  "keyword": "Então "
});
formatter.match({
  "location": "CadastroPostSteps.valido_se_o_campo_body_esta_vazio_com_o_código_de_status(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Cadastrar post com um valor negativo no campo userID",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@CadstroPost"
    }
  ]
});
formatter.step({
  "name": "que estou cadastrando um post com um valor negativo no campo userID",
  "keyword": "Dado "
});
formatter.match({
  "location": "CadastroPostSteps.que_estou_cadastrando_um_post_com_um_valor_negativo_no_campo_userID()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu envio a solicitacao POST com o valor negativo",
  "keyword": "Quando "
});
formatter.match({
  "location": "CadastroPostSteps.eu_envio_a_solicitacao_POST_com_o_valor_negativo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valido se o campo UserID esta com valor negativo com o código de status 201",
  "keyword": "Então "
});
formatter.match({
  "location": "CadastroPostSteps.valido_se_o_campo_UserID_esta_com_valor_negativo_com_o_código_de_status(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Cadastrar post com um valor 0 no campo userID",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@CadstroPost"
    }
  ]
});
formatter.step({
  "name": "que estou cadastrando um post com um valor 0 no campo userID",
  "keyword": "Dado "
});
formatter.match({
  "location": "CadastroPostSteps.que_estou_cadastrando_um_post_com_um_valor_no_campo_userID(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu envio a solicitacao POST com o valor 0  no campo userId",
  "keyword": "Quando "
});
formatter.match({
  "location": "CadastroPostSteps.eu_envio_a_solicitacao_POST_com_o_valor_no_campo_userId(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valido se o campo UserID esta com valor 0 com o código de status 201",
  "keyword": "Então "
});
formatter.match({
  "location": "CadastroPostSteps.valido_se_o_campo_UserID_esta_com_valor_com_o_código_de_status(Integer,Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Cadastrar post com valor 0 no campo userID e campos title e body vazios",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@CadstroPost"
    }
  ]
});
formatter.step({
  "name": "que estou cadastrando um post com valor 0 no campo userId e campos title e body vazios",
  "keyword": "Dado "
});
formatter.match({
  "location": "CadastroPostSteps.que_estou_cadastrando_um_post_com_valor_no_campo_userId_e_campos_title_e_body_vazios(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu envio a solicitacao POST para o endpoint de posts",
  "keyword": "Quando "
});
formatter.match({
  "location": "CadastroPostSteps.eu_envio_a_solicitacao_POST_para_o_endpoint_de_posts()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valido se os campos body e title estao vazios e o campo userID está com o valor 0 com o código de status 201",
  "keyword": "Então "
});
formatter.match({
  "location": "CadastroPostSteps.valido_se_os_campos_body_e_title_estao_vazios_e_o_campo_userID_está_com_o_valor_com_o_código_de_status(Integer,Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Cadastrar post nao enviando o campo userID",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@CadstroPost"
    }
  ]
});
formatter.step({
  "name": "que estou cadastrando um post sem enviar o campo userID",
  "keyword": "Dado "
});
formatter.match({
  "location": "CadastroPostSteps.que_estou_cadastrando_um_post_sem_enviar_o_campo_userID()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu envio a solicitacao POST com o campo userId",
  "keyword": "Quando "
});
formatter.match({
  "location": "CadastroPostSteps.eu_envio_a_solicitacao_POST_com_o_campo_userId()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valido que o campo userId nao esta presente com o código de status 201",
  "keyword": "Então "
});
formatter.match({
  "location": "CadastroPostSteps.valido_que_o_campo_userId_nao_esta_presente_com_o_código_de_status(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Cadastrar post nao enviando o campo title",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@CadstroPost"
    }
  ]
});
formatter.step({
  "name": "que estou cadastrando um post sem enviar o campo title",
  "keyword": "Dado "
});
formatter.match({
  "location": "CadastroPostSteps.que_estou_cadastrando_um_post_sem_enviar_o_campo_title()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu envio a solicitacao POST sem enviar o campo title",
  "keyword": "Quando "
});
formatter.match({
  "location": "CadastroPostSteps.eu_envio_a_solicitacao_POST_sem_enviar_o_campo_title()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valido que o campo title nao esta presente com o código de status 201",
  "keyword": "Então "
});
formatter.match({
  "location": "CadastroPostSteps.valido_que_o_campo_title_nao_esta_presente_com_o_código_de_status(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Cadastrar post nao enviando o campo body",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@CadstroPost"
    }
  ]
});
formatter.step({
  "name": "que estou cadastrando um post sem enviar o campo body",
  "keyword": "Dado "
});
formatter.match({
  "location": "CadastroPostSteps.que_estou_cadastrando_um_post_sem_enviar_o_campo_body()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu envio a solicitacao POST nao enviando o campo body",
  "keyword": "Quando "
});
formatter.match({
  "location": "CadastroPostSteps.eu_envio_a_solicitacao_POST_nao_enviando_o_campo_body()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valido que o campo body nao esta presente com o código de status 201",
  "keyword": "Então "
});
formatter.match({
  "location": "CadastroPostSteps.valido_que_o_campo_body_nao_esta_presente_com_o_código_de_status(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Cadastrar post nao enviando os campos userID, title, body",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@CadstroPost"
    }
  ]
});
formatter.step({
  "name": "que estou cadastrando um post sem enviar os campos userID, title, body",
  "keyword": "Dado "
});
formatter.match({
  "location": "CadastroPostSteps.que_estou_cadastrando_um_post_sem_enviar_os_campos_userID_title_body()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu envio a solicitacao POST para o endpoint não enviando os campos userID, title, body",
  "keyword": "Quando "
});
formatter.match({
  "location": "CadastroPostSteps.eu_envio_a_solicitacao_POST_para_o_endpoint_não_enviando_os_campos_userID_title_body()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valido que o campo userID esta presente com valor nulo e os campos title e body preenchidos com valores",
  "keyword": "Então "
});
formatter.match({
  "location": "CadastroPostSteps.valido_que_o_campo_userID_esta_presente_com_valor_nulo_e_os_campos_title_e_body_preenchidos_com_valores()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Features/ConsultarPosts.feature");
formatter.feature({
  "name": "Buscar Posts Cadastrados",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@BuscarPosts"
    }
  ]
});
formatter.scenario({
  "name": "Buscar todos os posts",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@BuscarPosts"
    }
  ]
});
formatter.step({
  "name": "que estou consultando todos os posts",
  "keyword": "Dado "
});
formatter.match({
  "location": "BuscarPostsSteps.que_estou_consultando_todos_os_posts()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu envio uma solicitação GET para \"/posts\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "BuscarPostsSteps.eu_envio_uma_solicitação_GET_para(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "devo receber uma resposta com status 200",
  "keyword": "Então "
});
formatter.match({
  "location": "BuscarPostsSteps.devo_receber_uma_resposta_com_status(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "devo ver uma lista de posts",
  "keyword": "E "
});
formatter.match({
  "location": "BuscarPostsSteps.devo_ver_uma_lista_de_posts()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Buscar um post por Id",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@BuscarPosts"
    }
  ]
});
formatter.step({
  "name": "que estou consultando um post específico com Id",
  "keyword": "Dado "
});
formatter.match({
  "location": "BuscarPostsSteps.que_estou_consultando_um_post_específico_com_Id()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu envio uma solicitação GET para \"/posts/{postId}\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "BuscarPostsSteps.eu_envio_uma_solicitação_GET_para(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o Id do post é válido",
  "keyword": "E "
});
formatter.match({
  "location": "BuscarPostsSteps.o_Id_do_post_é_válido()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "devo receber uma resposta com status 200",
  "keyword": "Então "
});
formatter.match({
  "location": "BuscarPostsSteps.devo_receber_uma_resposta_com_status(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "devo ver os detalhes do post com Id correspondente",
  "keyword": "E "
});
formatter.match({
  "location": "BuscarPostsSteps.devo_ver_os_detalhes_do_post_com_Id_correspondente()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Buscar post com Id inválido",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@BuscarPosts"
    }
  ]
});
formatter.step({
  "name": "que estou consultando um post com Id inválido",
  "keyword": "Dado "
});
formatter.match({
  "location": "BuscarPostsSteps.que_estou_consultando_um_post_com_Id_inválido()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu envio uma solicitação GET para \"/posts/{postId}\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "BuscarPostsSteps.eu_envio_uma_solicitação_GET_para(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o Id do post é inválido",
  "keyword": "E "
});
formatter.match({
  "location": "BuscarPostsSteps.o_Id_do_post_é_inválido()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "devo receber uma resposta com status 404",
  "keyword": "Então "
});
formatter.match({
  "location": "BuscarPostsSteps.devo_receber_uma_resposta_com_status(Integer)"
});
formatter.result({
  "status": "passed"
});
});