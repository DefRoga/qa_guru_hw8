package tests;


import org.junit.jupiter.api.Test;
import pages.PageObject;


public class PracticeFormWithFaker extends Object {

    PageObject pageObject = new PageObject();
    TestData testData = new TestData();

    @Test
    void succesfullRegistrationTest() {


        pageObject.openPage()
                .setFirstName(testData.firstName)
                .setLastName(testData.lastName)
                .setEmail(testData.email)
                .setGender(testData.gender)
                .setUserNumber(testData.phone)
                .setDateOfBirth(testData.randomDay, testData.randomMonth, testData.randomYear)
                .setSubjects(testData.subject)
                .setHobbies(testData.hobby)
                .setAddress(testData.address)
                .setFile("image.jpg")
                .scrollDaunEbaniy()
                .setState(testData.state)
                .setCity(testData.city)
                .submit()

                .checkResultSuccessfull("Student Name", testData.firstName + " " + testData.lastName)
                .checkResultSuccessfull("Student Email", testData.email)
                .checkResultSuccessfull("Gender", testData.gender)
                .checkResultSuccessfull("Mobile", testData.phone)
                .checkResultSuccessfull("Date of Birth", testData.randomDay + " " + testData.randomMonth + "," + testData.randomYear)
                .checkResultSuccessfull("Subjects", testData.subject)
                .checkResultSuccessfull("Hobbies", testData.hobby)
                .checkResultSuccessfull("Picture", "image.jpg")
                .checkResultSuccessfull("Address", testData.address)
                .checkResultSuccessfull("State and City", testData.state + " " + testData.city);

    }


    @Test
    void negativeRegistrationTest() {
        pageObject.openPage()
                .submit()
                .checkNegativeResult("border-color", "rgb(220, 53, 69)");
    }

    @Test
    void minimalData() {
        pageObject.openPage()
                .setFirstName(testData.firstName)
                .setLastName(testData.lastName)
                .setGender(testData.gender)
                .setUserNumber(testData.phone)
                .submit()
                .checkResultMinData("Student Name", testData.firstName + " " + testData.lastName)
                .checkResultMinData("Gender", testData.gender)
                .checkResultMinData("Mobile", testData.phone);

    }
}