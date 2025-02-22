# 🚀 Projeto SpringBoot

| [![Spring Boot](/assets/img/SpringBoot_img.png)](https://web.dio.me/track/decola-tech-2025) |
|:--:|
| Este repositório foi criado para praticar e aplicar os conhecimentos adquiridos durante a Trilha Digital Decola Tech Avanade 2025 sobre “Spring Framework com Spring Boot", abordando os primeiros passos para criação de um projeto Spring Boot.
O Spring Boot é um Framework que facilita a configuração e o desenvolvimento de aplicações Spring, permitindo que os desenvolvedores se concentrem na lógica de negócios. |

## 🎯 Conceito e abordagem:

O projeto visa consolidar o conhecimento apresentado em sala de aula, praticando os primeiros passos para criação de um projeto Spring Boot:

- Criação de projeto Spring Boot com Spring Initializr
- Importando o projeto Maven no VS Code
- Conhecendo a estrutura Spring Boot
- Bean e CommandLineRunner

## 🤔 Qual a diferença entre Spring Framework e Spring Boot? 🤔

São ferramentas relacionadas ao desenvolvimento de aplicações Java, mas têm propósitos diferentes:

Enquanto o Spring Framework é baseado no padrão de injeção de dependências, o spring boot foca na configuração automática, ou seja na produtividade.

## 🤖 Tecnologias Utilizadas:

Para realização desse projeto, eu utilizei as seguintes tecnologias:

- **Visual Studio Code:** O VS Code foi o editor de código-fonte escolhido por ser leve e oferecer suporte a várias linguagens de programação, incluindo Java, e possui uma vasta gama de extensões que melhoram a produtividade.

- **Spring Initializr:** Uma ferramenta online que ajuda a configurar rapidamente um projeto Spring Boot. Permite escolher dependências, definir configurações básicas e gerar um esqueleto de aplicação que pode ser baixado e importado em uma IDE, acelerando o início do desenvolvimento.

- **Spring Boot:** Um framework que simplifica o desenvolvimento de aplicações Spring, fornecendo configuração automática e dependências pré-configuradas. Ele facilita a criação de aplicações robustas e escaláveis com o mínimo de configuração manual.

| ✨Aqui estão algumas de suas principais funcionalidades do Spring Boot: ✨ |
|:--:|

### **Configuração Automática:**

- **Configuração simplificada:** O Spring Boot elimina a necessidade de configurações complexas, permitindo que os desenvolvedores se concentrem na lógica de negócios.

- **Dependências pré-configuradas:** Inclui dependências essenciais para o desenvolvimento de aplicações Spring.

### **Servidor Embutido:**

- **Tomcat embutido:** Facilita o desenvolvimento e a execução de aplicações web sem a necessidade de configurar um servidor externo.

### **Monitoramento e Gerenciamento:**

- **Actuator:** Fornece endpoints para monitoramento e gerenciamento da aplicação, como métricas de desempenho e informações de saúde.

### **Desenvolvimento Rápido:**

- **Spring Initializr:** Ferramenta online que ajuda a configurar o projeto e escolher as dependências necessárias, gerando um esqueleto de aplicação que pode ser baixado e importado em uma IDE.

| Durante o desenvolvimento do projeto foi possível conhecer e praticar o uso de algumas estruturas Spring Boot. |
|:--:|
São elas: |

- **Bean:** Um componente gerenciado pelo Spring que é instanciado, montado e gerenciado pelo contêiner Spring. Beans são os blocos de construção da aplicação Spring.

- **CommandLineRunner:** Uma interface usada para executar código após a inicialização da aplicação. É útil para executar tarefas de inicialização ou configuração.



Primeiros passos na criação do projeto springboot

Criar um projeto com o initialisr
Importar o projeto Maven no VS Code
Conhecendo a estrutura spring boot
Bean e ComandLineRunner

Primeiro localizar o site do Spring Initializr

  O Spring Initializr simplifica o processo de criação de novos projetos Spring Boot, eliminando a necessidade de configurar manualmente o projeto desde o início.

Fazer as configurações de criação do projeto Maven utilizando JAVA21, a versão do spring boot e o artefato que são as caracteristicas do projeto de acordo com a convenção Maven

Group dio
Artifact primeiros-passos
name primeiros-passos
Description primeiros passos com Springboot
Package name dio.springboot
Packging Jar
Java 21

Não adicionamos dependências, os famosos starters!!!