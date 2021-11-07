package application;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException { //esse método pode gerar exceção
        Locale.setDefault(Locale.US); //trabalhando com padrão EUA
        Scanner sc = new Scanner(System.in); //Leitura da entrada
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); //criando padrão de leitura de data

        System.out.print("Enter department's name: ");
        String departmentName = sc.nextLine(); // Lendo e armazenando na Variável
        System.out.println("Enter worker data: ");
        System.out.print("Name: "); // Lendo e armazenando na Variável
        String workerNeme = sc.nextLine();
        System.out.print("Level: "); // Lendo e armazenando na Variável
        String workerLevel = sc.nextLine();
        System.out.print("Base Salary: ");
        Double basesalary = sc.nextDouble(); // Lendo e armazenando na Variável

        Worker worker = new Worker(workerNeme, WorkerLevel.valueOf(workerLevel), basesalary, new Department(departmentName)); // criando um novo worker pasando a entreda do teclado como parâmetro.

        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt(); // Lendo quantidade de contratos

        for (int i = 1; i <= n ; i++) {
            System.out.print("Enter contract #"+ i +" data:"); //impriminto o a quantidade de repetições
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next()); //padrão para leitura de datas
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();// lendo o valor e armazenando na variável
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();  // lendo o valor e armazenando na variável
            HourContract contract = new HourContract(contractDate, valuePerHour, hours); //criando uma variável do tipo HourContract passando como parâmetro tudo que foi lido nas variáveis acima
            worker.addContract(contract); // adcionando um contrato
        }
        System.out.println(); //armazenando dados apartir de strings
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Departament: " + worker.getDepartment().getName());
        System.out.println("Income for" + monthAndYear + ":" + String.format("%.2f", worker.income(year, month)));

        sc.close();
    }
}
