class Solution {
    public int dayOfYear(String date) {
           int[] days = new int[] {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365 };
        String [] dates = date.split("-");
        int year = Integer.parseInt(dates[0]);
        int month = Integer.parseInt(dates[1]);
        int day = Integer.parseInt(dates[2]);
        return days[month - 1] + day + ((month > 2 && year % 4 == 0 && (year % 400 == 0 || year % 100 != 0)) ? 1: 0);
    }
}