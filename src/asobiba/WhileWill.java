package asobiba;

import java.util.Scanner;

class WhileWill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("パスワードを入力してください");
        String str = in.nextLine();
        while (true) {
            if (str.equals("abc")) {
                break;
            }
            System.out.println("パスワードが違います。正しいパスワードを入力してください");
            str = in.nextLine();
        }
        System.out.println("OK!");
    }

    }

