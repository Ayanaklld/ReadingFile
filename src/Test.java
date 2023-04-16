import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        //как мы знаем разделители у разных систем разные и чтобы наша программа работала на разных системах мы можем это делегировать
        //то есть в переменную мы подставляем разделитель системы компа
        String separator = File.separator;
        //сконкатирируем строки
        String path = "C:" + separator + "Users" + separator + "Admin" + separator + "Downloads" + separator + "First.txt";

        //объект класса файл
        File file = new File(path);

        //подадим наш файл
        Scanner sc = new Scanner(file);

        //считываем все строки
        // будет выполняться до тех пор пока в файле есть строки
        String line = sc.nextLine();

        //теперь нам нужно вытащить каждую цифру в нашей строке
        //этот метод уввидит что в нашей строке 2 пробела
        String[] numbersString = line.split(" ");

        //массив чисел
        int[] numbers = new int[3];
        int counter = 0;

        //теперь мы должны цифры в нашей строке преобразовать в числа
        for (String number : numbersString){
            numbers[counter++] = Integer.parseInt(number);
        }

        System.out.println(Arrays.toString(numbers));


        //в конце программу обязательно нужно закрывать
        sc.close();
    }
}
