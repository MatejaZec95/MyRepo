package model;

public class Robot implements Movable{
    private String name;
    private String modelCode;

    public Robot(String name, String modelCode){
        this.name= name;
        this.modelCode= modelCode;
    }

    public String getName() {
        return name;
    }

    public String getModelCode() {
        return modelCode;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                ", modelCode='" + modelCode + '\'' +
                '}';
    }

    @Override
    public void move() {
        System.out.println("Robot is moving.");
    }
}
