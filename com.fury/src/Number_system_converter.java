import java.util.*;

public class Number_system_converter {

// Binary

    public static int binToDec(int n) {
        int pow = 0;
        int decNum = 0;

        while (n > 0) {
            int rem = n % 10;
            decNum = decNum + (rem * (int)Math.pow(2, pow));
            pow++;
            n = n / 10;
        }
        return decNum;
        
    }
    public static int binToOct(int n) {
        int dec = binToDec(n);
        int pow = 1;
        int octNum = 0;

        while (dec > 0) {
            int rem = dec % 8;
            octNum += rem * pow;
            pow = pow * 10;
            dec = dec / 8;
        }
        return octNum;
    }
    public static String binToHexa(int n) {
        int dec = binToDec(n);
        String hexaNum = " ";
        char dig[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        while (dec > 0) {
            int rem = dec % 16;
            hexaNum = dig[rem] + hexaNum;
            dec = dec / 16;
            
        }
        return hexaNum;
    }

// Decimal

    public static int decToBin(int n) {
        int pow = 0;
        int binNum = 0;

        while (n > 0) {
            int rem = n % 2;
            binNum = binNum + (rem * (int)Math.pow(10, pow));
            pow++;
            n = n / 2;
            
        }
        return binNum;
    }
    public static int decToOct(int n) {
        int dec = n;
        int pow = 1;
        int octNum = 0;

        while (dec > 0) {
            int rem = dec % 8;
            octNum += rem * pow;
            pow = pow * 10;
            dec = dec / 8;
        }
        return octNum;
    }
    public static String decToHexa(int n) {
        int dec = n;
        String hexaNum = " ";
        char dig[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        while (dec > 0) {
            int rem = dec % 16;
            hexaNum = dig[rem] + hexaNum;
            dec = dec / 16;
            
        }
        return hexaNum;
    }

// Octal

    public static int octToBin(int n) {
        int dec = octToDec(n);
        int pow = 0;
        int binNum = 0;

        while (dec > 0) {
            int rem = dec % 2;
            binNum = binNum + (rem * (int)Math.pow(10, pow));
            pow++;
            dec = dec / 2;
            
        }
        return binNum;
    }
    public static int octToDec(int n) {
        int pow = 0;
        int decNum = 0;

        while (n > 0) {
            int rem = n % 10;
            decNum = decNum + (rem * (int)Math.pow(8, pow));
            pow++;
            n = n / 10;
            
        }
        return decNum;
    }
    public static String octToHexa(int n) {
        int dec = octToDec(n);
        String hexaNum = " ";
        char dig[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        while (dec > 0) {
            int rem = dec % 16;
            hexaNum = dig[rem] + hexaNum;
            dec = dec / 16;
            
        }
        return hexaNum;
    }

// HexaDecimal

    public static int hexaToBin(String n) {
        int dec = hexaToDec(n);
        int pow = 0;
        int binNum = 0;

        while (dec > 0) {
            int rem = dec % 2;
            binNum = binNum + (rem * (int)Math.pow(10, pow));
            pow++;
            dec = dec / 2;
            
        }
        return binNum;
    }
    public static int hexaToDec(String n) {
        String dig = "0123456789ABCDEF";
        n = n.toUpperCase();
        int decNum = 0;
        for(int i = 0; i < n.length(); i++){
            char c = n.charAt(i);
            int d = dig.indexOf(c);
            decNum = 16 * decNum + d;
        }

        return decNum;
    }
    public static int hexaToOct(String n) {
        int dec = hexaToDec(n);
        int pow = 1;
        int OctNum = 0;

        while (dec > 0) {
            int rem = dec % 8;
            OctNum += rem * pow;
            pow = pow * 10;
            dec = dec / 8;
        }
        return OctNum;
    }

    public static void num_conversion() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n ***** Number System Conversion *****");
        System.out.print(
                "\n " +
                        "01. Binary to Decimal \n " +
                        "02. Binary to Octal \n " +
                        "03. Binary to Hexadecimal \n " +
                        "04. Decimal to Binary \n " +
                        "05. Decimal to Octal \n " +
                        "06. Decimal to Hexadecimal \n " +
                        "07. Octal to Binary \n " +
                        "08. Octal to Decimal \n " +
                        "09. Octal to Hexadecimal \n " +
                        "10. Hexadecimal to Binary \n " +
                        "11. Hexadecimal to Decimal \n " +
                        "12. Hexadecimal to Octal \n \n " +
                        "Choose any one : ");
        String n = sc.nextLine();
        int bin, dec, oct;
        String hexa;
        System.out.print("\033[H\033[2J");
        switch (n) {
            case "1":
                System.out.print(" Enter Your Binary Number : ");
                bin = sc.nextInt();
                System.out.println(" Your Decimal Number is " + binToDec(bin));
                break;
            case "2":
                System.out.print("Enter your Binary Number : ");
                bin = sc.nextInt();
                System.out.println("Your Octal Number is " + binToOct(bin));
                break;
            case "3":
                System.out.print("Enter your Binary Number : ");
                bin = sc.nextInt();
                System.out.println("Your HexaDecimal Number is " + binToHexa(bin));
                break;
            case "4":
                System.out.print("Enter your Decimal Number : ");
                dec = sc.nextInt();
                System.out.println("Your Binary Number is " + decToBin(dec));
                break;
            case "5":
                System.out.print("Enter your Decimal Number : ");
                dec = sc.nextInt();
                System.out.println("Your Octal Number is " + decToOct(dec));
                break;
            case "6":
                System.out.print("Enter your Decimal Number : ");
                dec = sc.nextInt();
                System.out.println("Your HexaDecimal Number is " + decToHexa(dec));
                break;
            case "7":
                System.out.print("Enter your Octal Number : ");
                oct = sc.nextInt();
                System.out.println("Your Binary Number is " + octToBin(oct));
                break;
            case "8":
                System.out.print("Enter your Octal Number : ");
                oct = sc.nextInt();
                System.out.println("Your Decimal Number is " + octToDec(oct));
                break;
            case "9":
                System.out.print("Enter your Octal Number : ");
                oct = sc.nextInt();
                System.out.println("Your HexaDecimal Number is " + octToHexa(oct));
                break;
            case "10":
                System.out.print("Enter your HexaDecimal Number : ");
                hexa = sc.nextLine();
                System.out.println("Your Binary Number is " + hexaToBin(hexa));
                break;
            case "11":
                System.out.print("Enter your HexaDecimal Number : ");
                hexa = sc.nextLine();
                System.out.println("Your Decimal Number is " + hexaToDec(hexa));
                break;
            case "12":
                System.out.print("Enter your HexaDecimal Number : ");
                hexa = sc.nextLine();
                System.out.println("Your Octal Number is " + hexaToOct(hexa));
                break;

            
            default:
                System.out.println("Enter A Valid Number");
                break;
        }
        
    }
    public static void main(String[] args) {
        num_conversion();
        
    }

}