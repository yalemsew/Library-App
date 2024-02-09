package Library.System;

public class LibraryMember {
    private String memberID;
    private String fName;
    private String lastName;
    private String phoneNo;
    private CheckoutRecord checkoutRecord;

    public LibraryMember(String memberID, String fName, String lastName, String phoneNo
                         ) {
        this.memberID = memberID;
        this.fName = fName;
        this.lastName = lastName;
        this.phoneNo = phoneNo;
    }

    public String getMemberID() {
        return memberID;
    }

    public String getfName() {
        return fName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setCheckoutRecord(CheckoutRecord checkoutRecord) {
        this.checkoutRecord = checkoutRecord;
    }

    public CheckoutRecord getCheckoutRecord() {
        return checkoutRecord;
    }
}
