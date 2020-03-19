package classInterface;

public class publicClass
{
    interface Imain3                                        //Creating Interface inside the method.
    {
        public void edit1();
        void edit2();
    }

    class classInside implements Imain3
    {

        @Override
        public void edit1() {

        }

        @Override
        public void edit2() {

        }
    }
}
