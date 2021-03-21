import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("What car are you looking for?");
        String carMake = scanner.nextLine();
        carMake = carMake.toLowerCase();

        if (carMake.equals("audi") || carMake.equals("bmw")) {
            System.out.println("Model are you looking for?");
            String carModel = scanner.nextLine();
            carModel = carModel.toLowerCase();

            if (carMake.equals("audi") && carModel.equals("a1") || carMake.equals("audi") && carModel.equals("a3") || carMake.equals("bmw") && carModel.equals("x1") || carMake.equals("bmw") && carModel.equals("z4")) {
                System.out.println("Colour do you want your car to be?");
                String carColour = scanner.nextLine();
                carColour = carColour.toLowerCase();

                if (carMake.equals("audi") && carModel.equals("a1") && carColour.equals("red")|| carMake.equals("audi") && carModel.equals("a1") && carColour.equals("green") || carMake.equals("audi") && carModel.equals("a3") && carColour.equals("black")|| carMake.equals("audi") && carModel.equals("a3") && carColour.equals("white") || carMake.equals("bmw") && carModel.equals("x1") && carColour.equals("yellow")|| carMake.equals("bmw") && carModel.equals("x1") && carColour.equals("blue") || carMake.equals("bmw") && carModel.equals("z4") && carColour.equals("white") || carMake.equals("bmw") && carModel.equals("z4") && carColour.equals("black")) {
                    System.out.println("You're lucky! We have exactly what you want.");

                    if (carModel.equals("a1")) {
                        System.out.println(carMake + " " + carModel + " in colour " + carColour + " will cost £14,000");
                    } else if (carModel.equals("a3")) {
                        System.out.println(carMake + " " + carModel + " in colour " + carColour + " will cost £20,000");
                    } else if (carModel.equals("x1")) {
                        System.out.println(carMake + " " + carModel + " in colour " + carColour + " will cost £28,000");
                    } else {
                        System.out.println(carMake + " " + carModel + " in colour " + carColour + " will cost £35,000");
                    }
                } else {
                    System.out.println("I'm sorry, we don't have that colour in our shop.");
                }
            } else {
                System.out.println("I'm sorry, we don't have that model in our shop.");
            }
        } else {
            System.out.println("I'm sorry, we don't have that car in our shop.");
        }
    }
}
