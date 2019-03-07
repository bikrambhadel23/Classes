package com.bikram;

public class Main {
    public static void main(String[] args) {

        BankAccount bobsAccount=new BankAccount(3456, 560, "bikram bhadel", "1234@gmail.com", "6273453447");
        System.out.println(bobsAccount.getAccNumber());
        System.out.println(bobsAccount.getAccbalance());
        System.out.println(bobsAccount.getEmail());;
//        bobsAccount.setAccNumber(1245767);
//        bobsAccount.setCustomerName("bob brown");
//        bobsAccount.setEmail("123@gmial.com");
//        bobsAccount.setPhoneNumber("6271918612");

        bobsAccount.withdraw(345);
        bobsAccount.deposit(400);
        bobsAccount.withdraw(350);

        CAr porsche= new CAr();
        CAr honda  = new CAr();
            porsche.setModel("carrera");
//     //   honda.setModel("Civic");
//        porsche.setColour("Black");
//        System.out.println("Colour is "+ porsche.setColour());
//        System.out.println("Model is "+ porsche.getModel());
        SimpleCalculator newcalc= new SimpleCalculator();
       Person newPerson=new Person();
       newPerson.setFirstName("");
       newPerson.setLastName("bhadel");
       newPerson.setAge(28);
     //  Person.isTeen();
        System.out.println("first name ="+ newPerson.getFirstName() );
        System.out.println("last name ="+ newPerson.getLastName() );
        System.out.println("age ="+ newPerson.getAge() );
        System.out.println("full name ="+ newPerson.getFullName());

//       SimpleCalculator secondNumber=new SimpleCalculator();
//       SimpleCalculator additionResult=new SimpleCalculator();
       newcalc.setFirstNumber(5);
       newcalc.setSecondNumber(6);
        System.out.println("First number is = "+ newcalc.getFirstNumber());
        System.out.println("Second number is = "+ newcalc.getSecondNumber());
        System.out.println("AdditionResult ="+ newcalc.getAdditionResult());
        System.out.println("SubtractionResult ="+ newcalc.getSubtractionResult());
        System.out.println("MultiplicationResult ="+ newcalc.getMultiplicationResult());
        System.out.println("DivisionResult ="+ newcalc.getDivisionResult());



    }

}
