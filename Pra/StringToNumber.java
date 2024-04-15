public class StringToNumber    {
    
    private static final String[] units = {"", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN",
                                           "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN"};
    
    private static final String[] tens = {"", "", "TWENTY", "THIRTY", "FORTY", "FIFTY", "SIXTY", "SEVENTY", "EIGHTY", "NINETY"};
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number less than 1000: ");
        int number = scanner.nextInt();
        scanner.close();
        
        if (number < 1 || number >= 1000) {
            System.out.println("Out Of Range.");
        } else {
            System.out.println(convertToWords(number));
        }
    }
    
    public static String convertToWords(int number) {
        if (number < 20) {
            return units[number];
        }
        
        if (number < 100) {
            return tens[number / 10] + " " + units[number % 10];
        }
        
        if (number < 1000) {
            return units[number / 100] + " HUNDRED AND " + convertToWords(number % 100);
        }
        
        return "Out Of Range.";
    }
}