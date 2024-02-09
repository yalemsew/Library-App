package Library.System;

import java.util.Objects;

public class CD extends LendingItem {
    private Integer numCopiesLib;
    private String productID;
    private String title;
    private String company;

    public CD( String productID, String title, String company) {
        super();
        this.productID = productID;
        this.title = title;
        this.company = company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CD cd = (CD) o;
        return Objects.equals(numCopiesLib, cd.numCopiesLib)
                && Objects.equals(productID, cd.productID) &&
                Objects.equals(title, cd.title) && Objects.equals(company, cd.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numCopiesLib, productID, title, company);
    }
}
