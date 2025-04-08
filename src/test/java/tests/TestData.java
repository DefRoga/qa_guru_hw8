package tests;

import com.github.javafaker.Faker;

import static utils.RandomUtils.*;

public class TestData {

    Faker faker = new Faker();

    String
            firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            email = faker.internet().emailAddress(),
            gender = getRandomGender(),
            phone = faker.phoneNumber().subscriberNumber(10),
            randomDay = generateRandomDay(),
            randomMonth = generateRandomMonth(),
            randomYear = generateRandomYear(),
            address = faker.address().fullAddress(),
            subject = getRandomSubjects(),
            hobby = getRandomHobbies(),
            state = getRandomState(),
            city = getRandomCity(state);

}
