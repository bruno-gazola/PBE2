document.addEventListener("DOMContentLoaded", () =>{
	
	const form = document.getElementById("EnderecoForm");
	
	form.addEventListener("submit", async (event) => {
		event.preventDefault();
		
		const cep = document.getElementById("cep").value;
		const estado = document.getElementById("estado").value;
		const cidade = document.getElementById("cidade").value;
		const numero = document.getElementById("numero").value;
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
					numero,
					bairro,
                    rua
				}),
			});
			if (response.ok){
				alert("Endereço cadastrado com sucesso!");
				window.location.href = "endereco.html";
			}else{
				alert("Erro ao cadastrar endereço.");
			}
		} catch (error) {
			console.error("Erro ao cadastrar o endereço:", error)
		}
		
		
	});
});