package pl.pjwstk.jaz19545nbp;

import java.sql.Date;
import java.util.List;

public class Rate {
    private String no;
    private Date effectiveDate;
    private double mid;

    public Rate(){};

    public Rate(String no, Date effectiveDate, double mid, String table, String currency, String code, List<Rate> rates) {
        this.no = no;
        this.effectiveDate = effectiveDate;
        this.mid = mid;
        this.table = table;
        this.currency = currency;
        this.code = code;
        this.rates = rates;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public double getMid() {
        return mid;
    }

    public void setMid(double mid) {
        this.mid = mid;
    }

        private String table;
        private String currency;
        private String code;
        private List<Rate> rates;

        public String getTable() {
            return table;
        }

        public void setTable(String table) {
            this.table = table;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public List<Rate> getRates() {
            return rates;
        }

        public void setRates(List<Rate> rates) {
            this.rates = rates;
        }
    }

