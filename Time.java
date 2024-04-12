package assignment3;

class Time {
    private int hr;
    private int min;
    private int sec;

    // Constructor with parameters for hour, minute, and second
    public Time(int hr, int min, int sec) {
        setTime(hr, min, sec);
    }

    // Constructor with default values
    public Time() {
        this(0, 0, 0); // Calling the parameterized constructor with default values
    }

    // Method to set valid time
    public void setTime(int hr, int min, int sec) {
        if (hr >= 0 && hr < 24 && min >= 0 && min < 60 && sec >= 0 && sec < 60) {
            this.hr = hr;
            this.min = min;
            this.sec = sec;
        } else {
            System.out.println("Invalid time values. Setting default values.");
            this.hr = 0;
            this.min = 0;
            this.sec = 0;
        }
    }

    // Method to display time
    public void display() {
        System.out.printf("%02d:%02d:%02d\n", hr, min, sec);
    }
}
