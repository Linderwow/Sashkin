package day37_Inheritance.scrumTask;

import java.util.ArrayList;

public class ScrumTeam {

    public ProductOwner PO;
    public BusinessAnalyst BA;
    public ScrumMaster SM;

    public ArrayList<Tester> testers =  new ArrayList<>();
    public ArrayList<Developer> developers = new ArrayList<>();

    public ScrumTeam(ProductOwner PO, BusinessAnalyst BA, ScrumMaster SM) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
    }

    public void addTester(Tester tester){
        testers.add( tester );
    }





}

/*
Creat a class named ScrumTeam:
            Variables:
                PO (ProductOwner), BA (BusinessAnalyst), SM (ScrumMaster),
                testers (ArrayList<Testers>),  developers (ArrayList<Developers>)

            Methods:
                addTester(Tester tester): adds the given tester to testers arraylist

                ddTesters(Tester[] testers): adds the given testers to testers arraylist

                removeTester(int id): removes the tester with the given id from the arraylist of tester

                addDeveloper(Developer developer): adds the given developer to testers arraylist

                addDeveloper(Developer[] developer): adds the given developers to testers arraylist

                removeDeveloper(int id): removes the developer with the given id from the arraylist of developer

                toString(): displays the BA' name, SM' name, PO' name, number of testers and number of developers
 */