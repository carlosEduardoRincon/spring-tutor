# 🧠 SpringTutor – Seu Explicador de Código Java com IA

O **SpringTutor** é um microserviço desenvolvido em **Java + Spring Boot** que utiliza **IA generativa** para **explicar trechos de código Java em linguagem natural**.  
A ideia surgiu após uma palestra sobre **Spring AI** da comunidade **SouJava**, e o objetivo é mostrar na prática a utilização dessa biblioteca e, desse modo,  consolidar o meu conhecimento adquirido.

---

## 🚀 Demonstração

**Requisição:**
```json
POST /explain
{
  "code": "for(int i=0; i<10; i++) System.out.println(i);"
}
```

**Resposta:**
```json
{
  "explanation": "Esse código imprime os números de 0 a 9 no console."
}
```
**Estrutura:**

SpringTutor
├── src/
│   ├── main/
│   │   ├── java/com/springtutor/
│   │   │   ├── controller/ExplainController.java
│   │   │   ├── service/ExplainService.java
│   │   │   ├── dto/ExplainRequest.java
│   │   │   ├── dto/ExplainResponse.java
│   │   │   └── config/OpenAIClientConfig.java
│   │   └── resources/
│   │       └── application.yml
│   └── test/...
└── pom.xml

🧠 Como Funciona
- O usuário envia um trecho de código via API REST.
- O serviço envia esse código para o modelo de IA (por exemplo, GPT-4).
- O modelo responde com uma explicação humanizada.
- O SpringTutor retorna a resposta em formato JSON.

🛠️ Tecnologias Utilizadas
- Java 17+
- Spring Boot 3.x
- OpenAI API (via WebClient)
- Maven

⚙️ Configuração
- Clone o repositório;
- Configure sua chave da OpenAI no arquivo application.yml:
  openai:
  ```
    api-key: "sua_chave_aqui"
  ```

- Execute o projeto:
  ```
    mvn spring-boot:run
  ```
