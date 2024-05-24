import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

class tictactoe extends Application {




    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("TicTacToe");
        Button l1 = new Button();
        l1.setMaxSize(130,130);
        l1.setMinSize(130,130);
        l1.setStyle("-fx-background-color: #5404fb; -fx-text-fill: white;");


        Button l2 = new Button();
        l2.setMaxSize(130,130);
        l2.setMinSize(130,130);
        l2.setStyle("-fx-background-color: #5404fb; -fx-text-fill: white;");

        Button l3 = new Button();
        l3.setMaxSize(130,130);
        l3.setMinSize(130,130);
        l3.setStyle("-fx-background-color: #5404fb; -fx-text-fill: white;");

        Button l4 = new Button();
        l4.setMaxSize(130,130);
        l4.setMinSize(130,130);
        l4.setStyle("-fx-background-color: #5404fb; -fx-text-fill: white;");

        Button l5 = new Button();
        l5.setMaxSize(130,130);
        l5.setMinSize(130,130);
        l5.setStyle("-fx-background-color: #5404fb; -fx-text-fill: white;");

        Button l6 = new Button();
        l6.setMaxSize(130,130);
        l6.setMinSize(130,130);
        l6.setStyle("-fx-background-color: #5404fb; -fx-text-fill: white;");

        Button l7 = new Button();
        l7.setMaxSize(130,130);
        l7.setMinSize(130,130);
        l7.setStyle("-fx-background-color: #5404fb; -fx-text-fill: white;");

        Button l8 = new Button();
        l8.setMaxSize(130,130);
        l8.setMinSize(130,130);
        l8.setStyle("-fx-background-color: #5404fb; -fx-text-fill: white;");

        Button l9 = new Button();
        l9.setMaxSize(130,130);
        l9.setMinSize(130,130);
        l9.setStyle("-fx-background-color: #5404fb; -fx-text-fill: white;");

        GridPane g = new GridPane();
        g.setHgap(10);
        g.setVgap(10);
        g.setAlignment(Pos.CENTER);
        g.add(l1, 0, 0);
        g.add(l2, 1, 0);
        g.add(l3, 2, 0);

        g.add(l4, 0, 1);
        g.add(l5, 1, 1);
        g.add(l6, 2, 1);

        g.add(l7, 0, 2);
        g.add(l8, 1, 2);
        g.add(l9, 2, 2);

        Scene sc = new Scene(g, 500, 500);
        primaryStage.setScene(sc);
g.setStyle("-fx-background: #26368c;");

        primaryStage.show();


        Button play = new Button("Play Again");
        Button close = new Button("Close");
        close.setStyle("-fx-background-color: #5404fb; -fx-text-fill: white;");
        play.setStyle("-fx-background-color: #5404fb; -fx-text-fill: white;");
        Label label= new Label();
        HBox box = new HBox(10);
        box.getChildren().addAll(play,close);
        box.setAlignment(Pos.CENTER);
        VBox gbox = new VBox(10);
        gbox.getChildren().addAll(label,box);
        gbox.setAlignment(Pos.CENTER);
        Stage stage = new Stage();
        Scene scene =new Scene(gbox,200,200);
        stage.setScene(scene);
        gbox.setStyle("-fx-background: #26368c;");


        Button play2 = new Button("Play Again");
        Button close2 = new Button("Close");
        play2.setStyle("-fx-background-color: #5404fb; -fx-text-fill: white;");
        close2.setStyle("-fx-background-color: #5404fb; -fx-text-fill: white;");
        HBox h = new HBox(10);
        Label label2 = new Label("No One Won !");
        h.getChildren().addAll(play2,close2);
        h.setAlignment(Pos.CENTER);
        VBox v = new VBox(10);
        v.getChildren().addAll(label2,h);
        v.setAlignment(Pos.CENTER);
        Stage stage2 = new Stage();
        Scene scene2 =new Scene(v,200,200);
        stage2.setScene(scene2);
        v.setStyle("-fx-background: #26368c;");

        l1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(l1.getText()== "") {


                    l1.setText(pointer.setSymbol(pointer.n));
                    l1.setFont(Font.font(40));
                    pointer.arr[0][0] = l1.getText();
                    pointer.n++;
                    if (pointer.check(pointer.arr)) {
label.setText("Player "+ pointer.setSymbol(pointer.getN()+1)+" Won");
                        stage.show();

                    }
                    if (pointer.isfull()) {
                        stage2.show();
                    }
                }
            }
        });
        l2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(l2.getText()=="") {
                    l2.setText(pointer.setSymbol(pointer.n));
                    pointer.arr[0][1] = l2.getText();
                    l2.setFont(Font.font(40));
                    pointer.n++;
                    if (pointer.check(pointer.arr)) {
                        label.setText("Player "+ pointer.setSymbol(pointer.getN()+1)+" Won");
                        stage.show();

                    }
                    if (pointer.isfull()) {
                        stage2.show();
                    }
                }
            }
        });
        l3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(l3.getText()=="") {
                    l3.setText(pointer.setSymbol(pointer.n));
                    l3.setFont(Font.font(40));
                    pointer.arr[0][2] = l3.getText();
                    pointer.n++;
                    if (pointer.check(pointer.arr)) {
                        label.setText("Player "+ pointer.setSymbol(pointer.getN()+1)+" Won");
                        stage.show();

                    }
                    if (pointer.isfull()) {
                        stage2.show();
                    }
                }
            }
        });
        l4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(l4.getText()=="") {
                    l4.setText(pointer.setSymbol(pointer.n));
                    l4.setFont(Font.font(40));
                    pointer.arr[1][0] = l4.getText();
                    pointer.n++;
                    if (pointer.check(pointer.arr)) {
                        label.setText("Player "+ pointer.setSymbol(pointer.getN()+1)+" Won");
                        stage.show();

                    }
                    if (pointer.isfull()) {
                        stage2.show();
                    }
                }
            }
        });
        l5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(l5.getText() == "") {
                    l5.setText(pointer.setSymbol(pointer.n));
                    l5.setFont(Font.font(40));
                    pointer.arr[1][1] = l5.getText();
                    pointer.n++;
                    if (pointer.check(pointer.arr)) {
                        label.setText("Player "+ pointer.setSymbol(pointer.getN()+1)+" Won");
                        stage.show();

                    }
                    if (pointer.isfull()) {
                        stage2.show();
                    }
                }
            }
        });
        l6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(l6.getText() == "") {
                    l6.setText(pointer.setSymbol(pointer.n));
                    l6.setFont(Font.font(40));
                    pointer.arr[1][2] = l6.getText();
                    pointer.n++;
                    if (pointer.check(pointer.arr)) {
                        label.setText("Player "+ pointer.setSymbol(pointer.getN()+1)+" Won");
                        stage.show();

                    }
                    if (pointer.isfull()) {
                        stage2.show();
                    }
                }
            }
        });
        l7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (l7.getText() == "") {

                l7.setText(pointer.setSymbol(pointer.n));
                l7.setFont(Font.font(40));
                pointer.arr[2][0] = l7.getText();
                pointer.n++;
                if (pointer.check(pointer.arr)) {
                    label.setText("Player "+ pointer.setSymbol(pointer.getN()+1)+" Won");
                    stage.show();
                }
                if (pointer.isfull()) {
                    stage2.show();
                }
            }
            }
        });
        l8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(l8.getText() == "") {
                    l8.setText(pointer.setSymbol(pointer.n));
                    l8.setFont(Font.font(40));
                    pointer.arr[2][1] = l8.getText();
                    pointer.n++;
                    if (pointer.check(pointer.arr)) {
                        label.setText("Player "+ pointer.setSymbol(pointer.getN()+1)+" Won");
                        stage.show();
                    }
                    if (pointer.isfull()) {
                        stage2.show();
                    }
                }
            }
        });
        l9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(l9.getText()=="") {
                    l9.setText(pointer.setSymbol(pointer.n));
                    l9.setFont(Font.font(40));
                    pointer.arr[2][2] = l9.getText();
                    pointer.n++;
                    if (pointer.check(pointer.arr)) {
                        label.setText("Player "+ pointer.setSymbol(pointer.getN()+1)+" Won");
                        stage.show();
                    }
                    if (pointer.isfull()) {
                        stage2.show();
                    }
                }
            }
        });




        close.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stage.close();
                primaryStage.close();
                System.exit(0);
            }
        });

play.setOnAction(new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent event) {
        pointer.clear();
        pointer.n=0;
        stage.close();
        l1.setText("");
        l2.setText("");
        l3.setText("");
        l4.setText("");
        l5.setText("");
        l6.setText("");
        l7.setText("");
        l8.setText("");
        l9.setText("");




    }
});
        close2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stage2.close();
                primaryStage.close();
                System.exit(0);
            }
        });

        play2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                pointer.clear();
                pointer.n=0;
                stage2.close();
                l1.setText("");
                l2.setText("");
                l3.setText("");
                l4.setText("");
                l5.setText("");
                l6.setText("");
                l7.setText("");
                l8.setText("");
                l9.setText("");




            }
        });


    }
}
