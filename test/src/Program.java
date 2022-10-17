import java.io.File;

public class Program {

    public static void main(String... args) throws InterruptedException {
        checkOnExistFile();
    }

    static void checkOnExistFile() throws InterruptedException {
        String path = "D:\\file.xml";
        String userHomeDir = System.getProperty("user.home");
        System.out.println(userHomeDir);
        Boolean isFilesDownloaded = false;

        while(!isFilesDownloaded) {
            File f = new File(path);
            if(f.exists() && !f.isDirectory()) {
                System.out.println("s-a gasit");
                isFilesDownloaded = true;
            } else {
                System.out.println("fisierul nu exista");
                Thread.sleep(2000);
            }
        }
    }

}
