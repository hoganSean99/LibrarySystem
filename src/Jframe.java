import Behaviour.DramaGenre;
import Behaviour.NotOnLoan;
import Behaviour.OnLoan;
import Behaviour.PlayGenre;
import Book.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Jframe {
    public static void main(String[] args) throws FileNotFoundException {
        JFrame f=new JFrame("Library System");
        JButton bOnLoan=new JButton("Books On Loan");
        JButton bNotOnLoan=new JButton("Books in the Library");
        JPanel p=new JPanel();
        JLabel l=new JLabel();
        l.setText("Library System");
        p.add(l);
        f.add(p);
        bOnLoan.setBounds(20,100,150,20);
        bNotOnLoan.setBounds(20,130,150,20);
        f.add(bOnLoan);
        f.add(bNotOnLoan);
        f.add(l);
        f.setSize(200,300);
        f.setLayout(null);
        f.setVisible(true);



        bOnLoan.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e)
            {
                List<Book> books = new ArrayList<>();
                Book book;

                book = new MacBeth();
                book.setBookBehaviour(new OnLoan());
                book.setGenreBehaviour(new PlayGenre());
                books.add(book);

                System.out.println("Books On Loan");
                System.out.println("--------------------------------------------------");

                for (Book OnLoanDisplay : books) {
                    System.out.println(OnLoanDisplay.display());
                    System.out.println(OnLoanDisplay.onLoan());
                    System.out.println(OnLoanDisplay.Genre());
                    System.out.println();
                }

                System.out.println("--------------------------------------------------");
            }
        });

        bNotOnLoan.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e)
            {
                List<Book> books = new ArrayList<>();
                Book book;
                book = new KingLear();
                book.setBookBehaviour(new NotOnLoan());
                book.setGenreBehaviour(new DramaGenre());
                books.add(book);

                book = new MerchantOfVenice();
                book.setBookBehaviour(new NotOnLoan());
                book.setGenreBehaviour(new PlayGenre());
                books.add(book);

                System.out.println("Books in the Library");
                System.out.println("--------------------------------------------------");

                for (Book WilliamShakespear : books) {
                    System.out.println(WilliamShakespear.display());
                    System.out.println(WilliamShakespear.onLoan());
                    System.out.println(WilliamShakespear.Genre());
                    System.out.println();
                }
                System.out.println("--------------------------------------------------");
            }
        });
    }
}