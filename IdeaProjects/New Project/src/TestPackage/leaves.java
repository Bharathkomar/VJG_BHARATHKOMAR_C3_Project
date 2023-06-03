package TestPackage;

public interface leaves {
    public static final double minimumLeavesApplied = 0.5;
    float applyLeave(float sickLeaves, float casualLeaves);

    int checkTotalLeaves();
    String leaveValidity();
}
