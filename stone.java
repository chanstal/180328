import java.util.Random;

public class stone extends monster{
    private String name;
    public stone(){
        super.count++;
        hp=2000;
        def=1800;
        Random rand=new Random(System.currentTimeMillis());
        x=rand.nextInt(1024);
        y=rand.nextInt(1024);
        name="stone"+Integer.toString(monster.getmonstercount());
    }
    @Override
    public float[]attack(){
        float data[]={3f,2f,0,0,0};
        return data;
    }
    public void showinfo(){
        System.out.println(name);
        super.showinfo();
    }
}
