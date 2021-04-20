
/**
 * Class Calendar1
 * 
 * 
 */
import java.util.*;

public class Calendar1
{
    public static void main(String[] args)
    {

        Scanner console = new Scanner(System.in);
        //variable declarations
        int month, day, year;
        int dayInMonth;
        int dayofweek;      //day of the week that a day needs to be printed
        int weekday;        //day of the week
        
        //user input
        System.out.print( "\nEnter the month, and year (separated by spaces): ");
        month = console.nextInt();
        year = console.nextInt();
        
        //calculations
        day = daysInMonth(month, year);
        dayInMonth = 1;
        dayofweek = dow(month, dayInMonth, year);
        weekday = 0;
        
        //user output
        System.out.println("Sun  Mon  Tue  Wed  Thu  Fri  Sat");
        while(weekday < dayofweek)
        {
            System.out.printf("     ");
            weekday++;
        }
        while(dayInMonth <= day)
        {
            System.out.printf("%-3d", dayInMonth);
            System.out.printf("  ");
            dayInMonth++;
            dayofweek++;
            if (dayofweek > 6)
            {
                System.out.printf("\n");
                dayofweek = 0;
            }
        }
        
        
        
        
        // Display the formatted calendar for the month and year
        // requested. Use the dow() and daysInMonth() methods.
        
       
    }
    
    // function: isLeapYear( int y)
    // purpose:  indicates whether a given year is a leap year
    // input:    the year
    // output:   true/false
    
    public static boolean isLeapYear (int year)
    {
        //leap year determination
        if ( (year % 100 != 0 && year % 4 == 0) || year % 400 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    // function: dow( int y)
    // purpose:  indicates the day of the week a given day falls on
    // input:    the month, day, and year
    // output:   returns 0 = Sun, 1 = Mon, ..., 6 = Sat
    
    public static int dow( int monthent, int dayOfMonth, int year)
    {
        //day of the week in number form
        //variable declarations
        int monthadj;     //month on the adjusted calender
        int shifty;       //shift of the day of the week due to years
        int shiftm;       //shift of the day of the week due to months
        int shiftd;       //shift of the day of the week due to days
        int dayOfWeek;    //day of the week
        
        //calculation of dow number
        if ( monthent < 3)
        {
            year = year - 1;
        }
        shifty = (( 3 + year + (int)(year / 4) - (int)(year / 100) + (int)(year / 400)) % 7);
        monthadj = ((monthent + 9) % 12);
        shiftm = (((int)((2.6 * monthadj) + .5) % 7));
        shiftd = (dayOfMonth - 1);
        dayOfWeek = ((shifty + shiftm + shiftd) % 7);
        //return what the day of the week value is
        return dayOfWeek;
    }
    
    // function: daysInMonth( month, year)
    // purpose:  returns the number a days in a specified month.
    // input:    the month, and year
    // output:   the number of days in the month
    
    public static int daysInMonth (int month, int year)
    {
        int totaldays;      //total days in a month
        totaldays = 0;
        switch (month)
        {
            case 1: totaldays = 31;
                break;
            case 3: totaldays = 31;
                break;
            case 5: totaldays = 31;
                break;
            case 7: totaldays = 31;
                break;
            case 8: totaldays = 31;
                break;
            case 10: totaldays = 31;
                break;
            case 12: totaldays = 31;
                break;
            case 4: totaldays = 30;
                break;
            case 6: totaldays = 30;
                break;
            case 9: totaldays = 30;
                break;
            case 11: totaldays = 30;
                break;
            case 2:  if (isLeapYear (year)) 
                     {
                        totaldays = 29;
                     }
                     else 
                     {
                        totaldays = 28;
                     }
                 break;
        }
        return totaldays;
    }
    
}
