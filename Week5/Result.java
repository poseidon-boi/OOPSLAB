import java.util.Scanner;

class Result {
    private final int students = 3, subjects = 3;
    int[][] marks = new int[students][subjects];
    int[] total = new int[students];
    void getMarks() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < students; i++) {
            System.out.print("Enter marks of student "+(i+1)+": ");
            for (int j = 0; j < subjects; j++)
                marks[i][j] = sc.nextInt();
        }
    }
    void calculateTotal() {
        for (int i = 0; i < students; i++)
            for (int j = 0; j < subjects; j++)
                total[i] += marks[i][j];
    }
    void highestSubjects() {
        for (int i = 0; i < subjects; i++) {
            int highest = marks[0][i], index=1;
            for (int j = 1; j < subjects; j++)
                if (marks[j][i] > highest) {
                    highest = marks[j][i];
                    index = j+1;
                }
            System.out.println("Student "+index+" scored "+highest+" marks in subject "+(i+1));
        }
    }
    void highestTotal() {
        int highest = total[0], index = 1;
        for (int i = 1; i < students; i++)
            if (total[i] > highest) {
                highest = total[i];
                index = i+1;
            }
        System.out.println("Student "+index+" scored "+highest+" total marks");
    }

    public static void main(String[] args) {
        Result r = new Result();
        r.getMarks();
        r.calculateTotal();
        r.highestSubjects();
        r.highestTotal();
    }
}
