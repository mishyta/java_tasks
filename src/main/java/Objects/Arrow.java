package Objects;

import lombok.Data;

import static java.lang.Math.*;

@Data
public class Arrow {



    //polar system of coordinates
    private Double polarRadius;

    //Top
    private Point topA = new Point(0D,0D);
    private Point topB;
    private Point topC;

    //Angle
    private Double angleA;
    private Double angleB;
    private Double angleC = 90D;

    //side
    private Double sideAB;
    private Double sideAC;
    private Double sideCB;


    public Arrow(Point topB){
        this.setTopB(topB);
        this.topC = new Point(topB.getX(),0D);
        this.setSides();
        this.setAngles();
        this.setPolarRadius();
    }

    private Double calcSide(Point point){
        return sqrt((pow(0 - point.getX(), 2)) + pow(0 - point.getY(), 2));
    }

    public void setSides(){
        this.sideAB = calcSide( topB);
        this.sideAC = abs(topB.getX());
        this.sideCB = abs(topB.getY());
    }

    private Double calcAngle(Double side1, Double side2){
        return toDegrees(acos(side1/side2));
    }

    private void setAngles(){
        this.angleB = calcAngle(sideCB, sideAB);
        this.angleA = 90 - this.angleB;
    }

    private void setPolarRadius(){
        if(topB.getX() > 0 && topB.getY() > 0){this.polarRadius = 90 - angleA;}
        else if(topB.getX() > 0 && topB.getY() < 0){this.polarRadius = 90 + angleA;}
        else if(topB.getX() < 0 && topB.getY() < 0){this.polarRadius = 270 - angleA;}
        else this.polarRadius = 270 + angleA;

    }

}
