public class test {

    public static void main(String[] args) {
        int num=-5;

        System.out.print(num++ +", "); // -5   num=-4
        System.out.print(num=0); //
        System.out.print(", "+ --num);
        System.out.println();

        System.out.println("................");

        short s= 13 - 9 / 3 * 10;
        s += -10;
        System.out.println(s);


        System.out.println("-------");


        boolean one= ('a'!='b') && false;
        boolean two= one || true;

        System.out.println(two);

        System.out.println("---------------");

        long l=100;
        short ss=(short) l;
        System.out.println(ss+10);

        System.out.println("---------------");

        byte b=104;
        boolean check= b<100;

        if (check){
            b-=100;
        }else{
            b=50;
        }
        System.out.println("b = " + b);

        if (13 == 3+10){
            System.out.println("java");
        }

        double decimal=13.142;
        int whole=decimal<20?20:10;
        System.out.println("whole = " + whole);

        String str=true?"5":"10";

        String k="";
        int aaA=10;

        k+=aaA;
        System.out.println("k = " + k);

        int five=5;
        int twow=2;

        if (five-- > twow*2){
            System.out.println("sssiiiuu");
        }


    }

}
