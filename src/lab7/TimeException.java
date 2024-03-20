package lab7;

// Wap in Java to create a User defined exception name time exception with conditions -
//1. if hours value is less than 0 and greater than 24
//2. if minutes value less than 0 and greater than 60
//3. if seconds value is less than 0 and greater than 60

//java.lang ->exception
class TimeException extends Exception {
    TimeException(String message) {
        super(message);
    }
}

class TimeValidator {
    public static void main(String[] args) {
        try {
            validateTime(25, 45, 30);
            validateTime(12, 70, 30);
            validateTime(12, 45, 70);
            validateTime(18, 30, 45);
        } catch (TimeException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }

    public static void validateTime(int hours, int minutes, int seconds) throws TimeException {
        if (hours<0||hours>=24) {
            throw new TimeException("Invalid hours value: "+hours);
        }
        if (minutes<0||minutes>=60) {
            throw new TimeException("Invalid minutes value: "+minutes);
        }
        if (seconds<0||seconds>=60) {
            throw new TimeException("Invalid seconds value: "+seconds);
        }
        System.out.println("Time validated successfully: "+hours+":"+minutes+":"+seconds);
    }
}
