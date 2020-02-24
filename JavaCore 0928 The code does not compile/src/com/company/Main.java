package com.company;

/*

0927 Ten cats
There is a cat class - Cat, with the "name" (String) field.
Create a Map <String, Cat> dictionary and add 10 cats there in the form “Name” - “Cat”.
Get from Map a set of all cats and display it on the screen.
Requirements:
1. The program should not read data from the keyboard.
2. The createMap method must declare and initialize a variable of type HashMap.
3. The createMap method should add 10 cats to the dictionary in the form “Name” - “Cat”.
4. The createMap method should return the created dictionary.
5. The convertMapToSet method should create and return many cats obtained from the transferred dictionary.
6. The program should display all the cats from the set on the screen.

 */

import java.io.*;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.attribute.AclFileAttributeView;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
        public static void main(String[] args) throws IOException {
           BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
           String sourceFileName = reader.readLine();
           String destinationFileName = reader.readLine();

           InputStream fileInputStream = getInputStream(sourceFileName);
           OutputStream fileOutputStream = getOutputStream(destinationFileName);

           int count = 0;
           while (fileInputStream.available() > 0)
           {
               int data = fileInputStream.read();
               fileOutputStream.write(data);
               count++;
           }
           System.out.println("Bytes copied: "+ count);
           fileInputStream.close();
           fileOutputStream.close();
        }

        public static InputStream getInputStream(String fileName) throws IOException {
            return new FileInputStream(fileName);
        }
        public static OutputStream getOutputStream(String fileName) throws IOException {
            return new FileOutputStream(fileName);
        }

    }







