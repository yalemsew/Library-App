package Library.System;

import java.util.ArrayList;
import java.util.List;

public class CheckoutRecord {

    List<CheckoutRecordEntry> checkoutRecordEntryList=new ArrayList<CheckoutRecordEntry>();

    public List<CheckoutRecordEntry> getCheckoutRecordEntryList() {
        return checkoutRecordEntryList;
    }
    public void addCheckoutEntry(CheckoutRecordEntry checkoutRecordEntry){
        checkoutRecordEntryList.add(checkoutRecordEntry);
    }
}
