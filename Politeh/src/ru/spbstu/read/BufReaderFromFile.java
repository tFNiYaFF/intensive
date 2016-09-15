package ru.spbstu.read;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;

import java.io.*;
import java.nio.charset.Charset;

/**
 * Created by sergey.tovmasyan on 12/09/16.
 */
public class BufReaderFromFile {
    public static final String FILE_NAME_NOBEL = "nobel.csv";
    public static final String FILE_NAME_WRITE = "some.txt";

    public static void main(String[] args) {

    }

    public static void readBySymbol() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME_NOBEL))) {
            int c;
            while ((c = br.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void readByLine() {
        try(BufferedReader br = new BufferedReader(new FileReader(FILE_NAME_NOBEL)))
        {
            String s;
            while((s=br.readLine())!=null){
                System.out.println(s);
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void writeHello() {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME_WRITE)))
        {
            String text = "Всем привет gffjf";
            bw.write(text);
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

}
