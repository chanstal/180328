public class Hero {
    protected String description;
    protected float hp,magic;
    protected int moveSpeed ;
    public void showInfo(){
        System.out.println(this.description+"("+this.hp+")");
        System.out.println(this.description+"("+this.magic+")");
        System.out.println(this.description+"("+this.moveSpeed+")");
    }
    public void hurt(float data[]) {
        if (this.hp - data[0] > 0) {
            this.hp -= data[0];
        } else {
            this.hp = 0;
        }
        if (this.magic - data[1] > 0) {
            this.magic -= data[1];
        } else {
            this.magic = 0;
            if (this.moveSpeed - data[2] > 0) {
                this.moveSpeed -= data[2];
            } else {
                this.moveSpeed = 0;
            }

        }
    }}