//colaboratory 
//1.6330300712 รัชชานนท์

package cinema;

import java.util.Scanner;

public class Cinema {
  final static Scanner scanner = new Scanner(System.in)

  static void soldTickets() {
    // คำนวณรายได้จากการขายตั๋ว
      int numRow;
      int seatPerRow;
      System.out.println("จำนวนแถวที่นั่ง :");
      System.out.print("> ");
      numRow = scanner.nextInt();

      System.out.println("จำนวนที่นั่งแต่ละแถว :");
      System.out.print("> ");
      seatPerRow = scanner.nextInt();
      int numSeats = numRow * seatPerRow;
      int income;

      if(numSeats < 60){
        income = numSeats * 100;
      }else {
        int front = numRow / 2;
        int back = numRow - front;
        income = (front * seatPerRow * 100 )+ (back * seatPerRow * 80);
      }
      System.out.println("รายได้จากการจำหน่ายตั๋ว :");
      System.out.println(income+ "บาท");
  } 

  static void showSeats(int numRow, int numCol) {
    // แสดงข้อมูลที่นั่ง
    System.out.println("Cinema: ");
    System.out.print(" ");
    for(int i=1; i<=numCol; i++){
      System.out.print();

      char[][] seats = new char[numRow][numCol];

      for (int i=0; i< numRow; i++){
        for (int j=0; j<numCol; j++){
          seats[i][j] = 'S';
        }
      }
      for (int i = 0; i < numRow; i++){
        System.out.print((i + 1 +" "));
        for (int j = 0; j < numCol; j++){
          System.out.print(i+1+" ");
        }
        System.out.println();
      }
    }
  }
  public static void main(String[] args) {
    showSeats( 7, 8);
    soldTickets();  
    
  }
}
