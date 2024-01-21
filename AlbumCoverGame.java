import java.util.Random;

class AlbumCoverGame {

    private char A='A';
    private char B='B';
    private char C='C';
    private char D='D';
    private char E='E';
    private char F='F';
    private char G='G';
    private char H='H';
    private char I='I';
    // a public constructor which creates a random Lineup.
    public AlbumCoverGame(){
        char [] chars= new char[]{A,B,C,D,E,F,G,H,I};
        char [] list= new char[6];
        char a;
        Random rand=new Random();
        for(int i=0;i<=5;i++){
            int randint= rand.nextInt(8);
            a=chars[randint];
            list[i]=a;

        }
        LineUp line= new LineUp(list);
        this.solution=line;

    }
    public ListNode head;
    private LineUp solution;
    // public constructor for solution lineup
    public AlbumCoverGame(LineUp solution){
        this.solution=solution;
    }
    // boolean method which returns true if solution is the same as given lineup and false if not, it also creates a draftcover and linked listnode with the lineup to keep track of attempts.
    public boolean testDraftCover(LineUp lineup){
        boolean a =false;
        DraftCover draft= new DraftCover(lineup,solution);
        ListNode first = new ListNode(draft,head);
        head= first;
        if (draft.isCorrect()){a=true;}
        return a;
    }
    // a method which returns all previously given draftcovers
    public String getPreviousDraftCovers() {
        if (head==null) {
            return null;
        } else {
            return head.toString();

        }
    }
    // a getter method which returns solution
    public LineUp getSolution(){return solution;}

}
//a Linked List Node class
class ListNode {
    private DraftCover payload;
    private ListNode next;
    // a public constructor for the draftcover and next listnode
    public ListNode(DraftCover payload, ListNode next) {
        this.payload = payload;
        this.next = next;
    }
    // a getter method that returns the payload(Draft cover)
    public DraftCover getpayload() { return payload; }
    // a getter method that returns the next list node
    public ListNode getNext() { return next; }
    // a tostring method which prints out all previously given draft covers
    @Override
    public String toString(){
        String print="";
        for (ListNode i= this;
             i!=null;
             i=i.getNext()){

            print+=   i.getpayload().toString()+"\n";
        }
        return print;
    }

}

