/*
 * 06/23/2023
 *
 * Copyright © 2023 Lauren Andre R. David.
 * All rights reserved.
 *
 * This system for making an appointment to borrow books may help the librarians to have
 * easy access for them to monitor the students, and school admins and teachers’ status
 * for the limited time/day provided for students to hold and pre-owned the book.
 */


package main;

import pageutility.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args){

        /*
         * Max of three books per student.
         * Once the book is in the database, it will not duplicate again.
         * Example of Student Number at Rizal Technological University who are eligible to borrow books.
         * 2021-103211, 2021-100715, 2021-102142, 2021-322192, 2022-124567, 2022-322192
         * */

        StartPage startPage = new StartPage();
        if (startPage.getStartAt() == 100){ /* If progress bar reached 100% it will go to HomePage then dispose starting page. */
            try{
                Thread.sleep(600);
            }catch (Exception e){
                e.printStackTrace();
            }
        }

        startPage.dispose();
        HomePage homePage = new HomePage();

        homePage.startButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                homePage.dispose();

                GenrePage genrePage = new GenrePage();
                genrePage.allGenreAction(); // Click one genre to make a unique background, then others go back to their current background.

                JButton[] borrowSearchReturn = {genrePage.borrowButton(), genrePage.searchButton(), genrePage.returnButton()};
                for(JButton borrowSearchReturnButton : borrowSearchReturn){
                    borrowSearchReturnButton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {

                            if(genrePage.searchButton().hasFocus()){ /* If search button clicked, it will go to searching books. */
                                genrePage.setVisible(false);

                                SearchBooks searchBooks = new SearchBooks();

                                searchBooks.backButton().addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        searchBooks.dispose();
                                        genrePage.setVisible(true);
                                    }
                                });
                            }

                            else if(genrePage.returnButton().hasFocus()){ /* If return button clicked, it will go to returning page books. */
                                genrePage.setVisible(false);

                                ReturnBooks returnBooks = new ReturnBooks();

                                returnBooks.getBackButtonToGenrePage().addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        returnBooks.setVisible(false);
                                        genrePage.setVisible(true);
                                    }
                                });

                                returnBooks.getSubmitButton().addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        returnBooks.conditionIfHaveBorrowedBooks(returnBooks, genrePage);
                                    } /* If provided student number didn't match in database who borrowed books it will stay in same page else it will go to genre page. */

                            });
                            }

                            else if(genrePage.selectedGenre()){ // It will direct to the available books page of your chosen genre.
                                int index = 0;
                                genrePage.setVisible(false);

                                BorrowBooks borrowBooks = new BorrowBooks(index, genrePage.accountancyButton()[0] ,genrePage.accountancyButton()[1] ,genrePage.accountancyButton()[2]
                                        ,genrePage.accountancyButton()[3], genrePage.accountancyButton()[4], genrePage.accountancyButton()[5], genrePage.accountancyButton()[6]);

                                borrowBooks.backButton().addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        borrowBooks.setVisible(false);
                                        genrePage.setVisible(true);
                                    }
                                });

                                borrowBooks.nextButton().addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        if(borrowBooks.getNumberOfBooksSelected() == 1 || borrowBooks.getNumberOfBooksSelected() == 2 || borrowBooks.getNumberOfBooksSelected() == 3){ // If the user chooses only 1 to 3 books, it will proceed to the verification page.
                                            borrowBooks.setVisible(false);

                                            VerificationPage verificationPage = new VerificationPage();
                                            verificationPage.getBackButtonToSelectedGenre().addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {
                                                    verificationPage.setVisible(false);
                                                    borrowBooks.setBackToNoSelectedBooks();
                                                    borrowBooks.setVisible(true);
                                                }
                                            });

                                            verificationPage.getNextButtonToDetailsBorrower().addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {

                                                    String secondIndex;
                                                        if(borrowBooks.getNumberOfBooksSelected() == 2 || borrowBooks.getNumberOfBooksSelected() == 3 ){ // If the user chooses 2 or 3 books it will get only the second book she/he selected.
                                                            secondIndex = (String) borrowBooks.getSelectedBooks().get(1);
                                                        }else{ // If only one book then other spaces in table of studentsindex column secondBookSelected and thirdBookSelected will fill it empty.
                                                               // I condition here as empty because it cannot accept null when passing values to another method, same as in thirdIndex.
                                                            secondIndex = "empty";
                                                        }

                                                        String thirdIndex;
                                                        if(borrowBooks.getNumberOfBooksSelected() == 3){// If only three book it will get the third selected book.
                                                            thirdIndex = (String) borrowBooks.getSelectedBooks().get(2);
                                                        }else {
                                                            thirdIndex = "empty";
                                                        }

                                                        if(verificationPage.registeredOrNot(borrowBooks.getNumberOfBooksSelected(), verificationPage.studentNumberInputAndDetails()[0],"studentsindex", "StudentNumber", (String) borrowBooks.getSelectedBooks().get(0), "empty", "empty") /* Student number provided scan if matches on database at studentdetails registered, if false then it didn't registered. */
                                                                && verificationPage.registeredOrNot(borrowBooks.getNumberOfBooksSelected(), verificationPage.studentNumberInputAndDetails()[0],"studentsdetails", "StudentNumber", (String) borrowBooks.getSelectedBooks().get(0), "empty", "empty") /* Student number provided scanning if they already borrowed or not. */
                                                        && verificationPage.registeredOrNot(1, verificationPage.studentNumberInputAndDetails()[0],"studentsindex","", (String) borrowBooks.getSelectedBooks().get(0), "empty","empty") // Fetching first book selected.
                                                        && verificationPage.registeredOrNot(2, verificationPage.studentNumberInputAndDetails()[0],"studentsindex","", (String) borrowBooks.getSelectedBooks().get(0), secondIndex,"empty") // Fetching second book selected if the user two books selected.
                                                                && verificationPage.registeredOrNot(3, verificationPage.studentNumberInputAndDetails()[0],"studentsindex","", (String) borrowBooks.getSelectedBooks().get(0), secondIndex,thirdIndex)){ // Fetching third book selected if the user three books selected.
                                                            verificationPage.setVisible(false);

                                                            DetailsBorrowerPage detailsBorrowerPage = new DetailsBorrowerPage(verificationPage.studentNumberInputAndDetails()[0], verificationPage.studentNumberInputAndDetails()[1], verificationPage.studentNumberInputAndDetails()[2],
                                                                    verificationPage.studentNumberInputAndDetails()[3], verificationPage.studentNumberInputAndDetails()[4], borrowBooks.getNumberOfBooksSelected());

                                                            detailsBorrowerPage.getBackButtonToVerificationPage().addActionListener(new ActionListener() {
                                                                @Override
                                                                public void actionPerformed(ActionEvent e) {
                                                                    detailsBorrowerPage.setVisible(false);
                                                                    verificationPage.setVisible(true);
                                                                    verificationPage.getTextField().setText("");
                                                                }
                                                            });

                                                            detailsBorrowerPage.getNextButtonToThankYouPage().addActionListener(new ActionListener() {
                                                                @Override
                                                                public void actionPerformed(ActionEvent e) {

                                                                    if(borrowBooks.getNumberOfBooksSelected() == 1){ /* Fetching and inserting the one book selected to the database in table studentindex. */
                                                                        detailsBorrowerPage.getData(borrowBooks.getNumberOfBooksSelected(), verificationPage.studentNumberInputAndDetails()[0], (String) borrowBooks.getSelectedBooks().get(0), null, null);
                                                                    }else if(borrowBooks.getNumberOfBooksSelected() == 2){ /* Fetching and inserting the two books selected to the database in table studentindex. */
                                                                        detailsBorrowerPage.getData(borrowBooks.getNumberOfBooksSelected(), verificationPage.studentNumberInputAndDetails()[0], (String) borrowBooks.getSelectedBooks().get(0), (String) borrowBooks.getSelectedBooks().get(1), null);
                                                                    }else if(borrowBooks.getNumberOfBooksSelected() == 3){ /* Fetching and inserting the three books selected to the database in table studentindex. */
                                                                        detailsBorrowerPage.getData(borrowBooks.getNumberOfBooksSelected(), verificationPage.studentNumberInputAndDetails()[0], (String) borrowBooks.getSelectedBooks().get(0), (String) borrowBooks.getSelectedBooks().get(1), (String) borrowBooks.getSelectedBooks().get(2));
                                                                    }

                                                                    ThankYouPage thankYouPage = new ThankYouPage();
                                                                    detailsBorrowerPage.dispose();

                                                                    thankYouPage.getGoToHompage().addActionListener(new ActionListener() {
                                                                        @Override
                                                                        public void actionPerformed(ActionEvent e) {
                                                                            homePage.setVisible(true);
                                                                            thankYouPage.setVisible(false);
                                                                        }
                                                                    });

                                                                }
                                                            });

                                                        }

                                                }
                                            });
                                        }
                                        else {
                                            JOptionPane.showMessageDialog(null,"Please select a book."); // If the user didn't select a book, at least one book will proceed to another process.
                                        }
                                    }
                                });
                            }
                            else {
                                JOptionPane.showMessageDialog(null,"Please select a genre."); // If the user direct clicked the borrow books but not selecting genre.
                            }
                        }
                    });
                }
            }
        });

    }
}
