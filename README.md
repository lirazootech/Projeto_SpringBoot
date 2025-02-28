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

## 🤖 Tecnologias Utilizadas:

Para realização desse projeto, eu utilizei as seguintes tecnologias:

- **Visual Studio Code:** O VS Code foi o editor de código-fonte escolhido por ser leve e oferecer suporte a várias linguagens de programação, incluindo Java, e possui uma vasta gama de extensões que melhoram a produtividade.

- **Spring Initializr:** Uma ferramenta online que ajuda a configurar rapidamente um projeto Spring Boot. Permite escolher dependências, definir configurações básicas e gerar um esqueleto de aplicação que pode ser baixado e importado em uma IDE, acelerando o início do desenvolvimento.

- **Spring Boot:** Um framework que simplifica o desenvolvimento de aplicações Spring, fornecendo configuração automática e dependências pré-configuradas. Ele facilita a criação de aplicações robustas e escaláveis com o mínimo de configuração manual.

## 📝 Resumo

**Qual a diferença entre Spring Framework e Spring Boot?**

São ferramentas relacionadas ao desenvolvimento de aplicações Java, mas têm propósitos diferentes:

Enquanto o Spring Framework é baseado no padrão de injeção de dependências, o spring boot foca na configuração automática, ou seja na produtividade.

 ✨Aqui estão algumas das principais funcionalidades do Spring Boot: ✨ |
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

## 🧐 Processo de Criação:

**Primeiros passos na criação do projeto springboot**

- **1º Localizar o site do Spring Initializr**

O Spring Initializr simplifica o processo de criação de novos projetos Spring Boot, eliminando a necessidade de configurar manualmente o projeto desde o início.

- **2º Configurar o projeto**

Fiz as configurações de criação do projeto Maven utilizando JAVA21, a versão do spring boot e o artefato que são as caracteristicas do projeto de acordo com a convenção Maven. Como mostra a imagem à seguir:

| [![Spring Initializr](/assets/img/Captura_de_tela_initializr.png)](https://start.spring.io/;) |
|:--:|


| **Obs:** Não adicionamos dependências, os famosos starters, por se tratar de um projeto simples!!!
|:--:|

| [![Spring Initializr](/assets/img/Captura_de_tela_initializr2.png)](https://start.spring.io/;) |
|:--:|

- **3º Daownload, extração e Inicialização**

Após realizar o download do projeto e extrair, usei o VS Code para desenvolver e conhecer melhor a estrutura do projeto.

A estrutura do projeto JAVA vem toda pronta e ao executar a aplicação **run**, a mesma é inicializada porém sem nenhum tipo de comportamento.

- **4º Desenvolvendo com Spring Boot**

Por não se tratar de uma aplicação Web, faz-se necessária atribuir alguma iteração dentro da aplicação depois que o container subir.

Sendo assim, criei uma classe chamada "Calculadora" e adicionei o método somar que me retorna um INTeiro.

E em seguida, de acordo com a convenção inversão de controle e injeção de dependências fiz a iteração utilizando **CommandLineRunner**.

- **5º Iteração usando CommandLineRunner**

Criei a Classe "MyApp", e implementei o CommandLineRunner com o método **Run**  ou seja, executar.

Os objetos, de acordo com os principios de inversão de controle e injeção de dependências, neste contexto serão **Beans**.

Criei então o **@Component** "Calculadora" que terá como dependência um outro objeto "calculadora" que executa o método **run**.

Para injetar uma dependência de um componente a outro usei a anotação **@Autowired**.

E assim foi criada toda a cadeia de dependências!

## 🚀 Resultados

- ***Simplificação do Processo de Criação***

Uso do Spring Initializr para facilitar a criação de novos projetos Spring Boot.

- ***Configuração Eficiente do Projeto***

Configuração do projeto Maven com JAVA21 e artefatos conforme a convenção Maven.

- ***Desenvolvimento Estruturado***

Exploração e desenvolvimento da estrutura do projeto utilizando VS Code.

- ***Implementação de Componentes***

Criação da classe “Calculadora” com o método somar.

- ***Execução e Injeção de Dependências***

Utilização de CommandLineRunner para executar a aplicação e injeção de dependências com @Autowired.

## 🔧 Contribuição

Sinta-se à vontade para contribuir com este repositório. Para começar, faça um fork do projeto, crie uma nova branch para suas alterações e envie um pull request.

## 📜 Licença

Este projeto está licenciado sob a licença MIT.  Veja o arquivo <a href="https://github.com/lirazootech/DecolaTechAvanade2025/blob/main/LICENSE" target="_blank">LICENSE</a> para mais detalhes.

| [![DIO](/assets/img/logo_empresa_DIO.png)](https://web.dio.me/) |
|:--:|
| [![Avanade](/assets/img/logo_empresa_avanade.png)](https://www.avanade.com/pt-br) |
| Este curso é oferecido pela Avanade em parceria com a DIO (Digital Inovation One) através da plataforma <a href="https://web.dio.me/" target="_blank">DIO.me</a> com o objetivo de capacitar e inserir jovens estudantes na área de tecnologia. Ao final do curso, após avaliação os participantes concorrem à oportunidade de estágio na <a href="https://www.avanade.com/pt-br" target="_blank">Avanade</a>, uma empresa que faz a tecnologia acontecer. |
| Copyright © 2025. Feito com 🧡 por <a href="https://github.com/lirazootech/" target="_blank">lirazootech</a> . |
