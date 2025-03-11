document.getElementById("cep").addEventListener("input", async function(){
	const cep = this.value.replace(/\D/g, "");
	
	if (cep.length === 8){
		try{
			const response = await fetch(`https://viacep.com.br/ws/${cep}/json/`);
		
			if(!response.ok) throw new Error("Erro ao buscar CEP");
			
			const dados = await response.json();
			
			if(dados.erro){
				alert("CEP não encontrado")
				return;
			}
			
			document.getElementById("rua").value = dados.logradouro;
			document.getElementById("bairro").value = dados.bairro;
			document.getElementById("cidade").value = dados.localidade;
			document.getElementById("estado").value = dados.estado;
		}	catch(error){
			alert("Erro ao buscar o endereço: " + error.message);
		}
		
		
	}
})

/*document.getElementById("EnderecoForm").addEventListener("submit", async function(){
	event.preventDefault("Erro ao cadastra");*/

document.addEventListener("DOMContentLoaded", () =>{
	
	const form = document.getElementById("EnderecoForm");
	
	form.addEventListener("submit", async (event) => {
		event.preventDefault();
		
		const cep = document.getElementById("cep").value;
		const estado = document.getElementById("estado").value;
		const cidade = document.getElementById("cidade").value;
		const numeroCasa = document.getElementById("numeroCasa").value;
		const bairro = document.getElementById("bairro").value;
        const rua = document.getElementById("rua").value;

		
		try {
			
			const response = await fetch ("http://localhost:8080/endereco", {
				method: "POST",
				headers:{
					"Content-Type": "application/json"
				},
				body: JSON.stringify({
					cep,
					estado,
					cidade,
					numeroCasa,
					bairro,
                    rua
				}),
			});
			if(!response.ok){
				throw new Error("Erro ao cadastrar endereço!");
			}
			else{
				alert("Endereço cadastrado com sucesso!");
			}
			}
			catch(error){
				alert(error.message);
			}
			
			
			
			
			
			/*if (response.ok){
				alert("Endereço cadastrado com sucesso!");
				window.location.href = "endereco.html";
			}else{
				alert("Erro ao cadastrar endereço.");
			}
		} catch (error) {
			console.error("Erro ao cadastrar o endereço:", error)
		}*/
		
		
	});
});