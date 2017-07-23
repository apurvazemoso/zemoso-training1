package gruber;
import java.io.*;
import java.text.*;
import java.util.*;

//Save the signup date and current date
class InitialData{
    final SimpleDateFormat dateform =new SimpleDateFormat("dd-MM-yyyy");
    Date signup;
    Date current;

    public InitialData(String signupdate,String formdate)  {
        try {
            signup= dateform.parse(signupdate);
            current = dateform.parse(formdate);
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
    }

    //Change anniversary date year to current date year so that we can have ease in finding out the correct range.
    public Date AnniComparision() {
        Calendar ani = Calendar.getInstance();
        ani.setTime(signup);
        Calendar cur = Calendar.getInstance();
        cur.setTime(current);
        ani.set(Calendar.YEAR,cur.get(Calendar.YEAR));
        Date anni=ani.getTime();
        return anni;
    }

    /*Three cases here :
    if current date < anniversary date - 30, then go to last year and print the valid range.
    if current date > anniversary date + 30, then valid range is anniversary date - 30 and anniversary date + 30.
    if current date < anniversary date + 30 and current date > anniversary date - 30, then valid range is anniversary date - 30 and current date.
    */
    public String ValidRangeMaker(Date anniversary) {
        Calendar tempCal = Calendar.getInstance();
        tempCal.setTime(anniversary);
        tempCal.add(Calendar.DATE, -30);
        Date startani = tempCal.getTime();
        Date endani;
        tempCal.add(Calendar.DATE, 60);
        endani = tempCal.getTime();
        if(endani.after(current) && startani.before(current)) {
            endani=current;
        }
        if(startani.after(current)){
            tempCal.add(Calendar.YEAR,-1);endani = tempCal.getTime();
            tempCal.add(Calendar.DATE, -60);startani = tempCal.getTime();            
        }
        return (dateform.format(startani)+" to "+dateform.format(endani));
    }


    /*The form filling date must lie in the anniversary +-30 days range, so we have to omit all the cases where the form filling range have
    chances to lie at or before the minimum possible date which is - Signup date + 1 yr - 30 days.*/
    public boolean checkMinFormFillDate(){
        //curr > signup-30day+1yr;
        Calendar minDate = Calendar.getInstance();
        minDate.setTime(signup);
        minDate.add(Calendar.DATE, -30);
        minDate.add(Calendar.YEAR, 1);
        Date mindate1 = minDate.getTime();
        return (mindate1.compareTo(current) <= 0);
    }
}


public class GruberHealthcare {

    public static boolean checkFormat(String s){
        return s.matches("^\\d+\\-\\d+\\-\\d+[ ]+\\d+\\-\\d+\\-\\d+$");
    }

    public static void main(String[] args) throws IOException {
        Scanner num = new Scanner(System.in);
        int numb = num.nextInt();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        while(numb>0){
            numb = numb-1;
            s=br.readLine();
            if(checkFormat(s))
                {       
                String[] data=s.split(" ");
                InitialData form=new InitialData(data[0],data[1]);
                if(form.checkMinFormFillDate()){
                    Date anniversary=form.AnniComparision();
                    System.out.println(form.ValidRangeMaker(anniversary));
                }
                else {
                    System.out.println("No range");
                }
            }
            else
                System.out.println("Wrong Format");
        }
    }
}
