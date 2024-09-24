

class mycircle{
  private int radius;
  private float area;
  private float circumference;
  public void setradius(int x){
    radius = x;
}
  public int getradius(){
    return radius;
  }
  public void setarea(float y){
    area = 3.14f * radius * radius;

  }
  public float getarea(){
    return area;
  }
  public void setcircum(float z){
    circumference = 2 * 3.14f * radius;

  }
  public float getcircum(){
    return circumference;
  }



}

public abstract class circle {

    public static void main(String[] args) {
        mycircle gol = new mycircle();
        gol.setradius(10);
        gol.setarea(10);
        gol.setcircum(10);
        System.out.println(gol.getradius());
        System.out.println(gol.getarea());
        System.out.println(gol.getcircum());
        
    }
    
}
