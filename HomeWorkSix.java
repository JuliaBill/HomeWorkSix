import basic.LessonSevenSwitch;

import javax.management.MBeanAttributeInfo;
import java.time.temporal.JulianFields;

public class HomeWorkSix {

    public static void main(String[] args) {
        int days = lengthOfTheMonth(DaysInMonth.MAI);
        System.out.println(DaysInMonth.MAI + " contains " + days + " days");

    }

    enum DaysInMonth {JAN, FEB, MAR, APR, MAI, JUN, JUL, AUG, SEP, OCT, NOV, DEC;
    }
        public static int lengthOfTheMonth( DaysInMonth days)
        {
            switch (days) {
                case JAN:
                case MAR:
                case MAI:
                case JUL:
                case AUG:
                case OCT:
                case DEC:
                    return 31;

                case APR:
                case JUN:
                case SEP:
                case NOV:
                    return 30;

                case FEB:
                    return 28;
            }

            return -1;
            }
        }


