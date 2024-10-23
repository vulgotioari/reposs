# Projeto Final |Programação Orientada a Objeto II| Sistema em Java com Interface Gráfica e Banco de Dados Local

# Integrantes

Maria Fernanda Chmiel Fagundes;
Otávio Porto Senger.

# Índice
- Descrição do projeto
- Badges
- Tecnologias Utilizadas
- Funcionalidades Implementadas

# Descrição do Projeto
Este projeto é um sistema de gerenciamento de tarefas que permite aos usuários pesquisar, criar, editar,
excluir e visualizar suas tarefas. O objetivo é fornecer uma ferramenta intuitiva e eficiente para 
organizar e acompanhar atividades diárias com interface gráfica para gerenciamento de usuários e 
clientes.O banco de dados local está gerido com MySQL, acessado via MySQL Workbench.

Onde no Banco de Dados:
- A tabela usuários contém: o id, nome, email, nome_usuario, senha.
- A tabela de clientes contém: id, nome, endereço, telefone, email, cpf_cnpj.
- A tabela de agenda contém: id, data, hora, descricao, cliente_id.

# Badges
Markdown-badges são elementos gráficos usados em arquivos Markdown para exibir informações,
status ou links de maneira visualmente atraente e facilmente compreensível.
Eles são amplamente utilizados em repositórios de código, especialmente no GitHub,
para fornecer informações rápidas e relevantes, como o status de build,
cobertura de testes, versões de software, licenças, entre outros.

# Tecnologias Utilizadas
- Linguagem de Programação: Java (Swing: bibliotecas | JavaFX: Interface Gráfica).
- Banco de Dados: MySQL.
- Ferramenta de Gerenciamento de Banco de Dados: MySQL Workbench.
- JDBC (Java Database Connectivity) para conexão e manipulação do banco de dados.

# Funcionalidades Implementadas

- Tela de Login
  
  Campos: nome de usuário e senha.
  
  Descrição:
  Permite a autenticação de usuários cadastrados no sistema, se caso falhe, aparecerá uma mensagem de erro.
  
- Tela Principal
  
  Descrição:
  É uma barra de menu que contém as opções: Cadastro, Relatório, Ajuda e Opções.
  Onde as principais funcionalidades estão no menu Cadastro que são: Cadastro de Usuários, Cadastro de Clientes e Agenda.
  
- Tela de Cadastro de Usuários
  
  Campos: nome, e-mail, nome de usuário e senha.
  
  Descrição:
  Formulário com as funções de pesquisa, limpar, inserção, edição e exclusão de usuários no sistema.
  Tem validação para que não haja repetição de dados inseridos.
  
- Tela de Cadastro de Clientes
  
  Campos: nome, endereço, telefone, e-mail e CPF/CNPJ.
  
  Descrição:
  Formulário com as funções de pesquisa, limpar, inserção, edição e exclusão de usuários no sistema.

- Agenda para Registro de Compromissos.
  
  Campos: data, horário, descrição e cliente associado
  
  Descrição:
  Form JInternalFrame que faz o registro de compromissos ou eventos e a exibição em formato de tabela com opção de visualização por dia, semana ou mês.

# Contatos

- Gmail:
- fernandachmiel@gmail.com
- senger.otavio@gmail.com

  
  ![Gmail](https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white)

