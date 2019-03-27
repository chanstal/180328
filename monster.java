public abstract class monster {
    protected float hp,def;
    protected int x,y;
    protected static int count;
    public abstract float[]attack();
 public void showinfo(){
     System.out.println("(hp:"+hp+",defence:"+def+"),Location:("+x+","+y+")");
 }
 public static int getmonstercount(){
     return count;
 }
}
