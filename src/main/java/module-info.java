module com.hunghq.e2_json_hunghq_c2306l {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires eu.hansolo.tilesfx;

    requires java.sql;
    requires mysql.connector.java;

    opens com.hunghq.e2_json_hunghq_c2306l to javafx.fxml;
    exports com.hunghq.e2_json_hunghq_c2306l;

    opens com.hunghq.e2_json_hunghq_c2306l.Controller to javafx.fxml;
    exports com.hunghq.e2_json_hunghq_c2306l.Controller;

    opens com.hunghq.e2_json_hunghq_c2306l.Entity to javafx.fxml;
    exports com.hunghq.e2_json_hunghq_c2306l.Entity;

    opens com.hunghq.e2_json_hunghq_c2306l.Model to javafx.fxml;
    exports com.hunghq.e2_json_hunghq_c2306l.Model;
}