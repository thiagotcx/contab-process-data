package contab.dto;

public class OrderProductsDTO {

    private String description;
    private String barcode;
    private Long amount;
    private Double price;
    private Long subTotal;

    public OrderProductsDTO() {

    }

    public OrderProductsDTO(String description, String barcode, Long amount, Double price, Long subTotal) {
        this.description = description;
        this.barcode = barcode;
        this.amount = amount;
        this.price = price;
        this.subTotal = subTotal;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Long subTotal) {
        this.subTotal = subTotal;
    }
}
