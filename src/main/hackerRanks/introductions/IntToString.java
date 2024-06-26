package main.hackerRanks.introductions;

import java.util.Scanner;

public class IntToString {
    public static void main(String[] args) {

        try {
            Scanner in = new Scanner(System.in);
            int n = in .nextInt();
            in.close();
            String s = Integer.toString(n);
            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }
        } catch (Exception e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }
}



//The following class will prevent you from terminating the code using exit(0)!
//class DoNotTerminate {
//
//    public static void forbidExit() {
//        final SecurityManager securityManager = new SecurityManager() {
//            @Override
//            public void checkPermission(Permission permission) {
//                if (permission.getName().contains("exitVM")) {
//                    throw new ExitTrappedException();
//                }
//            }
//        };
//        System.setSecurityManager(securityManager);
//    }

//    public static class ExitTrappedException extends SecurityException {
//        private static final long serialVersionUID = 1;
//    }
//}
