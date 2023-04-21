package ss16_io_text_file.bai_tap.copy_file_text;

import java.util.List;

public class CopyFileText {
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> a = readAndWriteFile.readFile(readAndWriteFile.sourceFile);
        readAndWriteFile.writeFile(readAndWriteFile.targetFile, a);
    }
}
