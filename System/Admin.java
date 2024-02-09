package Library.System;

import java.util.*;

public class Admin {
    //Returns phone numbers (in sorted order) of the Library Members who have ever checked out the specified lending item
    public static List<String> getPhoneNums(LibraryMember[] members, LendingItem item) {
        List<String> phoneNums = new ArrayList<>();
        //implement
        for(LibraryMember member:members){
            List<CheckoutRecordEntry> items=member.getCheckoutRecord().checkoutRecordEntryList;
            for(CheckoutRecordEntry entryItem:items){
                if(item.equals(entryItem.getLendingItem())){
                    phoneNums.add(member.getPhoneNo());
                    break;
                }
            }
        }
        Collections.sort(phoneNums);

        return phoneNums;
    }
}