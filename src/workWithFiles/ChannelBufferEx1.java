package workWithFiles;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;

public class ChannelBufferEx1 {
    public static void main(String[] args) {
        try (RandomAccessFile file =
                     new RandomAccessFile("test10.txt", "rw");
             FileChannel channel = file.getChannel()) {
            ByteBuffer buffer = ByteBuffer.allocate(25);
            StringBuilder prose = new StringBuilder();

            int byteRead = channel.read(buffer);
            while(byteRead > 0) {
                System.out.println("Read: " + byteRead);

                // Switch mode to READ
                buffer.flip();

                while (buffer.hasRemaining()) {
                    prose.append((char) buffer.get());
                }

                // Switch mode to WRITE
                buffer.clear();
                byteRead = channel.read(buffer);
            }

            System.out.println(prose);

            String text = "\nThere are only two ways to live your live.\n" +
                    "One is as though is a miracle. The other is as\n" +
                    "though everything is a miracle.";
//            ----------------------------------------------------
//            ByteBuffer buffer2 = ByteBuffer.allocate(text.getBytes(StandardCharsets.UTF_8).length);
//            buffer2.put(text.getBytes(StandardCharsets.UTF_8));
//
//            buffer2.flip();
//
//            channel.write(buffer2);
//            ----------------------------------------------------

            ByteBuffer buffer2 = ByteBuffer.wrap(text.getBytes());
            channel.write(buffer2);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
