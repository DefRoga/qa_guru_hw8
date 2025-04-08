package utils;

import com.github.javafaker.Faker;

public class RandomUtils {
        static Faker faker = new Faker();


    public static String getRandomGender() {

        return faker.options().option("Male", "Female", "Other");
    }

    public static String generateRandomDay() {
        return String.format("%02d", faker.number().numberBetween(1, 32)); // Форматируем день как "01", "02" и т.д.
    }

    public static String generateRandomMonth() {
        String[] months = {
                "January", "February", "March",
                "April", "May", "June", "July",
                "August", "September", "October", "November",
                "December"
        };
        int randomMonthIndex = faker.number().numberBetween(0, months.length); // Генерируем случайный индекс от 0 до 11
        return months[randomMonthIndex];
    }

    public static String generateRandomYear() {
        int randomYear = faker.number().numberBetween(1950, 2026); // Генерация числа от 1950 до 2025
        return Integer.toString(randomYear); // Преобразуем число в строку и возвращаем
    }

    public static String getRandomSubjects() {
        String[] subjects = {
                "English", "Chemistry", "Computer Science",
                "Commerce", "Economics", "Arts", "History",
                "Maths", "Accounting", "Social Studies", "Civic", "Physics"
        };
        int randomSubjectsIndex = faker.number().numberBetween(0, subjects.length);
        return subjects [randomSubjectsIndex];
    }

    public static String getRandomHobbies() {
        return faker.options().option("Sports", "Reading", "Music");
    }

    public static String getRandomState() {
        return faker.options().option("NCR", "Uttar Pradesh",
                "Haryana", "Rajasthan");

    }

    public static  String getRandomCity(String value) {
        switch (value) {
            case "NCR":
                return faker.options().option("Delhi", "Gurgaon", "Noida");
            case "Uttar Pradesh":
                return faker.options().option("Agra", "Lucknow", "Merrut");
            case "Haryana":
                return faker.options().option("Karnal", "Panipat");
            case "Rajasthan":
                return faker.options().option("Jaipur", "Jaiselmer");
        }
        return null;
    }

}
