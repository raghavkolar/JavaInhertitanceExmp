package love.programing;

public class Plane extends Vechicle{

    public Plane() {

        seats = new Customer[4][5];
    }

    String [] lables = new String [] {"A","B","C","D","E"};

    protected void listseats() {

        int i, j=0;

        for (i = 0; i < seats.length; i++) {

            for (j = 0; j < seats[i].length; j++) {

                if (seats[i][j] == null) {
                    System.out.println("Empty");
                } else {

                    String seat= (i+1)+ lables[j];
                    System.out.println("seat:"+seat +"   "+seats[i][j].getCustomerFristName() + " " + seats[i][j].getCustomerSurname());
                }


            }

        }


    }
}
