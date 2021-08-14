import Com.entitiees.Gerente;
import Com.entitiees.Operador;
import Com.entitiees.RegistroPonto;
import Com.entitiees.Secretaria;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Aplicacao {

    public static void main(String[] args) throws InterruptedException  {
        TimeUnit time = TimeUnit.SECONDS;
        Scanner scanner = new Scanner(System.in);
        Operador operador = new Operador();
        Secretaria secretaria = new Secretaria();
        Gerente gerente = new Gerente();


        System.out.print("Digite seu Login: ");
        operador.setNome(scanner.next());
        RegistroPonto registroPontoOperador = new RegistroPonto(1234, operador);
        registroPontoOperador.setHoraEntrada(hour());
        time.sleep(0);
        System.out.println();
        System.out.print("Digite seu Login: ");
        secretaria.setNome(scanner.next());
        RegistroPonto registroPontoSecretaria = new RegistroPonto(1235, secretaria);
        registroPontoSecretaria.setHoraEntrada(hour());
        time.sleep(1);
        System.out.println();
        System.out.print("Digite seu Login: ");
        gerente.setNome(scanner.next());
        RegistroPonto registroPontoGerente = new RegistroPonto(1236, gerente);
        registroPontoGerente.setHoraEntrada(hour());
        time.sleep(1);


        registroPontoOperador.setHoraSaida(hour());
        time.sleep(1);
        registroPontoSecretaria.setHoraSaida(hour());
        time.sleep(1);
        registroPontoGerente.setHoraSaida(hour());
    }

    static LocalTime hour(){
        return LocalTime.now();
    }

    static LocalDate date(){
        return LocalDate.now();
    }
}
