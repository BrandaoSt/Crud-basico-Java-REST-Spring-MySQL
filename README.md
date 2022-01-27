# Crud-basico-Java-REST-Spring-MySQL
Parte da atividade prática do módulo 4 - Java Web Intermediário - Recode Pro 

Orientações para testar o CRUD REST Java Spring My SQL

1-Acessar o link    https://chrome.google.com/webstore/detail/advanced-rest-client/hgmloofddffdnphfgcellkdfbfbjeloo?hl=pt-BR
2-Baixar a extensão "Advanced REST cliente"

Caso já tenha instalado, apenas clicar no botão "Abrir Aplicativo"

3-Iniciar servidor do projeto "eurotrip_crud" clicando em "start" no spring boot dashboard do Visual Code.
4-No aplicativo "Advanced REST cliente" digitar o seguinte caminho  http://localhost:8080/cliente
5-Clicar em "Send/enviar"

O método selecionado deverá ser "Get" e ele retornará um array vazio,caso não haja registros no banco de dados.

Para inserir registros ao banco de dados:

1- Basta alterar o método "Get" para "Post" no "Advanced REST Cliente"
2- Clicar em "Body" e logo em seguida escolher "application/json" em "Body content type". Isso definirá o formato json.
3- Digitar no campo abaixo a seguinte sintaxe referente aos atributos da minha entidade "Cliente":

	{
		"nome": "Patricia",
		"endereco": "Rua Carlos Gomes, 200",
		"cidade": "Recife",
		"estado": "Pernambuco",
		"email": "patriciabrandao@gmail.com",
		"cpf": "12345678912"
	}  

4- Clicar em "Send/enviar" e verificar no banco de dados My SQL se os dados foram inseridos ou verificar alterando o método de "POST" para "GET".
Também é possível verificar os registros inserindo a URL   http://localhost:8080/cliente na barra de navegação. Será exibido um array em formato json com os dados inseridos.

Para alterar os dados:

1-Selecionar o método put, digitar o "id" do cliente, fazer as alterações e clicar em "Send/enviar".
É possível consultar os dados de todos os cadastrados através do método Get e assim verificar o Id do cliente que deseja alterar.

	{
		"idCliente": 1,
		"nome": "Patricia",
		"endereco": "Rua Carlos Gomes, 200",
		"cidade": "Garanhuns",
		"estado": "Pernambuco",
		"email": "patriciabrandao@gmail.com",
		"cpf": "12345678912"
	}
 
Para deletar registros:

1- Selecionar o método "Delete" e seguir os mesmos passos realizados no método "Put" para alteração de rigistros.


 

