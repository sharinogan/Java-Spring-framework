class Start {
    public static void main(String[] data) {
        Cashier c = new Cashier();
        c.show();
    }
}

class Cashier {
    @Deprecated
    String location;
    int id;
    
    @Deprecated
    void show() {
        
    }
}