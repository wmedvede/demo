package org.expenses;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class ExpenseReportLine implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "EXPENSEREPORTLINE_ID_GENERATOR")
    @javax.persistence.Id
    @javax.persistence.SequenceGenerator(sequenceName = "EXPENSEREPORTLINE_ID_SEQ", name = "EXPENSEREPORTLINE_ID_GENERATOR")
    private java.lang.Long id;

    public ExpenseReportLine() {
    }
    
    public ExpenseReportLine(java.lang.Long id) {
        this.id = id;
    }

    public java.lang.Long getId() {
        return this.id;
    }
    
    public void setId(java.lang.Long id) {
        this.id = id;
    }

}