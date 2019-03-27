public class Azir extends Hero {

    public Azir(){
        description = "蘇瑞瑪砂皇 阿祈爾 Azir\n" +
            "蘇瑞瑪沙漠";
    hp = 552f;
    magic = 438f;
    moveSpeed = 335;
}


    public float[] passiveAttack() {
        float data[] = {10f,5f,0f};
        return data;
    }

    public float[] qAttack() {
        float data[] = {15f,12f,0f};
        return data;


    }
}