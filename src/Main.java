import java.io.File;

public class Main {
    public static void main(String[] args) {
        String path = "E:\\code gym\\module 2\\BT-doc-file-csv\\src\\danhsachcacquocgia.csv";
        File file = new File(path);
        ReadFileCSV.readCSV(file);
    }
}
