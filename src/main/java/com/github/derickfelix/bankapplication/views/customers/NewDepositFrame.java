/*
* The MIT License
*
* Copyright (c) 2019 Derick Felix
*
* Permission is hereby granted, free of charge, to any person obtaining a copy
* of this software and associated documentation files (the "Software"), to deal
* in the Software without restriction, including without limitation the rights
* to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
* copies of the Software, and to permit persons to whom the Software is
* furnished to do so, subject to the following conditions:
*
* The above copyright notice and this permission notice shall be included in all
* copies or substantial portions of the Software.
*
* THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
* IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
* FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
* AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
* LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
* OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
* SOFTWARE.
 */
package com.github.derickfelix.bankapplication.views.customers;

import com.github.derickfelix.bankapplication.models.Customer;
import com.github.derickfelix.bankapplication.repositories.CustomerRepository;
import com.github.derickfelix.bankapplication.repositories.OperationRepository;
import com.github.derickfelix.bankapplication.repositories.impl.RepositoryFactory;
import com.github.derickfelix.bankapplication.repositories.impl.OperationRepositoryImpl;
import com.github.derickfelix.bankapplication.securities.AuthSecurity;
import com.github.derickfelix.bankapplication.utilities.MessageUtility;
import com.github.derickfelix.bankapplication.utilities.ViewUtility;
import java.util.Optional;

public class NewDepositFrame extends javax.swing.JInternalFrame {

    private final CustomerMainForm customerMainForm;
    private final CustomerRepository customerRepository;
    private final OperationRepository operationRepository;
    private final String accountNumber;
    
    public NewDepositFrame(CustomerMainForm customerMainForm)
    {
        this.customerMainForm = customerMainForm;
        this.customerRepository = (CustomerRepository) new RepositoryFactory().getInstance("customer");
        this.operationRepository = OperationRepositoryImpl.getLogInstance();
        this.accountNumber = AuthSecurity.getCustomer().getAccountNumber();

        initComponents();
        customSettings();
    }
    
    private void customSettings()
    {
        defineCurrentBalance();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        btnDeposit = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        paneInputs = new javax.swing.JPanel();
        lblCurrentBalance = new javax.swing.JLabel();
        txtCurrentBalance = new javax.swing.JTextField();
        txtDepositAmount = new javax.swing.JTextField();
        lblDepositAmount = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        lblPassword = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Zwei Bank Application - Deposit Operation");

        btnDeposit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        btnDeposit.setText("Deposit");
        btnDeposit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnDepositActionPerformed(evt);
            }
        });

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCloseActionPerformed(evt);
            }
        });

        paneInputs.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));

        lblCurrentBalance.setText("Your Balance");

        txtCurrentBalance.setEnabled(false);

        lblDepositAmount.setText("Deposit Amount");

        lblPassword.setText("Password");

        javax.swing.GroupLayout paneInputsLayout = new javax.swing.GroupLayout(paneInputs);
        paneInputs.setLayout(paneInputsLayout);
        paneInputsLayout.setHorizontalGroup(
            paneInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneInputsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDepositAmount)
                    .addComponent(txtCurrentBalance)
                    .addComponent(lblDepositAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                    .addComponent(lblCurrentBalance, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                    .addComponent(txtPassword)
                    .addComponent(lblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        paneInputsLayout.setVerticalGroup(
            paneInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneInputsLayout.createSequentialGroup()
                .addGroup(paneInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneInputsLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(txtCurrentBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paneInputsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblCurrentBalance)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDepositAmount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDepositAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(lblPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnDeposit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClose))
                    .addComponent(paneInputs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paneInputs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClose)
                    .addComponent(btnDeposit))
                .addGap(12, 12, 12))
        );

        setBounds(300, 100, 469, 302);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDepositActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDepositActionPerformed
    {//GEN-HEADEREND:event_btnDepositActionPerformed
        deposit();
    }//GEN-LAST:event_btnDepositActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCloseActionPerformed
    {//GEN-HEADEREND:event_btnCloseActionPerformed
        dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void clearForm()
    {
        txtDepositAmount.setText("");
        txtPassword.setText("");
        defineCurrentBalance();
    }
    
    private void defineCurrentBalance()
    {
        setCursor(ViewUtility.WAIT_CURSOR);
        txtCurrentBalance.setText(operationRepository.currentBalance(accountNumber).orElse(0.0).toString());
        setCursor(ViewUtility.DEFAULT_CURSOR);
    }
    
    private void deposit()
    {
        try {
            double depositAmount = Double.parseDouble(txtDepositAmount.getText());
            String password = new String(txtPassword.getPassword());

            if (depositAmount <= 0 || password.isEmpty()) {
                MessageUtility.warning(customerMainForm, "There are invalid fields");
                return;
            }
            
            Optional<Customer> optional = customerRepository.findByAccountNumberAndPassword(accountNumber, password);
            
            if (!optional.isPresent()) {
                MessageUtility.warning(customerMainForm, "Could not peform operation invalid password!");
                return;
            }
            
            operationRepository.deposit(accountNumber, depositAmount);
            
            MessageUtility.info(customerMainForm, "Money deposited  successfully!");
            clearForm();
        } catch (NumberFormatException e) {
            MessageUtility.error(customerMainForm, "Invalid deposit vaule", e);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDeposit;
    private javax.swing.JLabel lblCurrentBalance;
    private javax.swing.JLabel lblDepositAmount;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JPanel paneInputs;
    private javax.swing.JTextField txtCurrentBalance;
    private javax.swing.JTextField txtDepositAmount;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
