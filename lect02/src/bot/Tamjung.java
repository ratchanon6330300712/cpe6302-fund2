//colaboratory
//1.6330300712 รัชชานนท์
package bot;
import java.util.Scanner;
public class Tamjung {

  private Scanner scanner;
  private String botName;
  private int createdYear;

  Tamjung(String botName, int createdYear) {
    this.scanner = new Scanner(System.in);
    this.botName = botName;
    this.createdYear = createdYear;
  }

  void greeting() {
    System.out.println("สวัสดี! ฉันชื่อ "+this.botName);
    System.out.println("ฉันถูกสร้างขึ้นเมื่อปี "+this.createdYear);
    System.out.println("เธอชื่ออะไร?");
    System.out.print("> ");
    String name = this.scanner.nextLine();
    System.out.println("สวัสดี " + name);


  }

  void guessAge() {
    int age;
    System.out.println("ฉันจะเดาว่าเธออายุเท่าไหร่");
    System.out.println("ช่วยบอก เศษที่ได้จากการหารอายุของเธอด้วย 3 5 และ 7");
    System.out.print("> ");
    int rem3 = this.scanner.nextInt();
    System.out.print("> ");
    int rem5 = this.scanner.nextInt();
    System.out.print("> ");
    int rem7 = this.scanner.nextInt();
    age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
    System.out.println("เธออายุ "+age+" : เป็นช่วงอายุที่น่าสนุกมากของชีวิตเลย!");

  }

  void countNumber() {
    System.out.println("ตอนนี้ ฉันจะแสดงให้เธอเห็นว่าฉันนับเลข 1-100ได้นะ");
    System.out.println("เธอต้องการให้ฉันนับถึงเลขอะไร?");
    System.out.print("> ");
    int num = this.scanner.nextInt();
    int i = 1;
    do {
      System.out.println(i + "!");
      i++;
    }while (i <= num);

  }

  void quiz() {

    System.out.println("ฉันขอทดสอบความรู้เกี่ยวกับการเขียนโปรแกรมของเธอหน่อยนะ");
    System.out.println("ทำไมเราถึงต้องใช้ method?");
    System.out.println("ก. เพื่อรันคำสั่งซ้ำหลาย ๆ ครั้ง");
    System.out.println("ข. เพื่อแบ่งโปรแกรมออกเป็น subroutine เล็กๆ หลายๆ รูทีน");
    System.out.println("ค. เพื่อวัดเวลาการรันโปรแกรม");
    System.out.println("ง. เพื่ออินเตอร์รัพการทำงานของโปรแกรม");
    System.out.print("> ");
    Scanner Sc = new Scanner(System.in);
    char ans = scanner.next().charAt(0);
    switch(ans){
      case 'ก','ค','ง' :
        System.out.println("ผิด! ลองใหม่อีกครั้งนะ");
        break;
      case'ข' :
        System.out.println("ยินดีด้วย เธอตอบถูก!");
        break;
    }

  }
  public static void main(String[] args) {
    Tamjung bot = new Tamjung("tamjung", 2020);
    bot.greeting();
    bot.guessAge();
    bot.countNumber();
    bot.quiz();
  }
}
