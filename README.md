# Java Programming MOOC - University of Helsinki 🇫🇮

Soluções dos exercícios do curso de Orientação a Objetos da Universidade de Helsinque.

## 🚀 Sobre este repositório
Este repositório documenta minha jornada de aprendizado em Java, focando em boas práticas, arquitetura limpa, algoritmos e lógica de programação.

**Status Atual:** ✅ Parte 8 Concluída (Início do Módulo Java II)

## 🛠️ Tecnologias e Conceitos
- **Linguagem:** Java 11+
- **Conceitos Chave:**
  - **Estruturas de Dados Avançadas:** HashMaps, Sets e Agrupamento de Dados.
  - **Identidade de Objetos:** Implementação correta de `equals()` e `hashCode()`.
  - **Algoritmos:** Ordenação, Busca Binária e Complexidade.
  - **Arquitetura:** Separação de Responsabilidades (UI vs Lógica).
  - **Qualidade:** Testes Unitários (JUnit) e Introdução ao TDD.

## 🏆 Destaques e Evolução

### 🔹 Parte 8: HashMaps Avançados e Agrupamento de Dados (Início Java II)
*Foco em estruturas de dados eficientes e identidade de objetos.*
- **StorageFacility (Armazém):** Implementação de lógica de "MultiMap" (HashMap contendo ArrayLists) para agrupar itens por categoria dinamicamente.
- **VehicleRegistry (Registro de Veículos):** Uso de objetos personalizados como Chave de um Mapa, implementando `equals()` e `hashCode()` para garantir a unicidade correta na memória.
- **Abbreviations:** Utilização de métodos modernos e defensivos como `getOrDefault` e `putIfAbsent` para escrever código limpo e seguro contra `NullPointerException`.

### 🔹 Parte 7: Algoritmos e Paradigmas de Programação
*Foco na lógica matemática, refatoração e construção de sistemas completos.*
- **Algoritmos Fundamentais:** Implementação manual de algoritmos de ordenação (*Selection Sort*) e busca (*Binary Search*), compreendendo a lógica por trás das ferramentas prontas do Java.
- **LiquidContainers (Refatoração):** Transformação de código procedural complexo e propenso a erros em uma arquitetura limpa e encapsulada Orientada a Objetos.
- **BigYear / RecipeSearch:** Desenvolvimento de sistemas maiores integrando múltiplas classes, separação de UI e manipulação de dados complexos.

### 🔹 Parte 6: Arquitetura e Separação de Camadas
*Foco na organização do código e testes automatizados.*
- **CargoHold:** Implementação de lógica complexa com 3 níveis de profundidade (Porão contém Malas, que contêm Itens), utilizando delegação de métodos.
- **ToDoList:** Refatoração de estrutura de dados (de Map para List) para atender regras de negócio de ordenação, com separação estrita da Interface de Texto.
- **SimpleDictionary:** Aplicação do padrão de separar a classe de `UserInterface` da classe de Lógica, eliminando acoplamento.

### 🔹 Parte 5: Programação Orientada a Objetos Avançada
*Foco em referências de memória e encapsulamento.*
- **Money:** Lógica de manipulação monetária sem perda de precisão (convertendo unidades), objetos imutáveis e sobrecarga de operadores.
- **PaymentTerminal:** Uso de constantes (`static final`) e passagem de objetos como referência.
- **DatingApp (SimpleDate):** Lógica matemática de datas e tratamento de "estouro" de dias/meses.

## 👨‍💻 Autor
**Matheus Fellipe**
