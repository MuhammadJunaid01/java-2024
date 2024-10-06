class DataType {
    public static void main(String[] arg) {
        int num = 10;
        System.out.println("my num is " + num);
        num = 100;
        System.out.println("my num is " + num);
        
        String firstName = "Junaid";
        String lastName="Ahmed";
        String fullName=firstName + " " + lastName;
        System.out.println("My firstName is " + firstName);
        System.out.println("My fullName is " + fullName);

        float price = 19.99f;
        char grade = 'h';
        boolean isOk = false;

        System.out.println("Price is " + price);
        System.out.println("Grade is " + grade);
        System.out.println("Is it okay? " + isOk);
    }
}
