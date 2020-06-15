class Circle {

    double radius;

    public double getLength() {
        return Math.PI * (radius + radius);
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}