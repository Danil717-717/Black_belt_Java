package work_with_files;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Ex09ChannelBuffer {
    public static void main(String[] args) {
        try (RandomAccessFile file =
                new RandomAccessFile("./src/main/java/work_with_files/Test4.txt","rw");
             FileChannel channel = file.getChannel() ){

            //наш буфер может быть заполнен максимум на 25 байт
            ByteBuffer byteBuffer = ByteBuffer.allocate(25);
            //записываем кусочки стиха в StringBuilder
            // и потом будем выводить его на экран
            StringBuilder stix = new StringBuilder();

            // читаем channel-ом наш файл и записываем в буфер
            int buteRead = channel.read(byteBuffer);//запоминает кол-во байт
            //добавим в цикл, чтобы прочитать весь
            // текст пока есть что читать
            while (buteRead>0){
                //выводим что прочитали
                System.out.println("read " + buteRead);

                byteBuffer.flip();//читаем инфо из буфера
                //по 1 байту за раз

                //пока есть что читать читаем
                while (byteBuffer.hasRemaining()){
                    stix.append((char) byteBuffer.get());
                }

                byteBuffer.clear(); //опять переводим на 0 позицию
                buteRead=channel.read(byteBuffer);// опять читаем

            }
            System.out.println(stix);

            //запись в файл текста v1
            String text = "\n'The value of a man should be " +
                    "seen in what he gives and not in what he is able to receive'\n" +
                    "'Life is like riding a bicycle. To keep your balance, you must keep moving'";


            //создаем бафер, переводим текст в массив байтов и узнаем размер длину
            ByteBuffer byteBuffer2 = ByteBuffer.allocate(text.getBytes().length);
            //заносим наш текст в буфер
            byteBuffer2.put(text.getBytes());
            //читаем из буфера, чтобы записать в файл
            byteBuffer2.flip();
            channel.write(byteBuffer2);

            //запись в файл текста v2
            //более элегантный способ, не нужно указывать размер буфера
            // не нужно записывать в буфер, не нужно делать флип
            // это все делает метод wrap()
            String text2 = "\n'Now or never!'";
            ByteBuffer byteBuffer3 = ByteBuffer.wrap(text2.getBytes());
            channel.write(byteBuffer3);



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
