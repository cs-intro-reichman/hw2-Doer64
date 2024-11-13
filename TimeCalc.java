public class TimeCalc {
    public static void main(String[] args) {
         //Get current hours and minutes and minutes to add
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int addMin = Integer.parseInt(args[1]);

        //calculate new hour and minutes
        int totalMin = (hours * 60) + minutes + addMin;  
        int totalHour = totalMin / 60;
        int newHour = totalHour % 24;
        int newMin = totalMin - (totalHour * 60);

        //show new hours and minutes in 24h clock
        if(newHour < 10)
            System.out.print("0");
        System.out.print(newHour + ":");

        if(newMin<10)
            System.out.print("0");
        System.out.print(newMin);
    }
}
