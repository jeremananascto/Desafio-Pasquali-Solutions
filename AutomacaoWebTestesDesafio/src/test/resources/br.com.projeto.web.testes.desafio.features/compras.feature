# language:  pt

  Funcionalidade: Compra de usuario cadastrado

  Dado que estou logado na minha conta do automationpractice.pl
  Quando eu adicionar os produtos ao meu carrinho de compras
  Então devo ver os produtos corretamente adicionados ao meu carrinho

  Dado que estou visualizando os detalhes do produto "Printed Chiffon Dress"
  Quando eu selecionar a cor verde e o tamanho "M"
  Então devo ver que a cor e o tamanho foram selecionados corretamente
  E o produto deve estar disponível para adicionar ao carrinho

  Dado que estou visualizando o resumo de compras no meu carrinho
  Quando devo ver todos os produtos adicionados corretamente, incluindo suas quantidades, tamanhos e cores
  Então eu estou pronto para seguir para o checkout

  Dado que estou pronto no checkout
  Quando eu seguir para a página de pagamento
  Então devo ser capaz de concluir a compra com sucesso fornecendo informações de pagamento válidas


