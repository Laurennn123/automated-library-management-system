package pageutility;

import javax.swing.*;

public class BooksDetailsUtility {

    //Accountancy Books
    BorrowBooksUtility managerial = new BorrowBooksUtility("Principles of Managerial Accounting", "Christine Jonick, Dahlonega, GA", "978-194-0771-45-8", "University of North Georgia Press", "First Edition",
            new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\accountancyImage\\managerial.png"),
            new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\accountancyImage\\managerialButton.png"),
            new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\accountancyImage\\managerialClicked.png"));
    BorrowBooksUtility financial = new BorrowBooksUtility("Introduction to Financial Accounting: U.S. GAAP Adaptation", "David Annand, Donna Marchand, Henry Dauderis", "978-821-8463-09-3", "Lyryx", "First Edition"
            , new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\accountancyImage\\financial.png"),
            new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\accountancyImage\\financialButton.png"),
            new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\accountancyImage\\financialClicked.png"));
    BorrowBooksUtility principle = new BorrowBooksUtility("Principles of Financial Accounting", "Christine Jonick", "978-636-8563-09-7","University of North Georgia Press","First Edition",
            new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\accountancyImage\\principle.png"),
            new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\accountancyImage\\principleButton.png")
            , new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\accountancyImage\\principleClicked.png"));
    BorrowBooksUtility manage = new BorrowBooksUtility("Managerial Accounting", "Kurt Heisinger, Joe Hoyle", "978-145-3345-29-0","Saylor Foundation","First Edition",
            new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\accountancyImage\\manage.png"),
            new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\accountancyImage\\manageButton.png")
            , new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\accountancyImage\\manageClicked.png"));
    BorrowBooksUtility perspective = new BorrowBooksUtility("Accounting Principles: A Business Perspective", "Hermanson, Edwards, Maher", "978-131-8046-09-1","BCcampus","First Edition",
            new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\accountancyImage\\perspective.png"),
            new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\accountancyImage\\perspectiveButton.png")
            , new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\accountancyImage\\perspectiveClicked.png"));
    BorrowBooksUtility inter = new BorrowBooksUtility("Intermediate Financial Accounting Volume 2", "Glenn Arnold, Suzanne Kyle", "978-689-8903-09-8","Lyryx","Volume 2",
            new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\accountancyImage\\inter.png"),
            new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\accountancyImage\\interButton.png")
            , new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\accountancyImage\\interClicked.png"));
    BorrowBooksUtility strategy = new BorrowBooksUtility("Financial Strategy for Public Managers", "Sharon Kioko, Justin Marlowe", "978-861-6943-09-5","Rebus Community","First Edition",
            new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\accountancyImage\\strategy.png"),
            new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\accountancyImage\\strategyButton.png")
            , new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\accountancyImage\\strategyClicked.png"));
    BorrowBooksUtility account = new BorrowBooksUtility("Principles of Accounting Volume 2 Managerial Accounting", "Graybeal, Franklin, Cooper", "978-194-7172-59-3","OpenStax","Volume 2",
            new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\accountancyImage\\account.png"),
            new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\accountancyImage\\accountButton.png")
            , new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\accountancyImage\\accountClicked.png"));

    //Arts and Science Books
    BorrowBooksUtility electron = new BorrowBooksUtility("Electromagnetism and the Metonymic Imagination", "Zaplan \nSadicon Alcalde Villanueva", "978-621-8033-09-2","Penn State University Press","First Edition"
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\artsAndScienceImage\\electro.png")
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\artsAndScienceImage\\electroButton.png")
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\artsAndScienceImage\\electroClicked.png"));
    BorrowBooksUtility artDoingScience = new BorrowBooksUtility("The Art of Doing Science and Engineering: Learning to Learn", "Richard W. Hamming", "978-173-2265-17-2","Stripe Press","First Edition"
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\artsAndScienceImage\\artsScience.png")
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\artsAndScienceImage\\artsScienceButton.png")
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\artsAndScienceImage\\artsScienceClicked.png")
    );
    BorrowBooksUtility cosmos = new BorrowBooksUtility("The Art of the Cosmos: Visions from the Frontier of Deep Space Exploration", "Jim Bill", "978-145-4946-08-3","Union Square & Co.","Second Edition"
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\artsAndScienceImage\\cosmos.png")
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\artsAndScienceImage\\cosmosButton.png")
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\artsAndScienceImage\\cosmosClicked.png")
    );
    BorrowBooksUtility exploring = new BorrowBooksUtility("Exploring the Arts: A Brief Introduction to Art, Theatre, Music, and Dance", "Kimberly Berkeley and Doris Hall", "978-167-7319-01-7","LOUIS: The Louisiana Library Network","Eight  Edition"
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\artsAndScienceImage\\exploring.png")
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\artsAndScienceImage\\exploringButton.png")
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\artsAndScienceImage\\exploringClicked.png")
    );
    BorrowBooksUtility primaryCare = new BorrowBooksUtility("Primary Care The Art and Science of Advanced Practice Nursing – an Interprofessional Approach", "Windland-Brown, Dunphy, Porter, and Thomas", "978-171-9644-65-5"," F.A. Davis Company","Four Edition"
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\artsAndScienceImage\\primaryCare.png")
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\artsAndScienceImage\\primaryCareButton.png")
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\artsAndScienceImage\\primaryCareClicked.png")
    );
    BorrowBooksUtility superForecasting = new BorrowBooksUtility("Superforecasting: The Art and Science of Prediction", "Dan Gardner", " 978-080-4136-71-6","Crown","First Edition"
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\artsAndScienceImage\\superForecasting.png")
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\artsAndScienceImage\\superForecastingButton.png")
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\artsAndScienceImage\\superForecastingClicked.png")
    );
    BorrowBooksUtility drawing = new BorrowBooksUtility("The Art and Science of Drawing: Learn to Observe, Analyze, and Draw Any Subject", "Brent Eviston", " 978-168-1987-75-0","Rocky Nook","Fifth Edition"
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\artsAndScienceImage\\drawing.png")
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\artsAndScienceImage\\drawingButton.png")
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\artsAndScienceImage\\drawingClicked.png")
    );
    BorrowBooksUtility assembly = new BorrowBooksUtility("The Art and Science of Ernst Haeckel", "Rainer Willmann", "978-383-6584-28-9","Taschen","40th Edition"
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\artsAndScienceImage\\assembly.png")
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\artsAndScienceImage\\assemblyButton.png")
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\artsAndScienceImage\\assemblyClicked.png")
    );

    //Architecture Books
    BorrowBooksUtility art = new BorrowBooksUtility("Introduction to Art: Design, Context, and Meaning", "Pamela Sachant", "978-621-8033-09-8","University of North Georgia Press","First Edition"
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\architectureImage\\art.png"),
            new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\architectureImage\\artButton.png"),
            new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\architectureImage\\artClicked.png"));
    BorrowBooksUtility basicConcept = new BorrowBooksUtility("Basic Concepts of Structural Design for Architecture Students", "Anahita Khodadadi", "978-621-8903-09-1","Unknown","First Edition"
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\architectureImage\\basicConcept.png"),
            new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\architectureImage\\basicConceptButton.png"),
            new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\architectureImage\\basicConceptClicked.png")
    );
    BorrowBooksUtility buildingInfo = new BorrowBooksUtility("Building Information Modeling using Revit for Architects and Engineers", "Dr. Atefe Makhmalbaf", "978-164-8160-05-9","Mavs Open Press","First Edition"
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\architectureImage\\buildingInfo.png"),
            new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\architectureImage\\buildingInfoButton.png"),
            new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\architectureImage\\buildingInfoClicked.png")
    );
    BorrowBooksUtility fundamentalsPrinciples = new BorrowBooksUtility("Building Information - Representation and Management: Fundamentals and Principles", "Alexander Koutamanis", "978-946-3661-60-7","TU Delft Open","First Edition"
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\architectureImage\\fundamentalsPrinciples.png"),
            new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\architectureImage\\fundamentalsPrinciplesButton.png"),
            new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\architectureImage\\fundamentalsPrinciplesClicked.png")
    );
    BorrowBooksUtility tutorials = new BorrowBooksUtility("Tutorials of Visual Graphic Communication Programs for Interior Design, Volume 2", "Dr. Yongyeon Cho", "978-621-8643-09-2","Iowa State University","Second Edition"
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\architectureImage\\tutorials.png"),
            new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\architectureImage\\tutorialsButton.png"),
            new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\architectureImage\\tutorialsClicked.png")
    );
    BorrowBooksUtility digitalEra = new BorrowBooksUtility("Building Information - Representation and Management: Principles and Foundations for the Digital Era", "Alexander Koutamanis", "978-946-3665-15-5","TU Delft Open","First Edition"
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\architectureImage\\digitalEra.png"),
            new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\architectureImage\\digitalEraButton.png"),
            new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\architectureImage\\digitalEraClicked.png")
    );
    BorrowBooksUtility guideItalianArt = new BorrowBooksUtility("Guide to Italian art in the 1400s", "Ruth Ezra, Beth Harris,Steven Zucker", "978-621-8033-09-2","Smarthistory","First Edition"
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\architectureImage\\guideItalianArt.png"),
            new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\architectureImage\\guideItalianArtButton.png"),
            new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\architectureImage\\guideItalianArtClicked.png")
    );
    BorrowBooksUtility disciplineOrganizing = new BorrowBooksUtility("The Discipline of Organizing: 4th Professional Edition", "Bob Glushko", "978-099-9797-01-3","University of California, Berkeley","Forth Edition"
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\architectureImage\\disciplineOrganizing.png"),
            new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\architectureImage\\disciplineOrganizingButton.png"),
            new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\architectureImage\\disciplineOrganizingClicked.png")
    );

    //Business Books
    BorrowBooksUtility fundamentalsLaw = new BorrowBooksUtility("Fundamentals of Business Law", "Melissa Randall", "978-864-1379-13-5","Melissa Randall","Second Edition"
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\businessImage\\fundamentalsLaw.png")
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\businessImage\\fundamentalsLawButton.png")
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\businessImage\\fundamentalsLawClicked.png"));
    BorrowBooksUtility financialBusinesses = new BorrowBooksUtility("Financial Management for Small Businesses: Financial Statements & Present Value Models", "Black, Hanson, Robinson", "978-917-6482-11-3","Michigan State University","Second Edition"
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\businessImage\\financialBusinesses.png")
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\businessImage\\financialBusinessesButton.png")
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\businessImage\\financialBusinessesClicked.png")
    );
    BorrowBooksUtility communicationSuccess = new BorrowBooksUtility("Business Communication for Success", "Scott McLean", "978-194-6135-05-6","Unknown","Tenth Edition"
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\businessImage\\communicationSuccess.png")
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\businessImage\\communicationSuccessButton.png")
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\businessImage\\communicationSuccessClicked.png")
    );
    BorrowBooksUtility exploringBusiness = new BorrowBooksUtility("Exploring Business", "Libraries", "978-194-6135-09-4","University of Minnesota Libraries Publishing","Seventh Edition"
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\businessImage\\exploringBusiness.png")
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\businessImage\\exploringBusinessButton.png")
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\businessImage\\exploringBusinessClicked.png")
    );
    BorrowBooksUtility advancedBusinessLaw = new BorrowBooksUtility("Advanced Business Law and the Legal Environment",
            "Don Mayer, Daniel Warner, George J. Siedel, Jethro K. Lieberman, and Alyssa Rose Martina", "978-682-1649-11-8","Saylor Foundation","First Edition"
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\businessImage\\advancedBusinessLaw.png")
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\businessImage\\advancedBusinessLawButton.png")
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\businessImage\\advancedBusinessLawClicked.png")
    );
    BorrowBooksUtility ethicalOfBusiness = new BorrowBooksUtility("The Legal and Ethical Environment of Business",
            "Terence Lau, Lisa Johnson", "978-193-6126-58-3","Saylor Foundation","Third Edition"
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\businessImage\\ethicalOfBusiness.png")
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\businessImage\\ethicalOfBusinessButton.png")
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\businessImage\\ethicalOfBusinessClicked.png")
    );
    BorrowBooksUtility foundationBusinessLaw = new BorrowBooksUtility("Foundations of Business Law and Legal Environment",
            "Don Mayer", "978-145-3343-72-2","Saylor Foundation","Sixth Edition"
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\businessImage\\foundationBusinessLaw.png")
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\businessImage\\foundationBusinessLawButton.png")
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\businessImage\\foundationBusinessLawClicked.png")
    );
    BorrowBooksUtility business = new BorrowBooksUtility("Fundamentals of Business",
            "Stephen J. Skripak and Ron Poff", "978-645-5643-82-6","Pamplin College og Business","Forth Edition"
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\businessImage\\business.png")
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\businessImage\\businessButton.png")
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\businessImage\\businessClicked.png")
    );

    //Education Books
    BorrowBooksUtility linearAlgebra = new BorrowBooksUtility("A First Course in Linear Algebra", "Ken Kuttler", "978-821-7473-09-6","Lyryx","First Edition"
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\educationImage\\linearAlgebra.png")
            , new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\educationImage\\linearAlgebraButton.png")
            , new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\educationImage\\linearAlgebraClicked.png"));
    BorrowBooksUtility healthEducation = new BorrowBooksUtility("Health Education", "College of the Canyons", "978-481-8974-59-2","College of Canyons","Third Edition"
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\educationImage\\healthEducation.png")
            , new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\educationImage\\healthEducationButton.png")
            , new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\educationImage\\healthEducationClicked.png")
    );
    BorrowBooksUtility psychologyEduc = new BorrowBooksUtility("Educational Psychology", "Kelvin Seifert, Rosemary Sutton", "978-564-9462-09-2","University of Manitoba","Second Edition"
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\educationImage\\psychologyEduc.png")
            , new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\educationImage\\psychologyEducButton.png")
            , new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\educationImage\\psychologyEducClicked.png")
    );
    BorrowBooksUtility selfLearning = new BorrowBooksUtility("Self-directed multimodal learning in higher education", "Jako Olivier, Rosemary Sutton", "978-564-9462-09-2","AOSIS Publishing","First Edition"
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\educationImage\\selfLearning.png")
            , new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\educationImage\\selfLearningButton.png")
            , new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\educationImage\\selfLearningClicked.png")
    );
    BorrowBooksUtility mixedCourse = new BorrowBooksUtility("A Mixed Course-Based Research Approach to Human Physiology", "Karri Haen, Rosemary Sutton", "978-564-9462-09-2","Iowa State University","First Edition"
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\educationImage\\mixedCourse.png")
            , new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\educationImage\\mixedCourseButton.png")
            , new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\educationImage\\mixedCourseClicked.png")
    );
    BorrowBooksUtility contemporaryWorld = new BorrowBooksUtility("The Contemporary World", "Botor, Peralta, Ferrer, Amparo, Laude", "978-621-0404-31-9","Greg Tabios Pawilen","2021 Edition"
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\educationImage\\contemporaryWorld.png")
            , new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\educationImage\\contemporaryWorldButton.png")
            , new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\educationImage\\contemporaryWorldClicked.png")
    );
    BorrowBooksUtility ethics = new BorrowBooksUtility("Ethics", "Bulaong Jr., Lagliva, Mariano, Calano, Principe", "978-621-0422-10-8","Greg Tabios Pawilen","2021 Edition"
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\educationImage\\ethics.png")
            , new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\educationImage\\ethicsButton.png")
            , new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\educationImage\\ethicsClicked.png")
    );
    BorrowBooksUtility purposiveCom = new BorrowBooksUtility("Purposive Communication", "Lim, Bianco-Harnada, Alata", "978-621-0401-27-1","Greg Tabios Pawilen","2021 Edition"
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\educationImage\\purposiveCom.png")
            , new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\educationImage\\purposiveComButton.png")
            , new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\educationImage\\purposiveComClicked.png")
    );

    //Engineering Books
    BorrowBooksUtility assemblyLanguage = new BorrowBooksUtility("Assembly Language", "Zaplan, Sadicon, Alcalde, Villanueva", "978-621-8033-09-2","Unknown","Second Edition"
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\engineeringImage\\assemblyLanguage.png")
            , new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\engineeringImage\\assemblyLanguageButton.png")
            , new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\engineeringImage\\assemblyLanguageClicked.png"));
    BorrowBooksUtility nationalServiceProgram2 = new BorrowBooksUtility("National Service Training Program 2", "Marivic C. Reyes", "978-622-8155-09-3","Unknown","Second Edition"
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\engineeringImage\\nationalServiceProgram2.png")
            , new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\engineeringImage\\nationalServiceProgram2Button.png")
            , new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\engineeringImage\\nationalServiceProgram2Clicked.png")
    );
    BorrowBooksUtility calculus = new BorrowBooksUtility("Calculus", "Gilbert Strang", "978-764-4012-03-6"," Wellesley-Cambridge Press","5th Edition"
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\engineeringImage\\calculus.png")
            , new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\engineeringImage\\calculusButton.png")
            , new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\engineeringImage\\calculusClicked.png")
    );
    BorrowBooksUtility engineeringMatlab = new BorrowBooksUtility("Engineering Computation with MATLAB", "Serhat Beyener", "978-728-6045-10-4","Serhat Beyener","First Edition"
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\engineeringImage\\engineeringMatlab.png")
            , new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\engineeringImage\\engineeringMatlabButton.png")
            , new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\engineeringImage\\engineeringMatlabClicked.png")
    );
    BorrowBooksUtility fundamentalsOfElectricalEngineering = new BorrowBooksUtility("Fundamentals of Electrical Engineering !", "Don Johnson", " 978-130-0160-13-7","OpenStax CNX","Second Edition"
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\engineeringImage\\fundamentalsOfElectricalEngineering.png")
            , new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\engineeringImage\\fundamentalsOfElectricalEngineeringButton.png")
            , new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\engineeringImage\\fundamentalsOfElectricalEngineeringClicked.png")
    );
    BorrowBooksUtility computerAided = new BorrowBooksUtility("Computer-Aided Exercises in Civil Procedure - 7th Edition", "Roger C. Park", "978-324-4856-10-3"," CALI's eLangdell® Press","Seventh Edition"
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\engineeringImage\\computerAided.png")
            , new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\engineeringImage\\computerAidedButton.png")
            , new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\engineeringImage\\computerAidedClicked.png")
    );
    BorrowBooksUtility objectOrientedPatterns = new BorrowBooksUtility("Object-Oriented Reengineering Patterns", "Demeyer, Ducasse, Nierstrasz", "978-201-9874-01-9","Stéphane Ducasse","Third Edition"
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\engineeringImage\\objectOrientedPatterns.png")
            , new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\engineeringImage\\objectOrientedPatternsButton.png")
            , new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\engineeringImage\\objectOrientedPatternsClicked.png")
    );
    BorrowBooksUtility industrialEngineering = new BorrowBooksUtility("Introduction to Industrial Engineering", "Bonnie Boardman", ": 978-164-8169-82-3","Mays Open Press","Fifth Edition"
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\engineeringImage\\industrialEngineering.png")
            , new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\engineeringImage\\industrialEngineeringButton.png")
            , new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\engineeringImage\\industrialEngineeringClicked.png")
    );

    //Entrepreneurship Books
    BorrowBooksUtility learningCivil = new BorrowBooksUtility("Learning Civil Procedure", "David Herr", "978-164-7084-98-1","West Academic Publishing","Fourth Edition"
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\entreneurshipImage\\learningCivil.png"),
            new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\entreneurshipImage\\learningCivilButton.png"),
            new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\entreneurshipImage\\learningCivilClicked.png"));
    BorrowBooksUtility ethicalDilemmas = new BorrowBooksUtility("Ethical Dilemmas and Decisions in Criminal Justice", "Joycelyn M. Pollock", "978-035-7512-91-3","Cengage Learning","Eleventh Edition"
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\entreneurshipImage\\ethicalDilemmas.png"),
            new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\entreneurshipImage\\ethicalDilemmasButton.png"),
            new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\entreneurshipImage\\ethicalDilemmasClicked.png")
    );
    BorrowBooksUtility owningYourFuture = new BorrowBooksUtility("Student Activity Workbook for Entrepreneurship: Owning Your Future", "Steve Mariotti", "978-013-5150-00-9","Pearson","Second Edition"
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\entreneurshipImage\\owningYourFuture.png"),
            new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\entreneurshipImage\\owningYourFutureButton.png"),
            new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\entreneurshipImage\\owningYourFutureClicked.png")
    );
    BorrowBooksUtility entrepreneurshipAndInnovation = new BorrowBooksUtility("Entrepreneurship and Innovation Toolkit", "Lee Swanson", "978-469-1346-11-7"," OPENPRESS.USASK.CA","Eigth Edition"
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\entreneurshipImage\\entrepreneurshipAndInnovation.png"),
            new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\entreneurshipImage\\entrepreneurshipAndInnovationButton.png"),
            new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\entreneurshipImage\\entrepreneurshipAndInnovationClicked.png")
    );
    BorrowBooksUtility mediaInnovationAndEntrepreneurship = new BorrowBooksUtility("Media Innovation and Entrepreneurship", "Michelle Ferrier, Elizabeth Mays", "978-198-9014-01-1","Rebus Community","Fourth Edition"
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\entreneurshipImage\\mediaInnovationAndEntrepreneurship.png"),
            new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\entreneurshipImage\\mediaInnovationAndEntrepreneurshipButton.png"),
            new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\entreneurshipImage\\mediaInnovationAndEntrepreneurshipClicked.png")
    );
    BorrowBooksUtility introductionToEntrepreneurship = new BorrowBooksUtility("Introduction to Entrepreneurship", "Katherine Carpenter", " 978-198-9864-50-0"," Kwantlen Polytechnic University","Second Edition"
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\entreneurshipImage\\introductionToEntrepreneurship.png"),
            new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\entreneurshipImage\\introductionToEntrepreneurshipButton.png"),
            new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\entreneurshipImage\\introductionToEntrepreneurshipClicked.png")
    );
    BorrowBooksUtility innovationAndEntrepreneurship = new BorrowBooksUtility("Sustainability, Innovation and Entrepreneurship", "Andrea Larson", " 978-145-3314-12-8","Saylor Foundation","Fourteenth Edition"
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\entreneurshipImage\\innovationAndEntrepreneurship.png"),
            new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\entreneurshipImage\\innovationAndEntrepreneurshipButton.png"),
            new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\entreneurshipImage\\innovationAndEntrepreneurshipClicked.png")
    );
    BorrowBooksUtility dulcansTextbook = new BorrowBooksUtility("Dulcan's Textbook of Child and Adolescent Psychiatry", "Mina K., M.D Dulcan", "978-161-5373-27-7","American Psychi","Second Edition"
            ,new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\entreneurshipImage\\dulcansTextbook.png"),
            new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\entreneurshipImage\\dulcansTextbookButton.png"),
            new ImageIcon("C:\\Users\\Lauren Andre\\IdeaProjects\\Automated LIbrary\\src\\borrowbooksimages\\entreneurshipImage\\dulcansTextbookClicked.png")
    );
}
