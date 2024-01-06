package fall.swing;

import javafx.animation.KeyFrame;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.text.Font;


public class FallSwing extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       
        Pane pn =new Pane();
        Image im1=new Image("pics/rocks.png");
        ImageView imv=new ImageView(im1);
        imv.setY(400);
        imv.setX(50);
        imv.setFitHeight(600);
        imv.setPreserveRatio(true);      
       // pn.setStyle("-fx-background-color:burlywood;");
        
        
        Image im2=new Image("pics/butterfly.png");
        ImageView imv2=new ImageView(im2);
        imv2.setFitHeight(200);
        imv2.setPreserveRatio(true);
        imv2.setTranslateX(800);
        imv2.setTranslateY(200);
        
        Image imgrabbit=new Image("pics/download (1).png");
        ImageView imvrabbit=new ImageView(imgrabbit);
        imvrabbit.setX(50);
        imvrabbit.setY(350);
        imvrabbit.setFitHeight(400);
        imvrabbit.setPreserveRatio(true);
        
        Image imgph2=new Image("pics/The Old Design Shop.png");
        ImageView imvph2=new ImageView(imgph2);
        imvph2.setX(-50);
        imvph2.setY(-50);
        imvph2.setFitHeight(600);
        imvph2.setPreserveRatio(true);
        
      
        Image imgph3=new Image("pics/not too far2.png");
        ImageView imvph3=new ImageView(imgph3);
        imvph3.setX(300);
        imvph3.setY(445);
        imvph3.setFitHeight(300);
        imvph3.setPreserveRatio(true);
        
      
        Image imgph=new Image("pics/planet2.png");
        ImageView imvph=new ImageView(imgph);
        imvph.setX(1250);
        imvph.setY(200);
        imvph.setFitHeight(1000);
        imvph.setPreserveRatio(true);
        
        
        Line ln1=new Line(880,360,880,600);
        ln1.setStroke(Color.SADDLEBROWN);
       
        Image im3=new Image("pics/wood_3.png");
        ImageView imv3=new ImageView(im3);
        imv3.setX(1200);
        imv3.setY(100);
        imv3.setFitHeight(300);
        imv3.setPreserveRatio(true);
       
        Label lbl1=new Label("play");
         lbl1.setTranslateX(1320);
         lbl1.setTranslateY(220);
         lbl1.setFont(new Font(30));
         lbl1.setTextFill(Color.WHITE);
         
        Image im4=new Image("pics/wood_1.png");
        ImageView imv4=new ImageView(im4);
         imv4.setX(1200);
         imv4.setY(230);
         imv4.setFitHeight(300);
         imv4.setPreserveRatio(true);
        
        Label lbl2=new Label("pause");
         lbl2.setTranslateX(1320);
        lbl2.setTranslateY(350);
        lbl2.setFont(new Font(30));
        lbl2.setTextFill(Color.WHITE);
        
        Image im5=new Image("pics/wood.png");
        ImageView imv5=new ImageView(im5);
         imv5.setX(1200);
         imv5.setY(350);
         imv5.setFitHeight(300);
         imv5.setPreserveRatio(true);
        
        Image im6=new Image("pics/wood_2.png");
        ImageView imv6= new ImageView(im6);
         imv6.setX(1200);
         imv6.setY(470);
         imv6.setFitHeight(300);
         imv6.setPreserveRatio(true);
         
         
        Label lbl4=new Label("increase");
        lbl4.setTranslateX(1305);
        lbl4.setTranslateY(470);
        lbl4.setFont(new Font(25));
        lbl4.setTextFill(Color.WHITE);
        
        Label lbl5=new Label("decrease");
        lbl5.setTranslateX(1305);
        lbl5.setTranslateY(590);
        lbl5.setFont(new Font(25));
        lbl5.setTextFill(Color.WHITE);
      
        Pane pn2 = new Pane();
        Rectangle rc1=new Rectangle(825,600,100,35);
        rc1.setStroke(Color.SADDLEBROWN);
        rc1.setFill(Color.SADDLEBROWN);
        
        Image im7=new Image("pics/girl2.png");
        ImageView imv7=new ImageView(im7);
        imv7.setY(465);
        imv7.setX(750);
        imv7.setPreserveRatio(true);
        
        
        Arc ar1=new Arc(880,325,300,300,227,86);
        ar1.setStroke(Color.BLACK);
        ar1.setFill(Color.color(1,1,1,0));
         
        Pane pn3 = new Pane();
        pn3.setStyle("-fx-background-color: transparent;");
        pn3.getChildren().addAll(lbl1, lbl2, lbl4, lbl5);
        pn2.getChildren().add(pn3);

        
      pn2.getChildren().addAll(rc1,imv7);
pn.getChildren().addAll(ln1,imv,imv2,pn2,imvrabbit,imvph2,imvph3,imvph,imv3,imv4,imv5,imv6);
        
    ar1.setTranslateX(+50);
      ar1.setTranslateY(-120);

        PathTransition theMove = new PathTransition();
        theMove.setDuration(Duration.millis(1000));
        theMove.setNode(pn2);
        theMove.setPath(ar1);
        theMove.setCycleCount(Timeline.INDEFINITE); //the animation will repeat indefinitely.
        theMove.setAutoReverse(true);
        
        Timeline secondTime = new Timeline(
            new KeyFrame(
                Duration.millis(0),(event) -> {
                    ln1.setEndX(pn2.getTranslateX()+870);
                    ln1.setEndY(pn2.getTranslateY()+600);
                    
                }
                    
            ),
                new KeyFrame(Duration.millis(0.1))
                
        );
        secondTime.setCycleCount(Timeline.INDEFINITE);
        secondTime.play();
        theMove.play();
        
        lbl1.setOnMousePressed(e->{
        secondTime.play();
        theMove.play();
        });
        
        imv3.setOnMousePressed(e -> {
        secondTime.play();
        theMove.play();
        });
        lbl2.setOnMousePressed(e->{
        secondTime.pause();
        theMove.pause();
        });
        lbl4.setOnMousePressed(e->{
        secondTime.setRate(secondTime.getRate()+2);
        theMove.setRate(theMove.getRate()+2);
        secondTime.play();
        theMove.play();
        });
        lbl5.setOnMousePressed(e->{
            if(secondTime.getRate()>2){
            secondTime.setRate(secondTime.getRate()-2);
            theMove.setRate(theMove.getRate()-2);
            }
            else {secondTime.setRate(secondTime.getRate());
            theMove.setRate(theMove.getRate());
            }
        
        secondTime.play();
        theMove.play();
        });
      
        secondTime.play();
        theMove.play();
        StackPane s = new StackPane(pn,pn2,pn3);
        Scene scene = new Scene(s, 2000, 1000);
        primaryStage.setResizable(false);
        primaryStage.setTitle("butterfly");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    
    public static void main(String[] args) {
        launch(args);
        
    }
    
}
