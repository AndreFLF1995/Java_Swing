package PFT;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author andre
 */
public class TransactionManager 
{
    ArrayList<Transaction> transactionList = new ArrayList();
    
    public void addTransaction(Transaction transactions)
    {
        transactionList.add(transactions);
    }
    
    public void removeTransaction(int id)
    {
        for(Transaction T : transactionList)
        {
           if (T.getId() == id)
            {
                transactionList.remove(T);
                JOptionPane.showMessageDialog(null, "Record Eliminated!", "Remove Transaction", JOptionPane.INFORMATION_MESSAGE);
                
                for (int j = 0; j < transactionList.size(); j++) 
                {
                    transactionList.get(j).setId(j + 1);
                }
                return;
            }
        }
    }
    
    public void showTransactions()
    {
        if (transactionList.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "There are no records.", "Show Transactions", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            StringBuilder transactionString = new StringBuilder("Transactions List\n");
        
            for (Transaction T : transactionList)
            {
                transactionString.append("Record: ").append(T.transactionRecords()).append("\n");
            }
        }
    }
    
    public double calculateTotalExpenses()
    {
        double total = 0;
        for(Transaction T : transactionList)
        {
           total += T.getAmount();
        }
        return (total);
    }
    
    public String transactionFile() //ficheiro csv.
    {
        String list = "";
        
        for (Transaction T : transactionList)
        {
            list += T.getId() + ";" + 
                    T.getDate() + ";" + 
                    T.getAmount() + ";" + 
                    T.getCategory() + ";" +
                    T.getDescription() + "\n";
        }
        return (list);
    }
}
