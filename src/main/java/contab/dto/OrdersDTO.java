package contab.dto;

public class OrdersDTO {

    private String document;
    private String company;
    private Long total;

    public OrdersDTO() {

    }

    public OrdersDTO(String document, String company, Long total) {
        this.document = document;
        this.company = company;
        this.total = total;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }
}
