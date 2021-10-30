package com.javarush.task.task23.task2312;

import java.util.ArrayList;
import java.util.List;

public class Snake {

    private List<SnakeSection> sections;
    private boolean isAlive;
    private SnakeDirection direction;

    public Snake(int x, int y){
        sections = new ArrayList<>();
        sections.add(new SnakeSection(x,y));
        isAlive = true;

    }

    public List<SnakeSection> getSections() {
        return sections;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public SnakeDirection getDirection() {
        return direction;
    }

    public void setDirection(SnakeDirection direction) {
        this.direction = direction;
    }

    int getX(){
     return sections.get(0).getX();
    }

    int getY(){
        return sections.get(0).getY();
    }

    void move(){
        if(isAlive!=false){
            if(direction == SnakeDirection.UP){
                move(0,-1);
            }
            if(direction == SnakeDirection.RIGHT){
                move(1,0);
            }
            if(direction == SnakeDirection.DOWN){
                move(0,1);
            }
            if(direction == SnakeDirection.LEFT){
                move(-1,0);
            }
        }

    };

    void move(int dx, int dy){
        SnakeSection head = new SnakeSection(sections.get(0).getX() + dx, sections.get(0).getY() + dy);

        checkBorders(head);
        if (!isAlive) return;
        checkBody(head);
        if (!isAlive) return;

        Mouse mouse = Room.game.getMouse();
        if (head.getX() == mouse.getX() && head.getY() == mouse.getY()){
            sections.add(0, new SnakeSection(getX()+dx, getY()+dy));
            Room.game.eatMouse();
        }else{
            sections.add(0, new SnakeSection(getX()+dx, getY()+dy));
            sections.remove(sections.size()-1);
        }
    }

    public void checkBorders(SnakeSection head){
        if ((head.getX() < 0 || head.getX() >= Room.game.getWidth()) || head.getY() < 0 || head.getY() >= Room.game.getHeight()) {
            isAlive = false;
        }
    };

    public void checkBody(SnakeSection head){
        if (sections.contains(head)) {
            isAlive = false;
        }
    };
}
