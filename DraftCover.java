class DraftCover {
    private LineUp suggestion,solution;
    // PUBLIC CONSTRUCTOR FOR THE SUGGESTION AND SOLUTION LINEUPS.
    public DraftCover(LineUp suggestion, LineUp solution){
        this.suggestion=suggestion;
        this.solution=solution;
    }
    //GETTER METHOD TO GET THE SUGGESTION LINEUP
    public LineUp getLineUp(){ return suggestion;}
    // GETTER METHOD TO GET THE NUMBER OF CORRECTLY PLACED CHARACTERS.
    public int getNumGood(){
        int num_good=0;
        for (int i=0; i<=5;i++){
            for (int j=0; j<=5;j++){
                if(i==j){
                    if (suggestion.getMusician(i)==solution.getMusician(j)){

                        num_good+=1;
                    }
                }
            }
        }
        return num_good;}
    //GETTER METHOD TO GET THE NUMBER OF CHARACTERS TOO FAR TO THE LEFT
    public int getNumTooLeft(){
        int too_left=0;
        for (int i=0; i<=5;i++){
            for (int j=0; j<=5;j++){
                if (solution.getMusician(i)== suggestion.getMusician(j)){
                    if(i>j){
                        too_left+=1;

                    }
                }
            }
        }
        return too_left;}
    //GETTER METHOD TO GET THE NUMBER OF CHARACTERS TOO FAR TO THE RIGHT
    public int getNumTooRight(){
        int too_right=0;
        for (int i=0; i<=5;i++){
            for (int j=0; j<=5;j++){
                if (solution.getMusician(i)==suggestion.getMusician(j)){
                    if(i<j){
                        too_right+=1;

                    }
                }
            }
        }
        return too_right;}
    // a method that returns true or false when checking whether a draftcover is the correct guess.
    public boolean isCorrect(){
        boolean a=false;
        if(getNumGood()==6){
            a= true;
        }return a;
    }
    // tostring method to print draft covers along with their description.
    @Override
    public String toString(){
        return suggestion.toString() + " (Too left "+getNumTooLeft()+", Good "+getNumGood()+", Too right "+getNumTooRight()+")";
    }



}

