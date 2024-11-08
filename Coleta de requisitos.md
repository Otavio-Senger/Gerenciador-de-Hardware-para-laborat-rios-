# Documento de Levantamento de Requisitos

#### Projeto: Gerenciador de Hardware para Laboratórios 
#### Data: 24/10/2024
#### Responsável:
- Maria Fernanda Chmiel Fagundes
- Otávio Porto Senger

## 1. Introdução

### 1.1 Objetivo

O objetivo deste documento é detalhar os requisitos funcionais e não funcionais do sistema "Gerenciador de Hardware para Laboratórios",
que permite o controle e monitoramento de máquinas, consertos, peças trocadas e inventário de componentes em um ou mais laboratórios.

### 1.2 Escopo

O sistema gerencia:

- Cadastro e controle de máquinas de 4 laboratórios.
- Registro de manutenções, conserto.

### 1.3 Definições, Acrônimos e Abreviações

- Máquina:
Definição: Refere-se a qualquer dispositivo físico que execute operações computacionais.
Acrônimos e Abreviações: VM (Virtual Machine)

- Peça:
Definição: Refere-se a um componente ou parte física de um computador ou sistema computacional.
Isso pode incluir qualquer componente interno ou periférico, como processadores, placas-mãe,
discos rígidos, cabos, teclados, monitores, entre outros.
Acrônimos e Abreviações: PC

- Conserto:
Definição: O processo de reparar um computador, seus componentes ou dispositivos relacionados,
quando estes apresentam defeitos ou falhas. O conserto pode envolver diagnóstico, substituição
de peças ou ajustes no software.
Acrônimos e Abreviações: CNS

- Inventário
Definição: O processo de catalogar e registrar todos os ativos de hardware e software de uma
organização. Em TI, o inventário geralmente se refere ao acompanhamento de componentes de
computador, sistemas operacionais instalados, licenças de software e outros recursos tecnológicos.
Acrônimos e Abreviações: INV

## 2. Requisitos Funcionais

### 2.1 Cadastro de Máquinas

- O sistema permite o cadastro de máquinas.
- Cada máquina tem seu devido laboratório.
- Exibe o status da máquina (funcionando, em manutenção, não funcionando)

### 2.2 Controle de Consertos e Manutenções

- Registra e mostra todas as manutenções pendentes e realizadas, com suas respectivas datas
  e agenda de manutenções preventivas.
- Contem as peças utilizadas em cada manutenção
- Histórico completo de todas as manutenções realizadas em uma máquina

### 2.3 Gerenciamento de Laboratórios

- Gerencia diversos laboratórios associando às máquinas e peças.
- Diversos painéis que mostram o status da máquina

### 2.4 Controle de Acesso e Usuários

- O sistema deve permitir a criação de perfis de usuário com diferentes níveis de acesso ( administradores, estagiários, professores, técnicos).

## 3. Requisitos Não Funcionais

### 3.1. Usabilidade

- O sistema deve ter uma interface simples para a facilidade do uso do usuário

  ## **4. Requisitos de Interface**

### **4.1. Interface Gráfica**

- O sistema deve ter uma interface gráfica baseada em JavaFX ou Swing.

## **Considerações finais**

O sistema facilita o controle e o monitoramento das máquinas e peças, proporcionando maior eficiência na gestão de manutenção e 
inventário dos laboratórios. Este documento deverá ser revisado periodicamente conforme novas funcionalidades e necessidades sejam identificadas.
