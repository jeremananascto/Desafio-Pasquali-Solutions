package Model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import groovyjarjarantlr4.v4.runtime.misc.NotNull;
import lombok.Builder;
import lombok.Getter;

import java.util.Optional;

@Getter
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CadastroPostRequest {
    @JsonProperty("userId")
    private Integer userId;
    @JsonProperty("title")
    private String title;
    @JsonProperty("body")
    private String body;



    public String toJsonString() {
        try {
            return new ObjectMapper().writeValueAsString(this);
        } catch (JsonProcessingException e) {
            // Trate a exceção conforme necessário ou lance-a novamente
            throw new RuntimeException("Erro ao converter CadastroPostRequest para JSON", e);
        }
    }





    }



