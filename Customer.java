public class Customers extends Users {
        int customerid;
        int cardnumber;
        //card number and id should ideally be kept in a databse)
        public Customers(int customerid, int cardnumber){
        this.customerid  = customerid;
        this.cardnumber = cardnumber;
        }
        
        //We wanna set creds for our customers//
        public String customercreds(){
        return super.setCreds();
        }
}
