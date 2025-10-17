// Alunas:
// Isabella Rottoli Mantovani
// Marjory Harumi Barbosa Hito

import java.time.LocalDate;
import java.time.LocalDateTime;


public class GerenciarControlePonto {

    public static void main(String[] args) throws InterruptedException {
        
        Gerente gerente = new Gerente();
        gerente.setIdFunc(1);
        gerente.setNome("Gerente Isabella");
        gerente.setEmail("isabella.gerente@empresa.com");
        gerente.setDocumento("111.222.333-44");
        gerente.setLogin("isabella.gerente");
        gerente.setSenha("bella123");

        Secretaria secretaria = new Secretaria();
        secretaria.setIdFunc(2);
        secretaria.setNome("Secretaria Marjory");
        secretaria.setEmail("marjory.secretaria@empresa.com");
        secretaria.setDocumento("555.666.777-88");
        secretaria.setTelefone("19-99999-8888");
        secretaria.setRamal("1020");

        Operador operador = new Operador();
        operador.setIdFunc(3);
        operador.setNome("Operador Matheus");
        operador.setEmail("matheus.operador@empresa.com");
        operador.setDocumento("999.888.777-66");
        operador.setValorHora(15.50);

        RegistroPonto registroEntradaGerente = new RegistroPonto();
        registroEntradaGerente.setFunc(gerente);
        registroEntradaGerente.setDataRegistro(LocalDate.now());
        registroEntradaGerente.setHoraEntrada(LocalDateTime.now());
        registroEntradaGerente.apresentarRegistroPonto();
        Thread.sleep(1000);

        RegistroPonto registroEntradaSecretaria = new RegistroPonto();
        registroEntradaSecretaria.setFunc(secretaria);
        registroEntradaSecretaria.setDataRegistro(LocalDate.now());
        registroEntradaSecretaria.setHoraEntrada(LocalDateTime.now());
        registroEntradaSecretaria.apresentarRegistroPonto();
        Thread.sleep(1000);

        RegistroPonto registroEntradaOperador = new RegistroPonto();
        registroEntradaOperador.setFunc(operador);
        registroEntradaOperador.setDataRegistro(LocalDate.now());
        registroEntradaOperador.setHoraEntrada(LocalDateTime.now());
        registroEntradaOperador.apresentarRegistroPonto();
        Thread.sleep(1000);

        // REGISTRANDO SAÍDAS
        
        RegistroPonto registroSaidaGerente = new RegistroPonto();
        registroSaidaGerente.setFunc(gerente);
        registroSaidaGerente.setDataRegistro(LocalDate.now());
        registroSaidaGerente.setHoraSaida(LocalDateTime.now());
        registroSaidaGerente.apresentarRegistroPonto();
        Thread.sleep(1000);

        RegistroPonto registroSaidaSecretaria = new RegistroPonto();
        registroSaidaSecretaria.setFunc(secretaria);
        registroSaidaSecretaria.setDataRegistro(LocalDate.now());
        registroSaidaSecretaria.setHoraSaida(LocalDateTime.now());
        registroSaidaSecretaria.apresentarRegistroPonto();
        Thread.sleep(1000);

        RegistroPonto registroSaidaOperador = new RegistroPonto();
        registroSaidaOperador.setFunc(operador);
        registroSaidaOperador.setDataRegistro(LocalDate.now());
        registroSaidaOperador.setHoraSaida(LocalDateTime.now());
        registroSaidaOperador.apresentarRegistroPonto();
    }
}
