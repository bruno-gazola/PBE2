document.addEventListener("DOMContentLoaded", () =>{
	
	const form = document.getElementById("cadastroClienteForm");
	
	form.addEventListener("submit", async (event) => {
		event.preventDefault();
		
		const nomeCliente = document.getElementById("nomeCliente").value;
		const cpf = document.getElementById("cpf").value;
		const email = document.getElementById("email").value;
		const telefone = document.getElementById("telefone").value;
		const dataNascimento = document.getElementById("dataNascimento").value;
		
		try {
			
			const response = await fetch ("http://localhost:8080/cliente", {
				method: "POST",
				headers:{
					"Content-Type": "application/json"
				},
				body: JSON.stringify({
					nomeCliente,
					cpf,
					telefone,
					email,
					dataNascimento
				}),
			});
			if (response.ok){
				alert("Cliente cadastrado com sucesso!");
				window.location.href = "cadastroendereco.html";
			}else{
				alert("Erro ao cadastrar cliente.");
			}
		} catch (error) {
			console.error("Erro ao cadastrar o cliente:", error)
		}
		
		
	});
});