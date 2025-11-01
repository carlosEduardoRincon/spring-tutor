# 🧠 SpringTutor – Seu Explicador de Código Java com IA

O **SpringTutor** é um microserviço desenvolvido em **Java + Spring Boot** que utiliza **IA generativa** para **explicar trechos de código Java em linguagem natural**.  
A ideia surgiu após uma palestra sobre **Spring AI** da comunidade **SouJava**, e o objetivo é mostrar na prática a utilização dessa biblioteca e, desse modo,  consolidar o meu conhecimento adquirido.

---

## 🚀 Demonstração

  **Requisição:**
  
  POST /explain/java
```json
  {
    "question": "for(int i=0; i<10; i++) System.out.println(i);"
  }
  ```
  
  **Resposta:**
  ```json
  {
    "explanation": "The code snippet you provided is a simple Java for-loop that prints the numbers from 0 to 9 to the console. Here’s a line-by-line explanation:\n\n```java\nfor(int i = 0; i < 10; i++) {\n    System.out.println(i);\n}\n```\n\n- `for(int i = 0; i < 10; i++)` initializes a loop with an integer variable `i` starting at 0. The loop will continue as long as `i` is less than 10. After each iteration, `i` is incremented by 1 (`i++`).\n\n- `System.out.println(i);` is the body of the loop, which executes in each iteration. It prints the current value of `i` to the console.\n\nWhen you run this code, the output will be:\n```\n0\n1\n2\n3\n4\n5\n6\n7\n8\n9\n```\n\nEach number is printed on a new line, from 0 to 9. If you have any further questions or need additional context, feel free to ask!"
  }
  ```
  **Estrutura:**
  ```
  SpringTutor
  ├── src/
  │   ├── main/
  │   │   ├── java/br.com.rincon/spring/
  │   │   │   ├── controller/ExplainController.java
  │   │   │   ├── service/ExplainService.java
  │   │   │   ├── dto/ExplainRequest.java
  │   │   │   └── dto/ExplainResponse.java
  │   │   └── resources/
  │   │       └── application.properties
  │   └── test/...
  └── pom.xml
  ```

🧠 Como Funciona
  - O usuário envia um trecho de código via API REST;
  - O serviço envia esse código para o modelo de IA (por exemplo, GPT-4);
  - O modelo responde com uma explicação humanizada;
  - O SpringTutor retorna a resposta em formato JSON.

🛠️ Tecnologias Utilizadas
  - Java 17+;
  - Spring Boot 3.x;
  - OpenAI API;
  - Maven.

⚙️ Configuração
  - Clone o repositório;
  - Configure sua chave da OpenAI no arquivo application.properties:
    openai:
    ```
      spring.ai.openai.api-key="sua_chave_aqui"
    ```
  - Execute o projeto;
