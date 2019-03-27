public class Ashe extends Hero {

    public  Ashe (){
        description="冰霜射手 艾希 Ashe\n"+
                "弗雷爾卓德" ;
        hp=539f;
        magic=280f;
        moveSpeed=325;

    }
    public float[]passiveAttack(){
        float data[]={10f,5f,0f};
        return data;
    }
    public float[]qAttack() {
        float data[] = {12f, 12f, 2f};
        return data;

        }}
