📚 Mentoria App
Olá! Este é um projeto que criei com o intuito de ajudar estudantes que enfrentam dificuldades pontuais em matérias da grade curricular.

A proposta é criar um ambiente colaborativo onde alunos possam se apoiar e compartilhar conhecimento.

📝 Como funciona:
🎯 Postagem de dúvidas: o estudante pode publicar sua dificuldade no feed da plataforma.

🤝 Ajuda entre alunos: outros estudantes podem visualizar os posts e se candidatar para ajudar.

💬 Chat rápido: a comunicação ocorre através de um chat simples e direto, sem armazenamento de mensagens no banco de dados (apenas em cache).

📲 Troca de contatos: durante a conversa, os estudantes podem trocar informações de contato.

🏆 Reconhecimento: quando o aluno ajudante finaliza a mentoria, a postagem é associada ao seu perfil como "xp" (experiência).

🔐 Autenticação:
A aplicação utiliza JWT (JSON Web Token) para autenticação e autorização, garantindo maior segurança no acesso às funcionalidades da plataforma.

🚀 Funcionalidades principais:
Cadastro e login de estudantes

Postagem de dúvidas no feed

Visualização de dúvidas por outros alunos

Sistema de candidatura para ajudar

Chat rápido (com cache, sem persistência)

Registro de "xp" no perfil ao concluir uma mentoria

Controle de acesso com autenticação JWT

🏗️ Tecnologias utilizadas:
Java + Spring Boot

Spring Security (JWT)

JPA / Hibernate

Banco de dados relacional

Redis (cache para chat)

Git

🙌 Objetivo:
Facilitar o apoio entre colegas de curso, criando uma rede de mentoria simples e funcional, sem a complexidade de plataformas formais.
