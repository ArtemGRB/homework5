public class Main {
    public static void main(String[] args) {

        //Задание 1
        byte clientOS = 1;

            if(clientOS == 0) { System.out.println("Установите версию приложения для iOS по ссылке\n");}
            else { System.out.println("Установите версию приложения для Android по ссылке\n");}


        //Задание 2

        int clientDeviceYear = 2015;

        if ( clientDeviceYear < 2015 ){

                if(clientOS == 0) { System.out.println("Установите облегченную версию приложения для iOS по ссылке\n");}
                else { System.out.println("Установите облегченную версию приложения для Android по ссылке\n");}

        } else {

                if(clientOS == 0) { System.out.println("Установите версию приложения для iOS по ссылке\n");}
                else { System.out.println("Установите версию приложения для Android по ссылке\n");}
        }


        //Задание 3
        int year = 2021;
        if( ( (year % 4 == 0 && year % 100 != 0 ) || year % 400 == 0) && year > 1584 ){
            System.out.println(year + " год является високосным\n");
        } else { System.out.println(year + " год не является високосным\n");}

        //Задача 4
        int deliveryDistance = 101;
        byte deliveryDays = 1;
        if (deliveryDistance > 20){

            deliveryDays += 1;
            if(deliveryDistance > 60){

                deliveryDays += 1;
                if(deliveryDistance > 100){

                    deliveryDays = 0;
                    System.out.println("Свыше 100 км доставки нет\n");
                }
            }
        }
        if (deliveryDays != 0){
            System.out.println("Потребуется дней: " + deliveryDays + "\n");
        }

        //Задание 5
        byte monthNumber = 12;
                switch(monthNumber){
                    case 1:
                    case 12:
                    case 2:
                        System.out.println(monthNumber + "-й месяц (он же январь) принадлежит к сезону зима");
                        break;
                    case 3:
                    case 4:
                    case 5:
                        System.out.println(monthNumber + "-й месяц (он же январь) принадлежит к сезону весна");
                        break;
                    case 6:
                    case 7:
                    case 8:
                        System.out.println(monthNumber + "-й месяц (он же январь) принадлежит к сезону лето");
                        break;
                    case 9:
                    case 10:
                    case 11:
                        System.out.println(monthNumber + "-й месяц (он же январь) принадлежит к сезону осень");
                    default:
                        System.out.println("такого месяца не существует");
                }

    }
}