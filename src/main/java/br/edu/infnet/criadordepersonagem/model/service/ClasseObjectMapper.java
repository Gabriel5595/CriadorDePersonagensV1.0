package br.edu.infnet.criadordepersonagem.model.service;

import br.edu.infnet.criadordepersonagem.model.negocio.Classe;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class ClasseObjectMapper {
    public static Classe lerJson() throws IOException {
        String caminho = "./src/main/java/br/edu/infnet/criadordepersonagem/recursos/JSON/classe/classe_GUERREIRO.json";
        File arquivoJson = new File(caminho);

        if (!arquivoJson.exists()){
            System.out.println("Arquivo não pode ser encontrado\n");
        } else {
            System.out.println("Arquivo encontrado com sucesso!\n");
        }

        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(arquivoJson, Classe.class);
    }
}
