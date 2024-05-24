class Solution {
     public static int countTime(String time) {
        int count = 1;
        String[] times = time.split(":");
        char[] hours = times[0].toCharArray();
        char[] minutes = times[1].toCharArray();


        if (hours[0] == '?') {
            if (hours[1] == '?') {
                count *= 24;
            } else if (hours[1] <= '3') {
                count *= 3;
            } else {
                count *= 2;
            }
        } else {
            if (hours[1] == '?') {
                if (hours[0] == '2') {
                    count *= 4;
                } else {
                    count *= 10;
                }
            }
        }

        if (minutes[0] == '?') {
            count *= 6;
        }
        if (minutes[1] == '?') {
            count *= 10;
        }
        return count;
    }
}