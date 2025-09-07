public class TwoDArray {

    public static void main(String[] args) {
//    a.	Stores the grades in a two dimensional array. The array will only hold the numbers,
//          not the labels of the columns and rows ‘student 1’, ‘student 2’, … ‘Exam1’, ‘Exam2’,....
         int [][] gradeTable = {
                {80, 61, 75, 65, 80, 75},
                {75, 70, 60, 65, 81, 75},
                {81, 65, 78, 65, 81, 75},
                {78, 69, 75, 78, 80, 75}
         };

         int examNum = 1;
         int stdNum = 2;

        System.out.println("The average student grade from exam " + (examNum+1) + " is " + calculateExamAvg(examNum, gradeTable));
        System.out.println("The average grade of student " + (stdNum+1) + " is " + calculateStdAvg(stdNum, gradeTable));

    }

//    b.	Given an exam number, calculates the average for that exam counting all students
//          and outputs the average to the user.
    public static int calculateExamAvg(int examNum, int [][] examAvgTable){
        int sum = 0;
        for(int j = 0; j < examAvgTable[examNum].length; j++) {
            sum += examAvgTable[examNum][j];
        }
        return sum/examAvgTable[examNum].length;
    }

//    c.	Given a student number, calculates the average score for that student for all exams
//          and outputs the average to the user.
    public static int calculateStdAvg(int stdNum, int [][] stdAvgTable){
        int sum = 0;
        for(int i = 0; i < stdAvgTable.length; i++){
            sum += stdAvgTable[i][stdNum];
        }
        return sum/stdAvgTable.length;
    }
}
