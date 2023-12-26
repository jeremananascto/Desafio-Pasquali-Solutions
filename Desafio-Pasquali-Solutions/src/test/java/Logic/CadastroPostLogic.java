package Logic;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import org.junit.jupiter.api.Assertions;



public class CadastroPostLogic {



    private Response response;


    public CadastroPostLogic() {


    }


    private RequestSpecification requestSpecification;

    public void prepararRequisicaoPost() {
        // Configuração básica da requisição
        requestSpecification = RestAssured.given()
                .header("Content-Type", "application/json")
                .log().all();  // Log detalhes da requisição no console (opcional, para fins de depuração)
    }

    public Response enviarPostRequest(String endpoint, String requestBody) {
        // Certifique-se de que 'prepararRequisicaoPost()' foi chamado antes
        if (requestSpecification == null) {
            throw new IllegalStateException("Chame prepararRequisicaoPost() antes de enviar a requisição.");
        }

        // Enviar a requisição POST
        ValidatableResponse validatableResponse = requestSpecification
                .body(requestBody)
                .post(endpoint)
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


    public void validarValorDoAtributo(String atributo, String valorEsperado) {
        // Certifique-se de que a resposta não é nula
        if (response == null) {
            throw new IllegalStateException("A resposta não pode ser nula. Certifique-se de fazer a requisição antes de validar.");
        }

        // Extrai o valor do atributo do corpo da resposta
        String valorDoAtributo = response.jsonPath().getString(atributo);

        // Valida se o valor do atributo é igual ao valor esperado
        Assertions.assertEquals(valorEsperado, valorDoAtributo, "O valor do atributo '" + atributo + "' não corresponde ao esperado.");
    }

    public void validarAusenciaAtributo(String atributo) {
        if (response == null) {
            System.out.println("A requisição ainda não foi feita. Chame enviarPostRequest antes de validar.");
            return;
        }

        // Obtém o corpo da resposta como string
        String responseBody = response.getBody().asString();

        // Usa a biblioteca Jackson para analisar o JSON
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            JsonNode jsonNode = objectMapper.readTree(responseBody);

            // Verifica se o atributo não está presente no JSON
            Assertions.assertFalse(jsonNode.has(atributo), "O atributo '" + atributo + "' não deve estar presente na resposta JSON");
        } catch (Exception e) {
            // Lida com a exceção, se necessário
            e.printStackTrace();
        }
    }


}




