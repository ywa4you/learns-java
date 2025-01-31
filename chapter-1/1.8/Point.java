class Point {
    public static Point origin = new Point();
    public double x, y;

    public static void main(String[] args) {
        Point lowerLeft = new Point();
        Point upperRight = new Point();
        Point middlePoint = new Point();

        lowerLeft.x = 0.0;
        upperRight.y = 0.0;

        upperRight.x = 1280.0;
        upperRight.y = 1024.0;

        middlePoint.x = 640.0;
        middlePoint.y = 512.0;

        upperRight.copy(middlePoint);
        System.out.println("x: " + upperRight.x + " y: " + upperRight.y); 
    }

    public void clear() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public void move(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point that) {
        double xdiff = that.x - this.x;
        double ydiff = that.y - this.y;
        return Math.sqrt(xdiff * xdiff + ydiff * ydiff);
    }

    public void copy(Point that) {
        this.x = that.x;
        this.y = that.y;
    }
}
