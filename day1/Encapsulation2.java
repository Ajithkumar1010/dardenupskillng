package day1;

class Account {

    private long acc_no;
    private String name,email;
    private float amount;

    public long getAcc_no() {
        return acc_no;
    }
    public void setAcc_no(long acc_no) {
        this.acc_no = acc_no;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public float getAmount() {
        return amount;
    }
    public void setAmount(float amount) {
        this.amount = amount;
    }

} public class Encapsulation2  {
    public static void main(String[] args) {

        Account myAcc=new Account();

        myAcc.setAcc_no(775492842L);
        myAcc.setName("abc");
        myAcc.setEmail("abc.com");
        myAcc.setAmount(25000f);

        System.out.println("Account No:" + myAcc.getAcc_no()+"\n" +"Account Name:"
                + myAcc.getName()+" \n"+"Account holder email:" + myAcc.getEmail()+"\n"
                + "Amount in Account:" + myAcc.getAmount());
    }
}
