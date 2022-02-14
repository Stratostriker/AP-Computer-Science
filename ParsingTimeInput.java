public class ParsingTimeInput {
    public static void main(String[] args) {
        //test code
        System.out.println(parseTime("10:08 AM"));
        System.out.println(parseTime("6:45 pm"));
        System.out.println(parseTime("03:12 AM"));
        System.out.println(parseTime(" 7:23  Pm"));
        System.out.println(parseTime("444AM"));
        System.out.println(parseTime("0534"));
        System.out.println(parseTime("23:59"));
        System.out.println(parseTime("800"));
        System.out.println(parseTime("0035"));
    }

    public static int parseTime(String timeStr) {
        int[] time = {0, 0};
        boolean meridiem = false;
        timeStr = timeStr.trim();
        if (timeStr.charAt(0) < 48 || timeStr.charAt(0) > 57) {
            return -1;
        }
        timeStr = timeStr.toLowerCase().replace("am", "");
        if (timeStr.toLowerCase().contains("pm")) {
            timeStr = timeStr.toLowerCase().replace("pm", "");
            meridiem = true;
        }
        timeStr = timeStr.trim();
        if (timeStr.contains(":")) {
            try {
                String[] arr = timeStr.split(":");
                if (arr[0].length() > 2) return -1;
                if (arr[0].length() == 1) arr[0] = "0" + arr[0];
                if (arr[1].length() > 2 || arr[1].length() < 2) return -1;
                // final numbers
                time[0] = Integer.parseInt(arr[0]) + (meridiem ? 12 : 0);
                time[1] = Integer.parseInt(arr[1]);
            } catch (Exception e) {
                return -1;
            }
        }
        else {
            try {
                if (timeStr.length() > 4) {
                    return -1;
                }
                if (timeStr.length() == 3) {
                    timeStr = "0" + timeStr;
                }
                if (timeStr.length() < 3) {
                    return -1;
                }
                // final numbers
                time[0] = Integer.parseInt(timeStr.substring(0, 2));
                time[1] = Integer.parseInt(timeStr.substring(2, 4));
            }
            catch (Exception e) {
                return -1;
            }
        }
        if (time[0] > 24 || time[0] < 0) {
            return -1;
        }
        if (time[1] > 59 || time[1] < 0) {
            return -1;
        }
        // Special case for something like 24:01
        if (time[0] == 24 && time[1] > 0) {
            return -1;
        }
        return time[0] * 60 + time[1];
    }
}