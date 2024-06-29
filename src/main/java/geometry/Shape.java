package geometry;

public interface Shape {
    double calculatePerimeter();
    double calculateArea();
    String getFillColor();
    String getBorderColor();
    void setFillColor(String color);
    void setBorderColor(String color);
}
