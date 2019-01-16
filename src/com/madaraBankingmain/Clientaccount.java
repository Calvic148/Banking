package com.madaraBankingmain;

public class Clientaccount {

    private double cbalance = 0;
    private String caccount;
    private String cname;
    private String[] caddress;
    private double withdraw;
    private double deposit;


    public double Withdraw(double withdraw){
        this.withdraw = withdraw;
        withdraw -= this.cbalance;
        System.out.println("your new balance is $ "+ this.cbalance);
        return cbalance;
    }

    public double Deposit(double deposit){
        this.deposit = deposit;
        deposit += this.cbalance;

        return cbalance;
    }
    public double getCbalance() {
        return cbalance;
    }

    //public void setCbalance(double cbalance) {
      //  this.cbalance = cbalance;
    //}

    public String getCaccount() {
        return caccount;
    }

    public void setCaccount(String caccount) {
        this.caccount = caccount;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String[] getCaddress() {
        return caddress;
    }

    public void setCaddress(String[] caddress) {
        this.caddress = caddress;
    }

    public double getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }
}
