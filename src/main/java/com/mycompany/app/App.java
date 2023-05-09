/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package com.mycompany.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("What is your name?: ");
        String yourName = myScanner.nextLine();
        System.out.println();
        System.out.println("Hello " + yourName + "!");

        myScanner.close();
    }
}
