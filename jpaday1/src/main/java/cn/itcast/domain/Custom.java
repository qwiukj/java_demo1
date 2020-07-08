package cn.itcast.domain;

import javax.persistence.*;

@Entity
@Table(name ="cst_customer")
public class Custom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cust_id")
    private Long custId;
    @Column(name="cust_name")
    private  String custName;
    @Column(name="cust_source")
    private  String custSource;
    @Column(name="cust_level")
    private  String custLevel;
    @Column(name="cust_industry")
    private  String custIndustry;
    @Column(name="cust_phone")
    private  String custPhone;
    @Column(name="cust_address")
    private String custAddress;

    public Long getCustId() {
        return custId;
    }

    public String getCustName() {
        return custName;
    }

    public String getCustSource() {
        return custSource;
    }

    public String getCustLevel() {
        return custLevel;
    }

    public String getCustIndustry() {
        return custIndustry;
    }

    public String getCustPhone() {
        return custPhone;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public void setCustSource(String custSource) {
        this.custSource = custSource;
    }

    public void setCustLevel(String custLevel) {
        this.custLevel = custLevel;
    }

    public void setCustIndustry(String custIndustry) {
        this.custIndustry = custIndustry;
    }

    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    @Override
    public String toString() {
        return "Custom{" +
                "custId=" + custId +
                ", custName='" + custName + '\'' +
                ", custSource='" + custSource + '\'' +
                ", custLevel='" + custLevel + '\'' +
                ", custIndustry='" + custIndustry + '\'' +
                ", custPhone='" + custPhone + '\'' +
                ", custAddress='" + custAddress + '\'' +
                '}';
    }
}
