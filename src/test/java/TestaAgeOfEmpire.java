import io.restassured.http.ContentType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class TestaAgeOfEmpire {

    //criando um método para testar o get da api
    //Fazendo um teste com GET

    String enderecoApi = "https://age-of-empires-2-api.herokuapp.com/api/v1/";
    String enpointPegaCivilizacao = "civilizations";
    String enpointPegaUnidades = "units";
    String enpointPegaEstruturas = "structures";
    String enpointPegaTecnologias = "technologies";



    @Test
    @DisplayName("Quando pegar todas as civilizações cadastradas, então a lista deve retornar todas as civilizações")
    public void pegaTodasAsCivilizacoes(){

        given()
                .contentType(ContentType.JSON) //Dado que meu tipo de conteudo eh json
        .when()
                .get(enderecoApi + enpointPegaCivilizacao)
        .then()
                .statusCode(200);
                //.assertThat()

    }

    @Test
    @DisplayName("Quando pegar todas as unidades cadastradas, então a lista deve retornar todas as civilizações")
    public void pegaTodasAsUnidades(){

        given()
                .contentType(ContentType.JSON) //Dado que meu tipo de conteudo eh json
                .when()
                .get(enderecoApi + enpointPegaUnidades)
                .then()
                .statusCode(200);


    }

    @Test
    @DisplayName("Quando pegar todas as estruturas cadastradas, então a lista deve retornar todas as estruturas")
    public void pegaTodasAsEstruturas(){

        given()
                .contentType(ContentType.JSON) //Dado que meu tipo de conteudo eh json
                .when()
                .get(enderecoApi + enpointPegaEstruturas)
                .then()
                .statusCode(200);


    }
    @Test
    @DisplayName("Quando pegar as tecnologias , então a lista deve retornar todas as tecnologias cadastradas")
    public void pegaTodasAsTecnologias(){

        given()
                .contentType(ContentType.JSON) //Dado que meu tipo de conteudo eh json
                .when()
                .get(enderecoApi + enpointPegaTecnologias)
                .then()
                .statusCode(200);


    }


}
