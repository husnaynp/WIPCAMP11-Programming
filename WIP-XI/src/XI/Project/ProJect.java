/*
 * Copyright (C) 2019 wipcamp11.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package XI.Project;

import java.util.Scanner;

/**
 *
 * @author wipcamp11
 */
public class ProJect {

    public static void main(String[] args) {
        int item = 0;
        int limit = 10;

        System.out.println("โกดังสินค้า");
        System.out.println("1.add");
        System.out.println("2.remove");
        System.out.println("3.check");
        System.out.println("เลือกเมนู");

        Scanner input = new Scanner(System.in);

        int menu = input.nextInt();
        if (menu == 1) {
            int amount = input.nextInt();

            if (item + amount > limit) {
                System.out.println("ไอเท็มเต็มแล้ว");
            } else {
                System.out.println("เพิ่มไอเท็มแล้ว");
            }
        }
        if (menu == 2) {
            System.out.println("จำนวนที่ต้องการเอาออก");
            int amount = input.nextInt();
            if (item - amount < 0) {
                System.out.println("ไอเท็มมีไม่พอ");
            } else {
                System.out.println("ลบไอเท็มแล้ว");
            }

            if (menu == 3) {
                System.out.println("มีไอเท็ม" + item + "โกดังเก็บไอเท็ม" + limit);
            }
            if (menu != 1 && menu != 2 && menu != 3) {

                System.out.println("เมนูไม่ถูกต้อง");
            }

        }

    }
}
