module hr.algebra.lovropavlov.rummylovropavlov {
    requires javafx.controls;
    requires javafx.fxml;


    opens hr.algebra.lovropavlov.rummylovropavlov to javafx.fxml;
    exports hr.algebra.lovropavlov.rummylovropavlov;
    exports hr.algebra.lovropavlov.rummylovropavlov.Controller;
    opens hr.algebra.lovropavlov.rummylovropavlov.Controller to javafx.fxml;
}