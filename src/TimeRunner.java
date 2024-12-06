public class TimeRunner {
    public static void main(String[] args) {

        Time time1 = new Time(8, 9, 58);
        Time time2 = new Time(15, 59, 58);
        Time time3 = new Time(23, 59, 58);



        /*Test cases below*/

        System.out.println("Expected output: 08:09:58");
        System.out.print("Actual output: " );
        System.out.println(time1);
        System.out.println("Expected output: 15:59:58");
        System.out.print("Actual output: " );
        System.out.println(time2);
        System.out.println("Expected output: 23:59:58");
        System.out.print("Actual output: " );
        System.out.println(time3);

        time1.tick();
        time1.tick();
        time1.tick();
        System.out.println("Expected output: 08:10:01");
        System.out.print("Actual output: " );
        System.out.println(time1);

        time2.tick();
        time2.tick();
        time2.tick();
        System.out.println("Expected output: 16:00:01");
        System.out.print("Actual output: " );
        System.out.println(time2);

        time3.tick();
        time3.tick();
        time3.tick();
        System.out.println("Expected output: 00:00:01");
        System.out.print("Actual output: " );
        System.out.println(time3);


        System.out.println("Expected output: 8 10 1");
        System.out.println("Actual output: " + time1.getHour() + " " + time1.getMin() + " " + time1.getSec());

        time1.add(time2);
        System.out.println("Expected output: 00:10:02");
        System.out.print("Actual output: " );
        System.out.println(time1);

        time3.add(time1);
        System.out.println("Expected output: 00:10:03");
        System.out.print("Actual output: " );
        System.out.println(time3);


        time2.add(time3);
        System.out.println("Expected output: 16:10:04");
        System.out.print("Actual output: " );
        System.out.println(time2);
    }
}
