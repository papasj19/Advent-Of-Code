public class DirectoryManager {

    private Directory[] currentDirectories;
    private static String[] initialInfo;

    public DirectoryManager(String[] initialInfo) {
        this.initialInfo = initialInfo;
        processInfo();
    }

    public static void processInfo(){
        String info[] = initialInfo[0].split("-");
        new Directory(info[1]);
    }
}
