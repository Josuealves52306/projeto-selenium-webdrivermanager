# 🧪 Testes Automatizados com Selenium WebDriver + JUnit

![Java](https://img.shields.io/badge/Java-17-blue.svg)
![JUnit](https://img.shields.io/badge/JUnit-5.10-green)
![Selenium](https://img.shields.io/badge/Selenium-4.28.1-brightgreen)
![WebDriverManager](https://img.shields.io/badge/WebDriverManager-6.0.0-orange)
![Status](https://img.shields.io/badge/build-passing-brightgreen)

Este projeto demonstra a automação dos fluxos de **cadastro** e **login** da aplicação [Serverest - Frontend](https://front.serverest.dev/login), utilizando:

- ✅ Selenium WebDriver
- ✅ Java 17
- ✅ JUnit 5
- ✅ WebDriverManager

---

## ✨ Funcionalidades Testadas

- ✅ Cadastro de novo usuário com dados válidos
- ✅ Cadastro com e-mail já existente (validação de mensagem)
- ✅ Login com credenciais válidas
- ✅ Login com e-mail inválido (mensagem de erro esperada)

---

## 🔧 Tecnologias Utilizadas

| Tecnologia         | Versão       |
|--------------------|--------------|
| Java               | 17           |
| Selenium WebDriver | 4.28.1       |
| WebDriverManager   | 6.0.0        |
| JUnit Jupiter      | 5.10.0       |
| Maven              | Project Build Tool |

---

## 📂 Estrutura do Projeto

src/ └── test/ └── java/ └── EstudoTest.java # Contém todos os testes automatizados

yaml
Copiar
Editar

---

## ▶️ Como Executar Localmente

### 1. Clone o repositório

```bash
git clone https://github.com/seu-usuario/webdriver-manager.git
cd webdriver-manager
2. Execute os testes com Maven
bash
Copiar
Editar
mvn clean test

📌 Observações
O projeto utiliza o recurso @TestMethodOrder para garantir a ordem dos testes.

Os testes simulam ações de usuário real na interface Web.

O WebDriverManager é responsável por configurar o driver automaticamente, sem necessidade de download manual.

O tempo de espera implícito está configurado com Duration.ofSeconds(9).
