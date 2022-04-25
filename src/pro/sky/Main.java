package pro.sky;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // 1) 1 -> 10 and 10 -> 1
        int i = 0;
        while(i<10){
            i++;
            System.out.print(i+" ");
        }
        System.out.println();
        for(i=10;i>0;i--){
            System.out.print(i+" ");
        }
        System.out.println();


        // 2) friday report
        int firstFriday = 4;
        for(i = firstFriday; i<=31;i++){
            if((i-4) % 7 ==0){
                System.out.println("Сегодня пятница, "+i+"-е число. Необходимо подготовить отчет.");
            }
        }

        // 3) comets
        int currentYear = 2022;
        int startInterval = currentYear-200;
        int endInterval = currentYear+200;

        int count = 0;

        for(i = startInterval; i<=endInterval; i++){
            if(i%79==0){
                count++;
                System.out.println(i);
                if(i>currentYear){
                    break;
                }
            }
        }


    }
}
