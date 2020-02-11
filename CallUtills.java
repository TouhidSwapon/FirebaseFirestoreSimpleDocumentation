package com.mtl.qrapp.Utills;

public class CallUtills {


    public static String getPhoneNumberWithout88(String phoneNumber) {
        if (phoneNumber.startsWith("+88")) {
            StringBuilder sb = new StringBuilder(phoneNumber);
            sb.delete(0, 3);
            phoneNumber = sb.toString();

        }

        return phoneNumber;
    }


    public static String getDurationWithHour(String secString) {

        int seconds = Integer.parseInt(secString);
        int p1 = seconds % 60;
        int p2 = seconds / 60;
        int p3 = p2 % 60;
        p2 = p2 / 60;
        String result = p2 + ":" + p3 + ":" + p1;
        return result;
    }

    public static String getDurationWithoutHour(String secString) {

        int seconds = Integer.parseInt(secString);
        int p1 = seconds % 60;
        int p2 = seconds / 60;
        int p3 = p2 % 60;
        p2 = p2 / 60;
        String result = p3 + "m " + p1 + "s";
        return result;
    }

    public static String getCallType(String callType) {

        switch (callType) {
            case "1":
                callType = "Incoming";
                break;
            case "2":
                callType = "Outgoing";
                break;
            case "3":
                callType = "Missed";
                break;
            case "5":
                callType = "Rejected";
                break;

        }

        return callType;
    }




}
