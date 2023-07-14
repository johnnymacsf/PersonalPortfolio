public class Exchange2 {
    private static double conversion;
    public static double main(String money, String currency){
        double d = Double.parseDouble(money);
        switch(currency){
            case "EUR":
                conversion = d * 1.091057;
                break;
            case "GBP":
                conversion = d * 1.271339;
                break;
            case "INR":
                conversion = d * 0.012194;
                break;
            case "AUD":
                conversion = d * 0.667535;
                break;
            case "CAD":
                conversion = d * 0.760172;
                break;
            case "SGD":
                conversion = d * 1.116540;
                break;
            case "CHF":
                conversion = d * 0.213967;
                break;
            case "JPY":
                conversion = d * 0.006971;
                break;
            case "CNY":
                conversion = d * 0.138173;
                break;
            default:
                conversion = -1;
                break;
        }
        return conversion;
    }
}