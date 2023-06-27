import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入待转换文件路径");
        String filePath = sc.nextLine();
        System.out.println("请输入目标输出路径");
        String outPath = sc.nextLine();
        try {
            PdfUtil.pdf2Image(filePath, PdfUtil.DEFAULT_DPI, outPath);
        } catch (AssertionError error) {
            System.out.println(error.getMessage());
        }
        System.out.println("输入任意键结束");
        sc.nextLine();
    }
}
