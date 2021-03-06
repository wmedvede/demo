package org.expenses;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
@javax.persistence.Table(name = "EXPENSE_REPORT_LINE")
public class ExpenseReportLine implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @javax.persistence.GeneratedValue(generator = "EXPENSEREPORTLINE_ID_GENERATOR", strategy = javax.persistence.GenerationType.AUTO)
   @javax.persistence.Id
   @javax.persistence.SequenceGenerator(sequenceName = "EXPENSEREPORTLINE_ID_SEQ", name = "EXPENSEREPORTLINE_ID_GENERATOR")
   @javax.persistence.Column(unique = true, nullable = false)
   private java.lang.Long id;

   private java.lang.String description;

   private java.util.Date expenseDate;

   private java.lang.Double amount;

   public ExpenseReportLine()
   {
   }

   public java.lang.Long getId()
   {
      return this.id;
   }

   public void setId(java.lang.Long id)
   {
      this.id = id;
   }

   public java.lang.String getDescription()
   {
      return this.description;
   }

   public void setDescription(java.lang.String description)
   {
      this.description = description;
   }

   public java.util.Date getExpenseDate()
   {
      return this.expenseDate;
   }

   public void setExpenseDate(java.util.Date expenseDate)
   {
      this.expenseDate = expenseDate;
   }

   public java.lang.Double getAmount()
   {
      return this.amount;
   }

   public void setAmount(java.lang.Double amount)
   {
      this.amount = amount;
   }

   public ExpenseReportLine(java.lang.Long id, java.lang.String description,
         java.util.Date expenseDate, java.lang.Double amount)
   {
      this.id = id;
      this.description = description;
      this.expenseDate = expenseDate;
      this.amount = amount;
   }

}