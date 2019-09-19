package Behaviour;

public class NotOnLoan implements OnLoanBehaviour{
    @Override
    public String onLoan() {
        return "This Book is in the Library";
    }
}
