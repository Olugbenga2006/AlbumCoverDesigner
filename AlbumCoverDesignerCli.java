import java.util.Scanner;
class AlbumCoverDesignerCli{
    private static char A='A';
    private static char B='B';
    private static char C='C';
    private static char D='D';
    private static char E='E';
    private static char F='F';
    private static char G='G';
    private static char H='H';
    private static char I='I';
    // a method which allows you to guess the lineup of musicians and generally plays the whole game.
    public static void playGame(AlbumCoverGame solution) {
        boolean a = false;
        while (a == false) {
            System.out.println("Previous attempts:");
            if (solution.getPreviousDraftCovers() == null) {
                System.out.println("No previous attempts");
            } else {
                System.out.println(solution.getPreviousDraftCovers());
            }
            Scanner kbd = new Scanner(System.in);
            char[] list = new char[6];
            System.out.println("Enter line up:");

            for (int i = 0; i <= 5; i++) {
                list[i] = kbd.next().charAt(0);
            }
            LineUp lineup = new LineUp(list);
            int valid=0;
            for (int i = 0; i <= 5; i++) {
                if (lineup.getMusician(i) != A && lineup.getMusician(i) != B && lineup.getMusician(i) != C && lineup.getMusician(i) != D && lineup.getMusician(i) != E && lineup.getMusician(i) != F && lineup.getMusician(i) != G && lineup.getMusician(i) != H && lineup.getMusician(i) != I) {
                    valid += 1;
                }
            }

            if (valid==0) {
                if (solution.testDraftCover(lineup)) {
                    System.out.println("Congratulations!");
                    a = true;
                }
            }else if (valid>0) {
                System.out.println("Invalid line up!");
            }
        }

    }







    // a main method that creates a game with a random solution
    public static void main( String[] args){
        AlbumCoverGame solution= new AlbumCoverGame();
        AlbumCoverDesignerCli game= new AlbumCoverDesignerCli();
        game.playGame(solution);

    }

}

