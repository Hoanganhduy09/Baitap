package com.tn;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap chuoi tu ban phim: ");
        String chuoi = scanner.nextLine();

        String VietHoa = chuoi.toUpperCase();
        System.out.println("Chuoi da viet hoa: " + VietHoa);
        String mess;
        mess = scanner.nextLine();
        char[] Array = mess.toCharArray();
        boolean foundSpace = true;
        for(int i = 0; i < Array.length; i++)
        {
            if(Character.isLetter(Array[i]))
            {
                if(foundSpace) {
                    Array[i] = Character.toUpperCase(Array[i]);
                    foundSpace = false;
                }
            }else
            {
                foundSpace = true;
            }

        }mess = String.valueOf(Array);
        System.out.println("Chuoi viet hoa: " + mess);
        char[] Array2 = mess.toCharArray();
        for (int i = 0; i < Array2.length; i++){
            if (Array2[i] == 'n' || Array2[i] == 'g') {
                Array2[i] = 'a';
            }
        }
        String mes = String.valueOf(Array2);
        System.out.println("Chuoi thay the ky tu n, g thanh ky tu a: " + mes);
        }
}

