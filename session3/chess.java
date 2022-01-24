import java.util.Scanner;
public class chess {
    public static void main(String[] args){
        char board[][]=new char[8][8];
        Scanner scan=new Scanner(System.in);

        char whiteSquare = '\u25A0';
        char blackSquare = '\u25A1';

        char queen = '\u2655';
        int queen_count=1;

        //Board created

        for(int i=0;i<8;i++) {

            for(int j=0;j<8;j++) {

                if(i%2==0) {
                    char square = (j+1)%2==0 ? blackSquare : whiteSquare;
                    board[i][j]=square;
                }else {
                    char square = j%2==0 ? blackSquare : whiteSquare;
                    board[i][j]=square;
                }
            }

        }

        //Rules for placing the queen

        System.out.println("Rules for placing the queen");
        System.out.println("\t1. You can't Enter more than 8 \"ROWS\"");
        System.out.println("\t2. You can't Enter more than 8 \"COLUMNS\"");
        System.out.println("\t2. You can't place more than 4 \"QUEENS\"");
        System.out.println("\t3. You can't place \"TWO QUEENS\" in same position");
        System.out.println("\t4. The board STARTING POSITION IS (1, 1) and ENDING POSITION IS (8, 8)\n");

        lable:
                do
                {
                    System.out.print("Enter the \"Row\" Number :");
                    int position_x = scan.nextInt();
                    System.out.print("Enter the \"Column\" Number :");
                    int position_y = scan.nextInt();

                    System.out.println("\nYou entered :" + position_x + ", " + position_y);

                    if (position_x > 8 || position_y > 8) {
                        System.out.println("\nYou Entered wrong \"ROW\" or \"COLUMN\"\n\t\tPLEASE Enter again\n");
                        continue lable;
                    }else {
                        if (board[position_x - 1][position_y - 1] == queen) {
                            System.out.println("\nIn that position the queen already there\nPlease Enter other position\n");
                        } else {
                            board[position_x - 1][position_y - 1] = queen;


                            for (char a[] : board) {
                                for (char b : a) {
                                    System.out.print(b + " ");
                                }
                                System.out.println();
                            }
                            System.out.println();
                            queen_count++;
                        }
                    }
            } while (queen_count < 5);

    }
}
