package Classes;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

import static javax.swing.JOptionPane.showMessageDialog;

public class Details{


    public String findDetails(int n,String username){
            String value="";

            try{
                
                String path = "files/user.txt";
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
                            if(line.equals(username)){
                                String line1 = Files.readAllLines(Paths.get(path)).get(i-1);
                                bufferedReader.close();
                                String fullname=line1.substring("FullName:".length());
                                value=fullname;
                                
                            }
                            
                        }
                        break;

                        case 2:
                            for (int i = 0; i < check; i++) {
                                String line = Files.readAllLines(Paths.get(path)).get(i);
                                if(line.equals(username)){
                                    String line1 = Files.readAllLines(Paths.get(path)).get(i+1);
                                    bufferedReader.close();
                                    String Password=line1.substring("Password:".length());
                                    value=Password;
                                    
                                }
                                
                            } 
                            break;
                        
                        case 3:
                            for (int i = 0; i < check; i++) {
                                String line = Files.readAllLines(Paths.get(path)).get(i);
                                if(line.equals(username)){
                                    String line1 = Files.readAllLines(Paths.get(path)).get(i+2);
                                    bufferedReader.close();
                                    String Phone=line1.substring("Phone Number:".length());
                                    value=Phone;
                                    
                                }
                                
                            }
                            break;

                        case 4:
                            for (int i = 0; i < check; i++) {
                                String line = Files.readAllLines(Paths.get(path)).get(i);
                                if(line.equals(username)){
                                    String line1 = Files.readAllLines(Paths.get(path)).get(i+3);
                                    bufferedReader.close();
                                    String Question=line1.substring("Security Question is:".length());
                                    value=Question;
                                    
                                }
                                
                            }
                            break;

                            case 5:
                                for (int i = 0; i < check; i++) {
                                    String line = Files.readAllLines(Paths.get(path)).get(i);
                                    if(line.equals(username)){
                                        String line1 = Files.readAllLines(Paths.get(path)).get(i+4);
                                        bufferedReader.close();
                                        String answer=line1.substring("Answer is:".length());
                                        value=answer;
                                        
                                    }
                                    
                                }
                                break;    
                        
                }
                       
        
            } 
            catch(Exception e){
                showMessageDialog(null,e);
            }
            return value;

        }


        public void changeFirstname( JTextField test,String username,int a ){
            try {
                Path path = Paths.get("files/user.txt");
                String oldLine = "FullName:" + findDetails(a, username);
                
                if(test.getText()!=""){
                    String newLine = "FullName:" + test.getText();
                    String fileContent = new String(Files.readAllBytes(path));
                    fileContent = fileContent.replaceAll(oldLine, newLine);
                    Files.write(path, fileContent.getBytes(), StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);
                
                }
                
                
                
            } catch (IOException ex) {
                ex.printStackTrace();
            } 

        }

        public void changePassword( JPasswordField test,String username,int a ){
            try {
                Path path = Paths.get("files/user.txt");
                String oldLine = "Password:" + findDetails(a, username);
                
                
                    String newLine = "Password:" + new String(test.getPassword());
                    String fileContent = new String(Files.readAllBytes(path));
                    fileContent = fileContent.replaceAll(oldLine, newLine);
                    Files.write(path, fileContent.getBytes(), StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);
                
                
                
                
                
            } catch (IOException ex) {
                ex.printStackTrace();
            } 

        }

        public void changePhone( JTextField test,String username,int a ){
            try {
                Path path = Paths.get("files/user.txt");
                String oldLine = "Phone Number:\\" + findDetails(a, username);
                
                
                    String newLine = "Phone Number:" + test.getText();
                    System.out.println(newLine);
                    String fileContent = new String(Files.readAllBytes(path));
                    fileContent = fileContent.replaceAll(oldLine, newLine);
                    Files.write(path, fileContent.getBytes(), StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);
                
                } catch (IOException ex) {
                        ex.printStackTrace();
                  } 

        }

    }