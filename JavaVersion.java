public class JavaVersion {
public static void main(String[] args) {
        String version = System.getProperty("java.version");
        String vendor = System.getProperty("java.vendor");
        String path = System.getProperty("java.home");
        String url = System.getProperty("java.vendor.url");

        if (version != null && vendor != null && path != null && url != null) {
            System.out.println("Java is installed.");
            System.out.println("Version: " + version);
            System.out.println("Vendor: " + vendor);
            System.out.println("Installation Path: " + path);
            System.out.println("Vendor URL: " + url);
        } else {
            System.out.println("Java is not installed or information is unavailable.");
}
}
}