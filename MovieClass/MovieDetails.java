package MovieClass;

import java.io.*;
import java.nio.file.*;

import static javax.swing.JOptionPane.showMessageDialog;

public class MovieDetails {
    
    public String findMoviePath(int n){
        String value="";
         
        try{

            String path = "files/MovieUpdate.txt";
                FileReader fileReader = new FileReader(path);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                int check = 0;
                while (bufferedReader.readLine() != null) {
                    check++;
                }

                switch(n){

                    case 1:
                    for (int i = 0; i < check; i++) {
                        String line = Files.readAllLines(Paths.get(path)).get(i);
                        if(line.equals("start")){
                            String line1 = Files.readAllLines(Paths.get(path)).get(i+1);
                            bufferedReader.close();
                            String movie1=line1.substring("movie1path:".length());
                            value = movie1;

                            
                        }
                        
                    }

                    break;

                    case 2:
                    for (int i = 0; i < check; i++) {
                        String line = Files.readAllLines(Paths.get(path)).get(i);
                        if(line.equals("start")){
                            String line1 = Files.readAllLines(Paths.get(path)).get(i+2);
                            bufferedReader.close();
                            String movie2=line1.substring("movie2path:".length());
                            value = movie2;

                            
                        }
                        
                    }
                    break;

                    case 3:
                    for (int i = 0; i < check; i++) {
                        String line = Files.readAllLines(Paths.get(path)).get(i);
                        if(line.equals("start")){
                            String line1 = Files.readAllLines(Paths.get(path)).get(i+3);
                            bufferedReader.close();
                            String movie3=line1.substring("movie3path:".length());
                            value = movie3;

                            
                        }
                        
                    }
                    break;

                    case 4:
                    for (int i = 0; i < check; i++) {
                        String line = Files.readAllLines(Paths.get(path)).get(i);
                        if(line.equals("start")){
                            String line1 = Files.readAllLines(Paths.get(path)).get(i+4);
                            bufferedReader.close();
                            String movie4=line1.substring("movie4path:".length());
                            value = movie4;

                            
                        }
                        
                    }
                    break;


                }


        }

        catch(Exception e){

        }

        return value;

    }  


    public void changeMoviePath(int n,String gotpath){
        
        try {
            Path path = Paths.get("files/MovieUpdate.txt");
            String oldLine="";
            String newLine ="";

            if(n==1){
                oldLine = "movie1path:"+this.findMoviePath(1);
                newLine = "movie1path:" + gotpath;
            }
            else if(n==2){
                oldLine ="movie2path:"+this.findMoviePath(2);
                newLine = "movie2path:" + gotpath;
            }
            else if(n==3){
                oldLine ="movie3path:"+this.findMoviePath(3);
                newLine = "movie3path:" + gotpath;
            }
            else if(n==4){
                oldLine ="movie4path:"+this.findMoviePath(4);
                newLine = "movie4path:" + gotpath;
            }
            
            
            
            System.out.println(newLine);
            System.out.println(oldLine);
            System.out.println(findMoviePath(2));
            
                String fileContent = new String(Files.readAllBytes(path));
                fileContent = fileContent.replaceAll(oldLine, newLine);
                Files.write(path, fileContent.getBytes(), StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);
            
            } catch (IOException ex) {
                    ex.printStackTrace();
              } 

    }


    public String findMovieName(int n){
     
         String value ="";

         try{

            String path = "files/MovieUpdate.txt";
                FileReader fileReader = new FileReader(path);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                int check = 0;
                while (bufferedReader.readLine() != null) {
                    check++;
                }

                switch(n){

                    case 1:
                    for (int i = 0; i < check; i++) {
                        String line = Files.readAllLines(Paths.get(path)).get(i);
                        if(line.equals("start2")){
                            String line1 = Files.readAllLines(Paths.get(path)).get(i+1);
                            bufferedReader.close();
                            String movie1name=line1.substring("movie1name:".length());
                            value = movie1name;

                            
                        }
                        
                    }

                    break;

                    case 2:
                    for (int i = 0; i < check; i++) {
                        String line = Files.readAllLines(Paths.get(path)).get(i);
                        if(line.equals("start2")){
                            String line1 = Files.readAllLines(Paths.get(path)).get(i+2);
                            bufferedReader.close();
                            String movie2name=line1.substring("movie2name:".length());
                            value = movie2name;

                            
                        }
                        
                    }
                    break;

                    case 3:
                    for (int i = 0; i < check; i++) {
                        String line = Files.readAllLines(Paths.get(path)).get(i);
                        if(line.equals("start2")){
                            String line1 = Files.readAllLines(Paths.get(path)).get(i+3);
                            bufferedReader.close();
                            String movie3name=line1.substring("movie2name:".length());
                            value = movie3name;

                            
                        }
                        
                    }
                    break;

                    case 4:
                    for (int i = 0; i < check; i++) {
                        String line = Files.readAllLines(Paths.get(path)).get(i);
                        if(line.equals("start2")){
                            String line1 = Files.readAllLines(Paths.get(path)).get(i+4);
                            bufferedReader.close();
                            String movie4name=line1.substring("movie4name:".length());
                            value = movie4name;

                            
                        }
                        
                    }
                    break;


                }


        }

        catch(Exception e){

        }

         return value;

    }

    public void changeMovieName(int n,String gotName){
        
        try {
            Path path = Paths.get("files/MovieUpdate.txt");
            String oldLine="";
            String newLine ="";

            if(n==1){
                oldLine = "movie1name:"+this.findMovieName(1);
                newLine = "movie1name:" + gotName;
            }
            else if(n==2){
                oldLine ="movie2name:"+this.findMovieName(2);
                newLine = "movie2name:" + gotName;
            }
            else if(n==3){
                oldLine ="movie3name:"+this.findMovieName(3);
                newLine = "movie3name:" + gotName;
            }
            else if(n==4){
                oldLine ="movie4name:"+this.findMovieName(4);
                newLine = "movie4name:" + gotName;
            }
            
            
            
            
                String fileContent = new String(Files.readAllBytes(path));
                fileContent = fileContent.replaceAll(oldLine, newLine);
                Files.write(path, fileContent.getBytes(), StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);
            
            } catch (IOException ex) {
                    ex.printStackTrace();
              } 

    }

    public String findSliderPath(int n){
        String value="";

        try{

            String path = "files/MovieUpdate.txt";
                FileReader fileReader = new FileReader(path);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                int check = 0;
                while (bufferedReader.readLine() != null) {
                    check++;
                }

                switch(n){

                    case 1:
                    for (int i = 0; i < check; i++) {
                        String line = Files.readAllLines(Paths.get(path)).get(i);
                        if(line.equals("start3")){
                            String line1 = Files.readAllLines(Paths.get(path)).get(i+1);
                            bufferedReader.close();
                            String slider1=line1.substring("slider1:".length());
                            value = slider1;

                            
                        }
                        
                    }

                    break;

                    case 2:
                    for (int i = 0; i < check; i++) {
                        String line = Files.readAllLines(Paths.get(path)).get(i);
                        if(line.equals("start3")){
                            String line1 = Files.readAllLines(Paths.get(path)).get(i+2);
                            bufferedReader.close();
                            String slider1=line1.substring("slider2:".length());
                            value = slider1;

                            
                        }
                        
                    }
                    break;

                    case 3:
                    for (int i = 0; i < check; i++) {
                        String line = Files.readAllLines(Paths.get(path)).get(i);
                        if(line.equals("start3")){
                            String line1 = Files.readAllLines(Paths.get(path)).get(i+3);
                            bufferedReader.close();
                            String slider3=line1.substring("slider3:".length());
                            value = slider3;

                            
                        }
                        
                    }
                    break;

                    case 4:
                    for (int i = 0; i < check; i++) {
                        String line = Files.readAllLines(Paths.get(path)).get(i);
                        if(line.equals("start3")){
                            String line1 = Files.readAllLines(Paths.get(path)).get(i+4);
                            bufferedReader.close();
                            String slider4=line1.substring("slider4:".length());
                            value = slider4;

                            
                        }
                        
                    }
                    break;


                }


        }

        catch(Exception e){

        }

        return value;
    }

    public void changeSlider(int n,String gotslider){
        
        try {
            Path path = Paths.get("files/MovieUpdate.txt");
            String oldLine="";
            String newLine ="";

            if(n==1){
                oldLine = "slider1:"+this.findSliderPath(1);
                newLine = "slider1:" + gotslider;
            }
            else if(n==2){
                oldLine ="slider2:"+this.findSliderPath(2);
                newLine = "slider2:" + gotslider;
            }
            else if(n==3){
                oldLine ="slider3:"+this.findSliderPath(3);
                newLine = "slider3:" + gotslider;
            }
            else if(n==4){
                oldLine ="slider4:"+this.findSliderPath(4);
                newLine = "slider4:" + gotslider;
            }
            
            
            
            
                String fileContent = new String(Files.readAllBytes(path));
                fileContent = fileContent.replaceAll(oldLine, newLine);
                Files.write(path, fileContent.getBytes(), StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);
            
            } catch (IOException ex) {
                    ex.printStackTrace();
              } 

    }




    

}



