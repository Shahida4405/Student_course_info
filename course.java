public class course {
    public static void main(String[] args) {
        String[][] sem = {{"DEVops", "20", "BDA", "18"}, {"Java", "15"}};

        for (int i = 0; i < sem.length; i++) {
            System.out.println("sem: " + (i + 1));
            for (int j = 0; j < sem[i].length; j += 2) {
                System.out.println("course: " + sem[i][j] + ", marks: " + sem[i][j + 1]);
            }
        }
        System.err.println();
    }
}
