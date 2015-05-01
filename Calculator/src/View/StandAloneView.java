package View;

import Controller.ControllerStandAlone;
import Controller.IController;
import DataAccessObject.OperationDTO;
import DataAccessObject.OperatorsDTO;
import DataAccessObject.ResultDTO;
import Resources.FeaturesStandAlone;
import javax.swing.DefaultComboBoxModel;

public class StandAloneView extends javax.swing.JFrame implements IStandAloneView {
    private final IController _Controller = ControllerStandAlone.getInstance();
    public StandAloneView() {
        initComponents();
        uploadOperators();
        updateOperation();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_Calculator = new javax.swing.JPanel();
        lbl_Title = new javax.swing.JLabel();
        lbl_Equals = new javax.swing.JLabel();
        lbl_Result = new javax.swing.JLabel();
        btn_Calculate = new javax.swing.JButton();
        spinner_Num1 = new javax.swing.JSpinner();
        spinner_Num2 = new javax.swing.JSpinner();
        cBox_Operator = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_Calculator.setBackground(new java.awt.Color(204, 255, 204));

        lbl_Title.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Title.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        lbl_Title.setForeground(new java.awt.Color(0, 102, 102));
        lbl_Title.setText("Calculadora");

        lbl_Equals.setText("=");

        lbl_Result.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N

        btn_Calculate.setBackground(new java.awt.Color(0, 153, 153));
        btn_Calculate.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        btn_Calculate.setText("Calcular");
        btn_Calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CalculateActionPerformed(evt);
            }
        });

        spinner_Num1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        spinner_Num1.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));

        spinner_Num2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        spinner_Num2.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));

        cBox_Operator.setBackground(new java.awt.Color(0, 153, 153));
        cBox_Operator.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cBox_Operator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBox_OperatorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_CalculatorLayout = new javax.swing.GroupLayout(panel_Calculator);
        panel_Calculator.setLayout(panel_CalculatorLayout);
        panel_CalculatorLayout.setHorizontalGroup(
            panel_CalculatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_CalculatorLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(spinner_Num1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(spinner_Num2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_Equals)
                .addGap(18, 18, 18)
                .addComponent(lbl_Result, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 43, Short.MAX_VALUE))
            .addGroup(panel_CalculatorLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(panel_CalculatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Title)
                    .addGroup(panel_CalculatorLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btn_Calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_CalculatorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cBox_Operator, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );
        panel_CalculatorLayout.setVerticalGroup(
            panel_CalculatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_CalculatorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Title)
                .addGap(45, 45, 45)
                .addComponent(cBox_Operator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(panel_CalculatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_CalculatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(spinner_Num1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spinner_Num2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_Equals))
                    .addComponent(lbl_Result, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(btn_Calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Calculator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Calculator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CalculateActionPerformed
        // TODO add your handling code here:
        int quantNumbers = _Controller.getQuantOperators().getNumOperators();                
        ResultDTO resultDTO = doOperation(getNumbers(quantNumbers));
        showResult(resultDTO);
       
    }//GEN-LAST:event_btn_CalculateActionPerformed

    private void cBox_OperatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBox_OperatorActionPerformed
        // TODO add your handling code here:
        updateOperation();
    }//GEN-LAST:event_cBox_OperatorActionPerformed
    private void uploadOperators(){
        cBox_Operator.setModel(new DefaultComboBoxModel<>(_Controller.getFeatures().getFeatures()));        
    }
    private void cleanCalculator(){
        spinner_Num1.setValue(new Integer(1));
        spinner_Num2.setValue(new Integer(1));
        lbl_Result.setText("");
    }
    private void updateOperation(){
        cleanCalculator();
        String operator = cBox_Operator.getSelectedItem().toString();
        System.out.println(operator);
        setOperation(new OperationDTO(operator));
        int quantNumbers = _Controller.getQuantOperators().getNumOperators();
        showQuantFields(quantNumbers);
    }
    @Override
    public OperatorsDTO getNumbers(int pQuantNumbers){
        int num1 = Integer.valueOf(spinner_Num1.getValue().toString());
        int num2 = Integer.valueOf(spinner_Num2.getValue().toString());
        if (pQuantNumbers == 1){
            return new OperatorsDTO(num1);
        }else if(pQuantNumbers == 2){
            return new OperatorsDTO(num1,num2);
        }else{
            return null;
        }
    }
    private void showQuantFields(int pQuantFields){
        if (pQuantFields == 1){
            spinner_Num1.setVisible(true);
            spinner_Num2.setVisible(false);
            lbl_Equals.setVisible(true);
            lbl_Result.setVisible(true);
            btn_Calculate.setVisible(true);
        }else if (pQuantFields == 2){
            spinner_Num1.setVisible(true);
            spinner_Num2.setVisible(true);
            lbl_Equals.setVisible(true);
            lbl_Result.setVisible(true);
            btn_Calculate.setVisible(true);
        }else{
            spinner_Num1.setVisible(false);
            spinner_Num2.setVisible(false);
            lbl_Equals.setVisible(false);
            lbl_Result.setVisible(false);
            btn_Calculate.setVisible(false);
        }
        panel_Calculator.updateUI();
    }
    public void showResult(ResultDTO pResultDTO){
        lbl_Result.setText(pResultDTO.getResult());
    }
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StandAloneView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Calculate;
    private javax.swing.JComboBox cBox_Operator;
    private javax.swing.JLabel lbl_Equals;
    private javax.swing.JLabel lbl_Result;
    private javax.swing.JLabel lbl_Title;
    private javax.swing.JPanel panel_Calculator;
    private javax.swing.JSpinner spinner_Num1;
    private javax.swing.JSpinner spinner_Num2;
    // End of variables declaration//GEN-END:variables

    @Override
    public ResultDTO doOperation(OperatorsDTO pOperatorsDTO) {
        return _Controller.doOperation(pOperatorsDTO);
    }

    @Override
    public void setOperation(OperationDTO pOperation) {
        _Controller.setOperation(pOperation);
    }


}
