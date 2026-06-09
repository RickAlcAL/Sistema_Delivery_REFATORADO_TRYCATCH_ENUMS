# Delivery System Refactored

Este repositório contém a versão refatorada de um **Sistema de Gerenciamento de Delivery** desenvolvido em Java. O objetivo principal da refatoração foi aumentar a confiabilidade do software e organizar o fluxo de estados dos pedidos.

## 🚀 Melhorias Aplicadas

* **Tratamento de Exceções (`try-catch`):** Implementação de capturas robustas para evitar falhas críticas em operações como cálculo de frete, busca de produtos e processamento de pagamentos.
* **Uso de `Enums`:** Padronização e centralização dos status dos pedidos (ex: `PENDENTE`, `PREPARANDO`, `EM_ROTA`, `ENTREGUE`, `CANCELADO`), garantindo consistência nas regras de negócio.

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java
* **Paradigma:** Orientação a Objetos (POO)

---
*Desenvolvido com foco em boas práticas de programação e resiliência de código.*
