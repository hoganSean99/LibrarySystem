package Book;

import Behaviour.GenreBehaviour;
import Behaviour.OnLoanBehaviour;

public abstract class Book {
    private OnLoanBehaviour bookBehaviour;
    private GenreBehaviour genreBehaviour;

    public void setBookBehaviour(OnLoanBehaviour bookBehaviour)
    {
        this.bookBehaviour = bookBehaviour;
    }

    public void setGenreBehaviour(GenreBehaviour genreBehaviour)
    {
        this.genreBehaviour = genreBehaviour;
    }

    public String onLoan()
    {
        return bookBehaviour.onLoan();
    }
    public String Genre() {return genreBehaviour.Genre();}
    public abstract String display();
 }
