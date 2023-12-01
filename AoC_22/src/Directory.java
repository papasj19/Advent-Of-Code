public class Directory {

    private String name;
    private int size;
    private Directory[] directoriesWithin;
    private boolean isFile;
    private boolean isMain;

    public Directory(String name) {
        this.name = name;
    }

    public Directory(String name, int size, Directory[] directoriesWithin, boolean isFile, boolean isMain) {
        this.name = name;
        this.size = size;
        this.directoriesWithin = directoriesWithin;
        this.isFile = isFile;
        this.isMain = isMain;
    }

    public Directory(String name, int size, Directory[] directoriesWithin, boolean isFile) {
        this.name = name;
        this.size = size;
        this.directoriesWithin = directoriesWithin;
        this.isFile = isFile;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFile(boolean file) {
        isFile = file;
    }

    public String getName() {
        return name;
    }

    public boolean isFile() {
        return isFile;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setDirectoriesWithin(Directory[] directoriesWithin) {
        this.directoriesWithin = directoriesWithin;
    }

    public int getSize() {
        return size;
    }

    public Directory[] getDirectoriesWithin() {
        return directoriesWithin;
    }
}
