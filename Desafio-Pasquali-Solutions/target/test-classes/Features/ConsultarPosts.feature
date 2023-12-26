#language:pt

@BuscarPosts
Funcionalidade: Buscar Posts Cadastrados

Cenário: Buscar todos os posts
Dado  que estou consultando todos os posts
Quando  eu envio uma solicitação GET para "/posts"
Então  devo receber uma resposta com status 200
E  devo ver uma lista de posts

Cenário: Buscar um post por Id
Dado que estou consultando um post específico com Id
Quando eu envio uma solicitação GET para "/posts/{postId}"
E  o Id do post é válido
Então  devo receber uma resposta com status 200
E devo ver os detalhes do post com Id correspondente



Cenário:  Buscar post com Id inválido
Dado  que estou consultando um post com Id inválido
Quando  eu envio uma solicitação GET para "/posts/{postId}"
E  o Id do post é inválido
Então  devo receber uma resposta com status 404



