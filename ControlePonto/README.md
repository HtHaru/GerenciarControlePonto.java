# Projeto ControlePonto - Exercício de Herança e Polimorfismo

## Descrição

Sistema de controle de ponto para registrar entrada e saída de funcionários de uma empresa de manufatura. O projeto demonstra conceitos de **Herança** e **Polimorfismo** em Java.

## Estrutura do Projeto

```
ControlePonto_Corrigido/
├── src/
│   ├── GerenciarControlePonto.java  (classe principal com método main)
│   ├── Funcionario.java             (classe base)
│   ├── Gerente.java                 (herda de Funcionario)
│   ├── Secretaria.java              (herda de Funcionario)
│   ├── Operador.java                (herda de Funcionario)
│   └── RegistroPonto.java           (classe para registro de ponto)
└── README.md
```

## Classes Implementadas

### Funcionario (Classe Base)
- **Atributos**: idFunc, nome, email, documento
- **Encapsulamento**: Todos os atributos privados com getters/setters

### Gerente (extends Funcionario)
- **Atributos adicionais**: login, senha

### Secretaria (extends Funcionario)
- **Atributos adicionais**: telefone, ramal

### Operador (extends Funcionario)
- **Atributos adicionais**: valorHora

### RegistroPonto
- **Atributos**: idRegPonto, func (Funcionario), dataRegistro, horaEntrada, horaSaida
- **Método principal**: apresentarRegistroPonto()
- **Uso de polimorfismo**: aceita qualquer tipo de Funcionario

## Como Compilar

```bash
# Navegue até o diretório src
cd src

# Compile todos os arquivos Java
javac *.java
```

## Como Executar

```bash
# Execute a classe principal
java GerenciarControlePonto
```

## Exemplo de Saída Esperada

```
Funcionário: Gerente Isabella
Data de Registro: 2025-10-17
Horário Entrada: 2025-10-17T09:44:43.301
Horário Saída: null
------------------------------------
Funcionário: Secretaria Marjory
Data de Registro: 2025-10-17
Horário Entrada: 2025-10-17T09:44:44.303
Horário Saída: null
------------------------------------
Funcionário: Operador Matheus
Data de Registro: 2025-10-17
Horário Entrada: 2025-10-17T09:44:45.303
Horário Saída: null
------------------------------------
Funcionário: Gerente Isabella
Data de Registro: 2025-10-17
Horário Entrada: null
Horário Saída: 2025-10-17T09:44:52.304
------------------------------------
Funcionário: Secretaria Marjory
Data de Registro: 2025-10-17
Horário Entrada: null
Horário Saída: 2025-10-17T09:44:53.305
------------------------------------
Funcionário: Operador Matheus
Data de Registro: 2025-10-17
Horário Entrada: null
Horário Saída: 2025-10-17T09:44:54.309
------------------------------------
```

## Conceitos Demonstrados

✅ **Herança**: Gerente, Secretaria e Operador herdam de Funcionario  
✅ **Polimorfismo**: RegistroPonto aceita qualquer tipo de Funcionario  
✅ **Encapsulamento**: Todos os atributos privados com getters/setters  
✅ **Uso de LocalDate e LocalDateTime**: Para manipulação de datas e horários  
✅ **Thread.sleep()**: Pausa de 1 segundo entre registros  

## Autoras

- Isabella Rottoli Mantovani
- Marjory Harumi Barbosa Hito

## Data

16 de outubro de 2025
