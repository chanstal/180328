public class Ahri extends Hero {

    public Ahri(){
        description="九尾妖狐 阿璃 Ahri\n" +
                "愛歐尼亞";
        hp=526f;
        magic=418f;
        moveSpeed=330;

    }
    public float[]passiveAttack(){
        float data[]={10f,5f,0f};
        return data;
    }
    public float[]qAttack(){
        float data[]={12f,12f,2f};
        return data;
    }



}
