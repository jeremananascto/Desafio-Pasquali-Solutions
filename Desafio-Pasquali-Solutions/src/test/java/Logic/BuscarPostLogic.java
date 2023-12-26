package Logic;

import Model.CadastroPostResponse;
import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;

import java.util.List;


public class BuscarPostLogic {

    private Response response;

    private RequestSpecification requestSpecification;



    public void prepararRequisicaoGet() {
        // Configuração básica da requisição
        requestSpecification = RestAssured.given()
                .header("Content-Type", "application/json")
                .log().all();  // Log detalhes da requisição no console (opcional, para fins de depuração)
    }

    public Response enviarGetRequest(String endpoint) {

        if (requestSpecification == null) {
            throw new IllegalStateException("Chame prepararRequisicaoPost() antes de enviar a requisição.");
        }

        // Enviar a requisição Get
        ValidatableResponse validatableResponse = requestSpecification
                .get(endpoint)
                .then()
                .log().all();  // Log detalhes da resposta no console (opcional, para fins de depuração)

        response = validatableResponse.extract().response();
        return response;
    }





    public Response BuscarPorId(String endpoint,int id) {

        if (requestSpecification == null) {
            throw new IllegalStateException("Chame prepararRequisicaoPost() antes de enviar a requisição.");
        }

        // Enviar a requisição Get
        ValidatableResponse validatableResponse = requestSpecification
                .get(endpoint+ id)
                .then()
                .log().all();  // Log detalhes da resposta no console (opcional, para fins de depuração)

        response = validatableResponse.extract().response();
        return response;
    }



    public void validarCamposEStatus(int statusCode) {
        Assertions.assertNotNull(response, "A resposta não pode ser nula.");

        // Valide o código de status usando a resposta da solicitação
        int statusCodeAtual = response.getStatusCode();
        Assertions.assertEquals(statusCode, statusCodeAtual, "Código de status não corresponde ao esperado.");

    }




    public void validarListaDePosts(int expectedSize) {
        // Extrai a lista de posts da resposta
        List<CadastroPostResponse> listaDePosts = response.jsonPath().getList("$", CadastroPostResponse.class);

        // Valida o tamanho da lista
        Assert.assertEquals(expectedSize, listaDePosts.size());

        // Valida cada post individualmente
        for (CadastroPostResponse post : listaDePosts) {
            validarPost(post);
        }
    }

    private void validarPost(CadastroPostResponse post) {

        Assert.assertNotNull(post.getUserId());
        Assert.assertNotNull(post.getId());
        Assert.assertNotNull(post.getTitle());
        Assert.assertNotNull(post.getBody());

    }

    public void validarHeaders() {
        Headers headers = response.getHeaders();

        String contentType = headers.getValue("Content-Type");
        Assert.assertEquals("application/json; charset=utf-8", contentType);

    }
}





