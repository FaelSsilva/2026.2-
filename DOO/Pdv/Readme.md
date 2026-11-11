## Projeto PDV  

Sistema para gerenciamento de **ponto de venda (PDV)**

## Estrutura do projeto

O projeto contém a seguinte estrutura:

- `src`: Pasta para manter os códigos-fonte
- `lib`: Pasta para manter as dependências
- `bin`: Arquivos de saída da compilação


## System Design

O sistema será projetado com base na arquitetura **Model-View-Controller (MVC)**, sendo: 

- `Model`: Representa as entidades do PDV e as regras de negócio
- `View`: Representa a interação do usuário com o sistema
- `Controller`: Recebe as ações da View e coordena as operações do sistema
- `Repository`: Persistencia dos dados (.txt)


## Requisitos funcionais

- O produto deve conter: `nome`, `descrição`, `preço` e `estoque`

## Javadoc

Execute o comando no terminal para gerar o Javadoc: 
`javadoc -d doc -sourcepath src -subpackages br.com.pdv`

## Desenvolvido e Mantido por:

Rafael De Paula Silva