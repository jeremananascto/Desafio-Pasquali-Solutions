#language:pt
@CadstroPost
Funcionalidade:Cadastrar Post

  @Positivos
  Cenário: Cadastrar post com todos os campos preenchidos
    Dado que estou cadastrando um post com todos os campos preenchidos
    Quando eu envio a solicitacao POST com todos os campos preenchiodos
    Então valido os campos enviados com o codigo de status 201

  Cenário: Cadastrar post com o campo title sem valor
    Dado que estou cadastrando um post com o campo title sem valor
    Quando eu envio a solicitacao POST com campo title sem valor
    Então valido se o campo title esta vazio com o código de status 201

  Cenário: Cadastrar post com o campo body sem valor
    Dado que estou cadastrando um post com o campo body sem valor
    Quando eu envio a solicitacao POST com o campo body sem valor
    Então valido se o campo body esta vazio com o código de status 201

  Cenário: Cadastrar post com um valor negativo no campo userID
    Dado que estou cadastrando um post com um valor negativo no campo userID
    Quando eu envio a solicitacao POST com o valor negativo
    Então valido se o campo UserID esta com valor negativo com o código de status 201

  Cenário: Cadastrar post com um valor 0 no campo userID
    Dado que estou cadastrando um post com um valor 0 no campo userID
    Quando eu envio a solicitacao POST com o valor 0  no campo userId
    Então valido se o campo UserID esta com valor 0 com o código de status 201

  Cenário: Cadastrar post com valor 0 no campo userID e campos title e body vazios
    Dado que estou cadastrando um post com valor 0 no campo userId e campos title e body vazios
    Quando eu envio a solicitacao POST para o endpoint de posts
    Então valido se os campos body e title estao vazios e o campo userID está com o valor 0 com o código de status 201

  Cenário: Cadastrar post nao enviando o campo userID
    Dado que estou cadastrando um post sem enviar o campo userID
    Quando eu envio a solicitacao POST com o campo userId
    Então valido que o campo userId nao esta presente com o código de status 201

  Cenário: Cadastrar post nao enviando o campo title
    Dado que estou cadastrando um post sem enviar o campo title
    Quando eu envio a solicitacao POST sem enviar o campo title
    Então valido que o campo title nao esta presente com o código de status 201

  Cenário: Cadastrar post nao enviando o campo body
    Dado que estou cadastrando um post sem enviar o campo body
    Quando eu envio a solicitacao POST nao enviando o campo body
    Então valido que o campo body nao esta presente com o código de status 201

  Cenário: Cadastrar post nao enviando os campos userID, title, body
    Dado que estou cadastrando um post sem enviar os campos userID, title, body
    Quando eu envio a solicitacao POST para o endpoint não enviando os campos userID, title, body
    Então valido que o campo userID esta presente com valor nulo e os campos title e body preenchidos com valores

