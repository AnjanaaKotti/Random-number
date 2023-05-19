package com.example.lib;

public class MyClass implements Runnable {

        String str;
        char[] st= str.toCharArray();
        for(int i=0;i<str.length();i++)
        {
          if(Character.isUpperCase(st[i]))
          {
              st[i]=Character.toLowerCase(st[i]);
          }
          else if (Character.isLowerCase(st[i]))
          {
              st[i]=Character.toUpperCase(st[i]);
          }
            System.out.print(str);

        }
        public class Thread1{
            public static void main(String[] args)
            {
                String str="Hello World";
                MyClass t=new MyClass(str);
                Thread T= new Thread(t);
                T.start();
            }


    }
}