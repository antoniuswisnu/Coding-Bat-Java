public class Dummy {
    public static void main(String[] args)
    {
        try
        {
            Belanja belanja = new Belanja();
             belanja.order("rabbit");
            // checkout without order results in exception below
            belanja.checkout();
        }
        catch (Exception e)
        {
            System.out.println("Belanja Kosong!");
        }
    }

    public static class Belanja extends Throwable
    {
        String[] cart;
        int counter;
        public Belanja()
        {
            this.cart = new String[20];
            counter = 0;
        }
        void order(String item)
        {
            if(counter <= 20) {this.cart[counter] = item; counter++;}
            else {System.out.println("Cannot add more items into cart");}
        }
        void checkout() throws Exception
        {
            if(cart[0] == null) {throw new Exception();}
            else {for(String item: cart) {if(item != null){System.out.println(item);}}}

        }

    }

}
