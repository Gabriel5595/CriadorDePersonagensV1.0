package br.edu.infnet.criadordepersonagem.model.testes;


import br.edu.infnet.criadordepersonagem.model.negocio.Atributos;
import br.edu.infnet.criadordepersonagem.model.negocio.Armadura;
import br.edu.infnet.criadordepersonagem.model.negocio.Classe;
import br.edu.infnet.criadordepersonagem.model.negocio.VidaEDefesa;
import br.edu.infnet.criadordepersonagem.model.service.mappers.JSON.ArmaduraObjectMapper;
import br.edu.infnet.criadordepersonagem.model.service.mappers.JSON.AtributosObjectMapper;
import br.edu.infnet.criadordepersonagem.model.service.mappers.JSON.ClasseObjectMapper;
import br.edu.infnet.criadordepersonagem.model.service.mappers.JSON.VidaEDefesaObjectMapper;

import java.io.IOException;

import static br.edu.infnet.criadordepersonagem.model.service.mappers.JSON.ClassToJSON.appendJsonToExistingFile;
import static br.edu.infnet.criadordepersonagem.model.service.mappers.JSON.ClassToJSON.convertObjectToJson;

public class VidaEDefesaTeste {
    public static void main(String[] args) throws IOException {
        System.out.println("\n[Vida e Defesa] Classe iniciada com sucesso!\n");
        System.out.println("""
                Está pronto para ver o resultado das suas escolhas impactando a sua vida e capacidade de sobreviver?
                
                Ninguém nunca está... Mas vamos lá!
                """);

        Classe classe = ClasseObjectMapper.lerOpcaoEscolhida();
        Armadura armadura = ArmaduraObjectMapper.lerOpcaoEscolhida();
        Atributos atributos = AtributosObjectMapper.lerOpcaoEscolhida();

        VidaEDefesa vidaEDefesa = new VidaEDefesa(classe, armadura, atributos);
        System.out.println(vidaEDefesa);

        VidaEDefesaObjectMapper.escreverJson(vidaEDefesa);

        String jsonOutrosEquip = convertObjectToJson(vidaEDefesa);
        appendJsonToExistingFile(jsonOutrosEquip, "Vida e Defesa");
    }
}
