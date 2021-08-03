public class StringReverse {
    public static void main(String[] args) {
        /*String str1 = new String ("hello world"); /*(new char[] {'h', 'e', 'l', 'l', 'o'});
        char[] helloArray = str1.toCharArray();
        System.out.println(str1);
        for (int i = str1.length() - 1; i >= 0; --i){
            System.out.print(helloArray[i]);
        }
        */
        Stringer stroka = new Stringer ("Кирилл Кебиков");
        System.out.println(stroka.str);
        stroka.reverse();

    }
    public static class Stringer {
        String str;

        Stringer(String str) {
            this.str = str;
        }

        public void reverse() {
            char[] Array = str.toCharArray();
            for (int i = str.length() - 1; i >= 0; --i) {
                System.out.print(Array[i]);
            }
        }
    }
}

