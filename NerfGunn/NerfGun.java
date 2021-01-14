//632115035 Wongsathorn Woratanarat
package NerfGunn;

public class NerfGun {
    private int bullet = 0;
    private static int gunID = 0;

    public NerfGun() {
        gunID++;
        this.bullet = 0;
    }

    public NerfGun(int numbullet) {
        gunID++;
        this.bullet = numbullet;
    }
//ชื่อปืน
    public void displayGunID() {
        System.out.println("The ID of this gun is " + gunID);
    }
//ยิง
    public void fire() {
        if (bullet != 0) {
            this.bullet--;//ลบกระสุนออก
            System.out.println("BANG !!!");
        } else {
            System.out.println("There is no ammunition");//ไม่มีกระสุน
        }
    }
//จ.น.กระสุนที่เหลือ
    public void displayNumOfAmmunition() {
        System.out.println(bullet + " bullet left");
    }
//เติมกระสุน
    public void reload(int numbullet1) {
        if (bullet + numbullet1 <= 15) {
            this.bullet = bullet + numbullet1;
        } else {
            System.out.println("Error!! the ammunition is overload");//กระสุนเกิน

        }
    }

}
