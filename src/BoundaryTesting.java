public class BoundaryTesting {

    /*
objetivo da atividae é testar os limites destes dados,
1582 2
1583 0
1583 13
1583 1
1583 12
    
     apenas 1583 1, 1583 12, nao da bad request

*/
    
    public static void main(String args[]) {
        int CALENDAR_START = 1583;
        int year = 1583;
        int month = 12;
        // validate input 
        if ((year < CALENDAR_START) || (month < 1) || (month > 12)) {
            System.out.println("Bad request: " + year + " " + month);
        }

    }

}
