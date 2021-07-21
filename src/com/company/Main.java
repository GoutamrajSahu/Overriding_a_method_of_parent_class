package com.company;

public class Main {

    public static class TextInput {
        String res = "";
        void add(char c){
            res = res + c;
        }
        String getValue(){
            return res;
        }
    }

    public static class NumericInput extends TextInput {
        @Override
        void add(char c) {
            if(Character.isDigit(c)){
                super.add(c);
//                res = res + c;  //OR of "super.add(c);"
            }else{
                return;
            }

        }
    }

    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }
}


///-------------------------------Deep Understanding--------------------------------///


//package com.company;
//        import java.util.*;;
//
//class Animal{
//    Animal(){
//        System.out.println("Its an Animal:");
//    }
//    void Sounds(){
//        System.out.println("It will sound like: ");
//    }
//}
//
//class Dog extends Animal{
//    Dog(){
//        System.out.println("And its a DOG.");
//    }
//    void Sounds(){
//        System.out.println("It will sound like: Bhaooo...");
//    }
//    void Sound(){
//        System.out.println("Sound");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Animal dog = new Dog();
//        dog.Sounds();
//        dog.sound();///Error, Because the parent class variable "dog" will only contain the overridden methods of it, from the child class.
//        /// It will work when the variable "dog" will declared as Dog class datatype.
//    }
//}
