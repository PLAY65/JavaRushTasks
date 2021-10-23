package com.javarush.task.task23.task2312;

/*
Змейка(1)
А теперь напишем игру "змейка".

Для этого нам понадобятся:
а) собственно сама змея (класс Snake)
б) комната, в которой она будет ползать (класс Room)
в) мыши, которых она будет есть (класс Mouse)

Создай классы Snake, Room, Mouse

Не забудь создать метод public static void main(String[] args) в классе Room.


Requirements:
1. Класс Snake должен быть создан в отдельном файле.
2. Класс Room должен быть создан в отдельном файле.
3. Класс Mouse должен быть создан в отдельном файле.
4. Класс Room должен содержать корректно объявленный метод main.
*/

public class Room {

    private int width;
    private int height;
    private Snake snake;
    private Mouse mouse;
    public static Room game;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Snake getSnake() {
        return snake;
    }

    public void setSnake(Snake snake) {
        this.snake = snake;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Room(int width, int height, Snake snake) {
        this.width = width;
        this.height = height;
        this.snake = snake;
    }

    void run(){};
    void print(){};

    void createMouse(){
        int x = (int) (Math.random() * width);
        int y = (int) (Math.random() * height);

        mouse = new Mouse(x, y);
    };

    void eatMouse(){
        createMouse();
    };

    public static void main(String[] args) {

        Snake snake = new Snake(10,10);
        game = new Room(20,20,snake);
        game.snake.setDirection(SnakeDirection.DOWN);

    }
}
