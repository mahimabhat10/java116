
    public interface Showable extends printable{
        void print();
        default void show() {
            System.out.println("This is my default method");
        }
    }

