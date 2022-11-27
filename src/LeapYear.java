public class LeapYear {
    public static boolean isLeapYear(int year){
        if (year >= 1 && year <= 9999 ){
            if ((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) {
                return true;
            }
        } else {
            return false;
        }
        // If doesn't pass the first if statement
        return false;
    }

    public static void main(String[] args) {
        // Testing
        System.out.println(isLeapYear(1949)); // Output: false
        System.out.println(isLeapYear(2000)); // Output: true
        System.out.println(isLeapYear(2020)); // Output: true
    }
}
