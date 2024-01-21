class LineUp {
    private char[] lineup= new char[6];
    private char A='A';
    private char B='B';
    private char C='C';
    private char D='D';
    private char E='E';
    private char F='F';
    private char G='G';
    private char H='H';
    private char I='I';
    // A constructor to initialise the Lineup class with a character list.
    public LineUp(char [] lineup){
        this.lineup=lineup;
    }
    // a methode that returns a musician
    public char getMusician(int i){
        return lineup[i];
    }
    // to string method which changes the form of lists when printed
    @Override
    public String toString(){
        return lineup[0] + " " + lineup[1] + " " + lineup[2] + " " + lineup[3] + " " + lineup[4] + " " + lineup[5];
    }



}

