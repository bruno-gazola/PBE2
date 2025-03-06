document.addEventListener("DOMContentLoaded", () =>{
	
	const form = document.getElementById("ProdutoForm");
	
	form.addEventListener("submit", async (event) => {
		event.preventDefault();
		
		const nome = document.getElementById("nome").value;
		const preco = document.getElementById("preco").value;
		const cor = document.getElementById("cor").value;
		
		try {
			
			const response = await fetch ("http://localhost:8080/produto", {
				method: "POST",
				headers:{
					"Content-Type": "application/json"
				},
				body: JSON.stringify({
					nome,
					preco,
					cor
				}),
			});
			if (response.ok){
				alert("Produto cadastrado com sucesso!");
				window.location.href = "produto.html";
			}else{
				alert("Erro ao cadastrar produto.");
			}
		} catch (error) {
			console.error("Erro ao cadastrar o produto:", error)
		}
		
		
	});
});