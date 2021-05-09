import java.io.File;

public class JavaGetAllFileFromDirectories {
    public static void main(String args[]){
        System.out.println("Reading File Name from Directory");
        File file=new File("E:\\Intellij_Edu\\HelloWorld\\src");
        String[] filelist=file.list();

        for (String filename:filelist){
            File file1=new File("E:\\Intellij_Edu\\HelloWorld\\src\\"+filename);
            System.out.println("File Name : "+file1.getName()+" Size : "+file1.length()+" Path : "+file1.getAbsolutePath());

        }
    }
}