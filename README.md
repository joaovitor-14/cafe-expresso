# Projeto Café Expresso ☕

### Descrição do Projeto
O **Café Expresso** é um sistema de autoatendimento desenvolvido para uma cafeteria de pequeno porte. O objetivo do projeto é modernizar e agilizar o processo de pedidos, permitindo que o próprio cliente monte seu pedido em um totem digital e realize o pagamento no mesmo local, sem precisar enfrentar filas.

### Objetivos
- Deixar o atendimento mais rápido
- Evitar erros na hora de fazer os pedidos
- Fazer os cálculos automaticamente
- Organizar melhor os pedidos da cafeteria

### Funcionalidades
- Permitir cadastrar produtos com nome e preço
- Adicionar vários itens em um mesmo pedido
- Calcular automaticamente o valor total da compra
- Atualizar o andamento do pedido (pendente, pago, em preparo e finalizado)
- Garantir que o pedido só continue depois que o pagamento for feito

### Estrutura do Sistema
O sistema foi estruturado em três classes principais:

- **Produto**: representa os itens disponíveis no cardápio, com nome e preço.
- **ItemPedido**: relaciona um produto com sua quantidade e calcula o subtotal.
- **Pedido**: gerencia os itens do pedido, calcula o total e controla o status.

### Fluxo do Sistema
1. O cliente seleciona os produtos.
2. O sistema calcula o valor total do pedido.
3. O pagamento é realizado.
4. O pedido é enviado para preparação.
5. O atendente acompanha o pedido.
6. O pedido é finalizado e entregue ao cliente.

### Requisitos Funcionais
- **RF01**: O sistema deve permitir o cadastro de produtos com nome e preço.
- **RF02**: O sistema deve permitir adicionar múltiplos itens a um pedido.
- **RF03**: O sistema deve calcular automaticamente o valor total do pedido.
- **RF04**: O sistema deve permitir a alteração do status do pedido.

### Considerações
O sistema garante mais organização, segurança e eficiência no atendimento, evitando erros e melhorando a experiência do cliente.

### Tecnologias Utilizadas
- **Java** – linguagem principal do projeto
- **NetBeans** – IDE utilizada no desenvolvimento
- **Git e GitHub** – controle de versão
- **POO (Programação Orientada a Objetos)** – organização do código

### Como Executar o Projeto

#### Pré-requisitos
- Ter o Java instalado
- Ter uma IDE instalada

#### Passo a passo
1. Clone o repositório:
   ```bash
   git clone https://github.com/joaovitor-14/cafe-expresso.git
2. Execute o arquivo principal na sua IDE


### Alunos
Gabrielly da Silva Xavier

João Vitor Silva Moreira
