package com.hunghq.e2_json_hunghq_c2306l.Controller;

import com.hunghq.e2_json_hunghq_c2306l.Entity.Category;
import com.hunghq.e2_json_hunghq_c2306l.Model.CategoryStatement;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class CategoryController implements Initializable {
    @FXML private TableColumn<Category, Integer> cid;
    @FXML private TableColumn<Category, String> ccode;
    @FXML private TableColumn<Category, String> cname;
    @FXML private TableColumn<Category, String> cdescription;
    @FXML private TextField txtCode;
    @FXML private TextField txtName;
    @FXML private TextArea txtDescription;
    @FXML private Button btnNewCategory;
    @FXML private Button btnEditCategory;
    @FXML private TableView<Category> tableCategory = new TableView<Category>();
    private ObservableList<Category> categories;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
//      List categories
        categories = CategoryStatement.getAll();
        tableCategory.setEditable(true);
        tableCategory.getColumns().getFirst().setVisible(false);
        cid.setText("ID");
        cid.setCellValueFactory(new PropertyValueFactory<Category, Integer>("id"));
        ccode.setCellValueFactory(new PropertyValueFactory<Category, String>("code"));
        cname.setCellValueFactory(new PropertyValueFactory<Category, String>("name"));
        cdescription.setCellValueFactory(new PropertyValueFactory<Category, String>("description"));
        tableCategory.setItems(categories);
//      add new Category button
        btnNewCategory.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Category category = new Category();
                category.setCode(txtCode.getText());
                category.setName(txtName.getText());
                category.setDescription(txtDescription.getText());
                CategoryStatement.insert(category);
                tableCategory.getItems().clear();
                categories = CategoryStatement.getAll();
                tableCategory.setItems(categories);
                tableCategory.refresh();
            }
        });
    }
}
