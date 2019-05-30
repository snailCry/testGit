import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test implements Runnable {
    public static final String TEST = "test";
    public static String sss = "ceshi";

    @Override
    public int hashCode() {
        return super.hashCode();
    }


    public static void main(String[] args) {
        ArrayList<String> testList = new ArrayList<String>();
        testList.add("ssxxxxxxxs");
        for (String a: testList){
            System.out.println(a);
        }
        try {
            aaa();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(sss);
    }

    private static void aaa() {
        String A = TEST;



        GregorianCalendar gregorianCalendar = new GregorianCalendar(Calendar.DAY_OF_YEAR, Calendar.MONTH, Calendar.DAY_OF_MONTH);
        Calendar now = gregorianCalendar;
        String aaaa = new String("aaaa ");
        String b = aaaa;
    }


    public static String getSss() {

        return sss;
    }
    public Test() {
    }

    @Override
    public void run() {

    }
}
