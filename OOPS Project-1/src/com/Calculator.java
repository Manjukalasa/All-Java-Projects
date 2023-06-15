package com;
interface Calcultor 
{
  int add(int a,int b);
  int sub(int a,int b);
  int mul(int a,int b);
  int div(int a,int b);
  String invalidChoice();
}
// all the above method are automatically public & abstract ..