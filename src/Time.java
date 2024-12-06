public class Time {

    /**
     * instance variables for the Time class
     * sec corresponds to second, min to minutes, and hour to hours of the objects in the Time class
     */
    private int sec;
    private int min;
    private int hour;

    /**
     * This is a constructor of the Time class which takes in 3 parameters to get info about the time
     * @param hour initializes the hour instance variable to be used in the program later
     * @param min initializes the min instance variable to be used in the program later
     * @param sec initializes the sec instance variable to be used in the program later
     */
    public Time(int hour, int min, int sec)
    {
        this.sec = sec;
        this.min = min;
        this.hour = hour;
    }

    /**
     * tick is a method of the Time class, it adds 1 to the sec variable, if the sec variable exceeds 60,  it resets it to 0
     * and adds 1 to the min variable, if the min variable exceeds 60 it resets it to 0 and adds 1 to the hour variable,
     * and if the hour variable exceeds 24, the time gets reset to 00:00:00
     */
    public void tick()
    {
        sec ++;

        if(sec >= 60){
            sec = 0;
            min ++;
        }
        if(min >= 60)
        {
            min = 0;
            hour++;
        }
        if(hour >= 24)
        {
            hour = 0;
            min = 0;
            sec = 0;
        }
    }

    /**
     * toString is a method of the Time class, it takes in all the values of sec, min, and hour in order to print out
     * the values in the wanted format of HH:MM:SS
     * @return the values of time in the wanted format written in a String
     */
    public String toString()
    {
        String time = "";
        if (hour < 10)
        {
            time += "0" + hour;
        }
        else{
            time += hour;
        }
        time += ":";
        if (min < 10)
        {
            time += "0" + min;
        }
        else{
            time += min;
        }
        time += ":";
        if (sec < 10)
        {
            time += "0" + sec;
        }
        else{
            time += sec;
        }
        return time;
    }

    /**
     * getSec is a method of the Time class to get the value of sec instance variable
     * @return value of sec
     */
    public int getSec() {
        return sec;
    }
    /**
     * getMin is a method of the Time class to get the value of min instance variable
     * @return value of min
     */
    public int getMin() {
        return min;
    }
    /**
     * getHour is a method of the Time class to get the value of hour instance variable
     * @return value of hour
     */
    public int getHour() {
        return hour;
    }

    /**
     * add is a method of the Time class, it takes in two different objects of the Time class and adds their values together
     * the result would update the time of the caller object to the new value,
     * this method follows similar rules to the tick() method, but now it keeps the remainder whenever the values exceed 60,60,24
     * thus would +1 to min if  sec>=60 +1 to hour if min>=60, and hour = 0, if hour >=24
     * @param time an object of the Time class whose values would be added
     * @return the caller object with the updated time values
     */
    public String add(Time time)
    {
        sec += time.getSec();
        min += time.getMin();
        hour += time.getHour();
        if(sec>= 60)
        {
            sec = sec % 60;
            min ++;
        }
        if(min >= 60)
        {
            min = min % 60;
            hour ++;
        }
        if(hour >= 24)
        {
            hour = hour % 24;
        }
        return toString();
    }
}
