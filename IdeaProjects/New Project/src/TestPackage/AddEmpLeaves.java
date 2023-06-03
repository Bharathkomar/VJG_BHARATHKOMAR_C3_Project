package TestPackage;

class AddEmpLeaves implements compOffs, leaves {

    public int totalLeavesAvailable = 40;

    @Override
    public float applyLeave(float sickLeaves, float casualLeaves)  {
        float totalLeaves = sickLeaves + casualLeaves;
        if ((sickLeaves < minimumLeavesApplied || casualLeaves < minimumLeavesApplied)
                && (totalLeaves > totalLeavesAvailable))
            return 0;
        else
            return totalLeaves;
    }

    @Override
    public int checkTotalLeaves() {
        return  totalLeavesAvailable;
    }

    @Override
    public String leaveValidity()  {
        String leaveValidDetails = "leaves are valid for one year.";
        return leaveValidDetails;
    }

    @Override
    public int applyCompOffs(int compOffsRequested)  {
        if((compOffsRequested < minimumCompOffsForRequest) && (compOffsRequested > 10) )
            return 0;
        else
        return compOffsRequested;
    }


    @Override
    public String compOffValidity()  {
        String compOffValidDetails = "Compensatory offs are valid for one year.";
        return compOffValidDetails;
    }

}