package TestPackage;

public interface compOffs {
    final int minimumCompOffsForRequest =1; //default public static

    int applyCompOffs(int compOffsRequested);
    String compOffValidity();
}
