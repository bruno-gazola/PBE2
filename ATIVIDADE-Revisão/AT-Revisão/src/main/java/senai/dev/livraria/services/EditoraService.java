package senai.dev.livraria.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import senai.dev.livraria.entities.Editora;
import senai.dev.livraria.repositories.EditoraRepository;

@Service
public class EditoraService {

    @Autowired
    private EditoraRepository editoraRepository;

    // Listar todas as Editoras
    public List<Editora> buscarEditora() {
        return editoraRepository.findAll();
    }

    // Buscar Editora por ID
    public Editora buscarEditoraPorId(Long id) {
        return editoraRepository.findById(id).orElse(null);
    }

    //Busca Editora por CNPJ
    public Editora buscarEditoraPorCnpj(String cnpj) {
    	return editoraRepository.findByCnpj(cnpj);
    }
    
    // Salvar cliente
    public Editora criarEditora(Editora editora) {
        return editoraRepository.save(editora);
    }

    // Deletar cliente
    public void excluirEditora(Long id) {
        editoraRepository.deleteById(id);
    }
}