package senai.dev.livraria.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import senai.dev.livraria.entities.Editora;
import senai.dev.livraria.services.EditoraService;

@RestController
@RequestMapping("/editora")
public class EditoraController {

    @Autowired
    private EditoraService editoraService;

    @GetMapping
    public List<Editora> buscarEditora() {
        return editoraService.buscarEditora();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Editora> buscarEditoraPorId(@PathVariable Long id) {
    	Editora editora = editoraService.buscarEditoraPorId(id);
		
		if (editora != null) {
			return ResponseEntity.ok(editora);
		} else {
			return ResponseEntity.notFound().build();
		}	
    }
    
    @GetMapping("/cnpj/{cnpj}")
    public Editora buscarEditoraPorCnpj(@PathVariable String cnpj) {
    	return editoraService.buscarEditoraPorCnpj(cnpj);
    }
    
    @PostMapping
    public Editora criarEditora(@RequestBody Editora editora) {
        return editoraService.criarEditora(editora);
    }

    @DeleteMapping("/{id}")
    public void excluirEditora(@PathVariable Long id) {
        editoraService.excluirEditora(id);
    }
}