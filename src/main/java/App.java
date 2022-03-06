import java.util.*;

public class App {
  
    public static void main(String[] args) throws Exception {
      
        List<Object> dataUser = setDataUser();

        validateAgeUser(dataUser);       
    }

    public static List<Object> setDataUser() {

        Scanner input = new Scanner(System.in);

        System.out.println("Introduzca su nombre");
        String userName = input.nextLine();
      
        System.out.println("Introduzca edad");
        int userAge = input.nextInt();

        input.close();

        return Arrays.asList(userName, userAge);
    }

    public static void validateAgeUser(List<Object> dataUser){

        int age = (int) dataUser.get(1);

        if(age >= 18){
                System.out.println("Hello " + dataUser.get(0) + ". You are " + dataUser.get(1) + " years old. YOU CAN PASS");
            }else{
                System.out.println("Hello " + dataUser.get(0) + ". You are " + dataUser.get(1) + " years old. YOU CAN'T PASS");
        }
    }

    // VERSIÓN DEL EJERCICIO SIN SEPARAR POR MÉTODOS
    
     /*  public static void main(String[] args) throws Exception {
      
        Scanner input = new Scanner(System.in);

        System.out.println("Introduzca su nombre");
        String userName = input.nextLine();
      
        System.out.println("Introduzca edad");
        int userAge = input.nextInt();
      
        if(userAge >= 18){
            System.out.println("Hello " + userName + " you are " + userAge + " years old. YOU CAN PASS");
        }else{
            System.out.println("Hello " + userName + " you are " + userAge + " years old. YOU CAN'T PASS");
        }

        input.close();
    } */
}
