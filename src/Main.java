
    import javax.management.StringValueExp;
    import java.io.*;
    import java.util.Random;


    public class Main {
        public static void main(String[] args) throws IOException {
            File file = new File("Text.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);


            int[] array = new int[100];
            int i = 0;
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                int number = Integer.parseInt(line);
                array[i] = number;
                i++;

                bufferedReader.readLine();
                System.out.println(line);

                FileWriter fileWriter = new FileWriter(file);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                Random random = new Random();

                for (int i = 0; i < 100; i++) {
                    array[i] = random.nextInt(0, 100);
                    System.out.println(array[i]);
                    String a = String.valueOf(array[i]);


                    bufferedWriter.write(a);
                    bufferedWriter.newLine();
                    bufferedWriter.flush();


                    bufferedReader.close();
                    bufferedWriter.close();
                }


            }}}



                    ////1) Создайте новый проект и создайте в нем текстовый файл
////
////    2) Придумать алгоритм, который бы записал в файл 100 случайных чисел
////    3) Придумать алгоритм, который бы прочитал весь файл и вычислил бы:
////
////    3.1) Сумму всех чисел
////    3.2) Самое больше и самое маленькое число
////    3.3) Сколько чисел делятся на 2
////
////    4*) Сколько чисел больше соседа слева ("до них") и меньше соседа справа ("после них")
////    Пример: 5, 8, 9
////
////    5**) попробовать сделать хоть немного в стиле ООП


