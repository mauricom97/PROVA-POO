public class Shape {
    private String color = "red";
    private Boolean filled = true;

    public Shape(String color, Boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }

    public String getColor()
    {
        return this.color;
    }

    public boolean isFilled()
    {
        return this.filled;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public void setColor(boolean filled)
    {
        this.filled = filled;
    }

    public String toString()
    {
        return this.color + ", " + this.filled;
    }
}
