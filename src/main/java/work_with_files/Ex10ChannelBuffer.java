package work_with_files;


import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Ex10ChannelBuffer {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("./src/main/java/work_with_files/Test5.txt","r");
             FileChannel channel = file.getChannel()){


            ByteBuffer byteBuffer = ByteBuffer.allocate(5);
            channel.read(byteBuffer);
            byteBuffer.flip();
            //читаем по байтово
            System.out.println((char) byteBuffer.get());//Выводим 1 байт
            System.out.println((char) byteBuffer.get());//Выводим 2 байт
            System.out.println((char) byteBuffer.get());//Выводим 3 байт

            System.out.println("byteBuffer.rewind() ");
            byteBuffer.rewind();
            System.out.println((char) byteBuffer.get());
            System.out.println("--------");

            byteBuffer.compact();
            channel.read(byteBuffer);
            byteBuffer.flip();
            while (byteBuffer.hasRemaining()){
                System.out.println((char) byteBuffer.get());
            }

            System.out.println("--------");
            byteBuffer.clear();//перевод курсора на 0
            channel.read(byteBuffer);
            byteBuffer.flip();
            System.out.println((char) byteBuffer.get());
            byteBuffer.mark();
            System.out.println((char) byteBuffer.get());
            System.out.println((char) byteBuffer.get());
            byteBuffer.reset();

            while (byteBuffer.hasRemaining()){
                System.out.println((char) byteBuffer.get());
            }


            } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
