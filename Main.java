package com.fpm.project;

import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class Main{
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("DS1.txt"))){
            String str;
            BufferedImage bufferedImage = new BufferedImage(540, 960, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g = bufferedImage.createGraphics();
            g.setPaint(Color.black);
            while((str=br.readLine())!=null){
                String s[] = str.split(" ");
                g.drawLine(Integer.parseInt(s[0]), Integer.parseInt(s[1]), Integer.parseInt(s[0]), Integer.parseInt(s[1]));
            }
            ImageIO.write(bufferedImage, "png", new File("result.png"));
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}