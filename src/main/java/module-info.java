module com.caiocotts.labtestpractice {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.caiocotts.labtestpractice to javafx.fxml;
    exports com.caiocotts.labtestpractice;
}