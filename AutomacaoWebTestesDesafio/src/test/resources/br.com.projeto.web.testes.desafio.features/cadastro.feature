# language:  pt

  Funcionalidade:Cadastrar novo usuario no site

    @cadastro_de_usuario
    Dado que ainda não possuo cadastro
    Quando estou na tela de cadastro
    Então clico em cadastrar

    @cadastro_usuario_sucesso
    Dado que estou na tela de cadastrar
    Quando eu preencher todos os dados validos
    Então vai retornar uma mensagem de usuario cadastrado com sucesso
