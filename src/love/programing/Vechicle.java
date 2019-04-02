package love.programing;

public class Vechicle {


    private String manufaturer;
    public String plate;

    protected Customer seats[][] = new Customer[0][0];


    protected void listseats() {

        int i, j=0;

        for (i = 0; i < seats.length; i++) {

            for (j = 0; j < seats[i].length; j++) {

                if (seats[i][j] == null) {
                    System.out.println("Empty");
                } else {

                    int seat= (i)* seats[0].length+j+1;
                    System.out.println("seat:"+seat +"   "+seats[i][j].getCustomerFristName() + " " + seats[i][j].getCustomerSurname());
                }


            }

        }


        }


        protected String reserveSeat (Customer c){

            int i, j=0;

            boolean isFound=false;

            for (i = 0; i < seats.length; i++) {
                if(isFound)
                    break;

                for (j = 0; j < seats[i].length; j++) {

                    if (seats[i][j] == null) {
                        seats[i][j] = c;
                        isFound=true;
                        break;
                    }

                }
            }

            int seat= (i-1)* seats[0].length+j+1;

            return  seat + " ";


        }


        public void setManufaturer (String manufaturer){
            this.manufaturer = manufaturer;

        }

        public String getManufaturer () {
            return manufaturer;
        }

    }


