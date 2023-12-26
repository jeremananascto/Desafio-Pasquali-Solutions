package TestData;

import Model.CadastroPostRequest;
import Support.Utils;



public class DataPostRequest {


    public static CadastroPostRequest criarCadastroPostRequestComDadosPadrao() {
        return CadastroPostRequest.builder().title(Utils.gerarTextoAleatorio())
                .body(Utils.gerarTextoAleatorio())
                .userId(Utils.gerarUserIdAleatorio())
                .build();
    }

    public static CadastroPostRequest criarCadastroPostRequestComTitleSemValor() {
        return CadastroPostRequest.builder().title("")
                .body(Utils.gerarTextoAleatorio())
                .userId(Utils.gerarUserIdAleatorio())
                .build();


    }

    public static CadastroPostRequest criarCadastroPostRequestComBodySemValor() {
        return CadastroPostRequest.builder().title(Utils.gerarTextoAleatorio())
                .body("")
                .userId(Utils.gerarUserIdAleatorio())
                .build();


    }


    public static CadastroPostRequest criarCadastroPostRequestComUserIdNegativo() {
        return CadastroPostRequest.builder().title(Utils.gerarTextoAleatorio())
                .body(Utils.gerarTextoAleatorio())
                .userId(Utils.gerarUserIdNegativoAleatorio())
                .build();


    }


    public static CadastroPostRequest criarCadastroPostRequestComUserIdZero() {
        return CadastroPostRequest.builder().title(Utils.gerarTextoAleatorio())
                .body(Utils.gerarTextoAleatorio())
                .userId(0)
                .build();


    }

    public static CadastroPostRequest criarCadastroPostRequestComUserIdZeroEcamposTitleBodyVazios() {
        return CadastroPostRequest.builder().title("")
                .body("")
                .userId(0)
                .build();

    }

    public static CadastroPostRequest criarCadastroPostRequestSemEnviarOCampoUserId() {
        return CadastroPostRequest.builder().title(Utils.gerarTextoAleatorio())
                .body(Utils.gerarTextoAleatorio())
                .build();


    }

    public static CadastroPostRequest criarCadastroPostRequestSemEnviarOCampoOTitle() {
        return CadastroPostRequest.builder().userId(Utils.gerarUserIdAleatorio())
                .body(Utils.gerarTextoAleatorio())
                .build();


    }

    public static CadastroPostRequest criarCadastroPostRequestSemEnviarOCampoBody() {
        return CadastroPostRequest.builder().title(Utils.gerarTextoAleatorio())
                .userId(Utils.gerarUserIdAleatorio())
                .build();


    }

    public static CadastroPostRequest criarCadastroPostRequestSemEnviarOCampoBodyTitleUserId() {
        return CadastroPostRequest.builder().build();


    }

    public static CadastroPostRequest criarCadastroPostRequestSemEnviarOCampoComOValorInvalidoNoUserId() {
        return CadastroPostRequest.builder().title("hhhhhhhhhhhh").body("vvvvvvvvvvvvvvvvv").userId(777777)
                .build();


    }



}