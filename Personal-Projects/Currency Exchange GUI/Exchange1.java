public class Exchange1 {
    private static double conversion;

    public static double main(String money, String currency){
        double d = Double.parseDouble(money);
        switch(currency){
            case "EUR":
                conversion = d * 0.916543;
                break;
            case "GBP":
                conversion = d * 0.786572;
                break;
            case "INR":
                conversion = d * 82.008330;
                break;
            case "AUD":
                conversion = d * 1.498048;
                break;
            case "CAD":
                conversion = d * 1.315492;
                break;
            case "SGD":
                conversion = d * 1.353533;
                break;
            case "CHF":
                conversion = d * 0.895624;
                break;
            case "JPY":
                conversion = d * 143.441449;
                break;
            case "CNY":
                conversion = d * 7.237294;
                break;
            default:
                conversion = -1;
                break;
        }
        return conversion;
    }
}
