package Objects;

import lombok.Data;

import java.time.LocalTime;

@Data
public class Clock {

    private Arrow secArrow;
    private Arrow minArrow;
    private Arrow hourArrow;

    public Clock(Point hourArrowEnd, Point minArrowEnd,Point secArrowEnd){
        secArrow = new Arrow(secArrowEnd);
        minArrow = new Arrow(minArrowEnd);
        hourArrow = new Arrow(hourArrowEnd);
    }


//
    public LocalTime   executeTime(){
        return LocalTime.of(executeHour(), executeMinutes(), executeSeconds());
    }
    public Integer executeHour(){
        return (int)(hourArrow.getPolarRadius()/360*12);
    }
    public  Integer executeMinutes(){
        return (int)(minArrow.getPolarRadius()/360*60);
    }
    public Integer executeSeconds(){
        return (int)(secArrow.getPolarRadius()/360*60);
    }




}
