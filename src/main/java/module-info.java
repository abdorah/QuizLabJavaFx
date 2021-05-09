/**
 * <p>
 * We used many modules in this application, and we want to export it as module.
 * This is the module information of this application.
 * </p>
 * 
 * @author KOTBI Abderrahmane
 * @version 1.0
 */

module com {
    requires transitive javafx.controls;
    requires javafx.fxml;
    opens com.controller to javafx.fxml;

    requires transitive java.sql;
    requires sqlite.jdbc;
    
    exports com.controller;
    exports com.service;
    exports com.model;
}