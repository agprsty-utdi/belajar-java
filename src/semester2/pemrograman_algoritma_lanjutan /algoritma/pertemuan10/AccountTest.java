package algoritma.pertemuan10;

public class AccountTest {
    public static void main(String[] args) {
        SavingAccountC sa0001 = new SavingAccountC(); //instansiasi
        sa0001.balance = 1000;
        sa0001.name = "Demian";
        sa0001.interestRate = 0.02;
        sa0001.displayCustomer();
        
        SavingAccountC sa0002 = new SavingAccountC();
        sa0002.balance = 2000;
        sa0002.name = "Bill";
        sa0002.displayCustomer();
        
        SavingAccountC sa0003 = new SavingAccountC();
        sa0003.balance = 3000;
        sa0003.name = "Sam";
        sa0003.displayCustomer();  
    }
}
