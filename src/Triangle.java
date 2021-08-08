import static java.lang.Math.*;

public class Triangle extends Figures{
    int length1 = 0;
    int length2 = 0;
    int angle1 = 0;
    /*Figures triangle = new Triangle;*/
    public Triangle(int length1, int length2, int angle1){
         this.length1 = length1;
         this.length2 = length2;
        this.angle1 = angle1;
    }

    @Override
    public void square() {
        double square = 0.5 * length1 * length2 * sin(angle1);
        System.out.println("Площадь треугольника равна " + square);
    }

    @Override
    public void heigh() {
        double height = (length1 * length2 * 0.5)/2;
        System.out.println("Высота треугольника равна " + height);
    }

    @Override
    public void perimetre() {
        double perimetre = length1 + length2 + sqrt(length1 * length1 + length2 * length2 - 2 * length1 * length2 * cos(angle1));
        System.out.println("Периметр треугольника равен " + perimetre);
    }

    @Override
    public void inform() {
        System.out.println("Длины сторон треугольника равны " + length1 + " и " + length2);
        System.out.println("Угол между сторонами треугольника равен: " + angle1);
    }
    public void message(){
        System.out.println("Должен же быть метод, который принадлежит только треугольнику)");
    }
}
