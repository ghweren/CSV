import com.opencsv.CSVReader;

import java.io.*;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)  {
        List<Person> persons = new ArrayList<Person>();
        List<Division> divisions = new ArrayList<Division>();

        String csvFilePath = "src/main/resources/foreign_names.csv";
        String line = "";
        String separator = ";";

        try (BufferedReader reader = new BufferedReader(new FileReader(csvFilePath))) {
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(separator);
                int id = Integer.parseInt(data[0]);
                String name = data[1];
                String gender = data[2];
                String birthDate = data[3];
                String divisionName=data[4];
                int salary = Integer.parseInt(data[5]);

                int divisionId= (int) (Math.random()*100);
                Division division=new Division(divisionId,divisionName);
                persons.add(new Person(id,name,gender,division,birthDate,salary));

                divisions.add(division);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("People:");
        for (Person person : persons) {
            System.out.println(person.toString());
        }

        System.out.println("\nDepartments:");
        for (Division division : divisions) {
            System.out.println(division.toString());
        }
    }
}