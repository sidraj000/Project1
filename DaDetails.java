public class DaDetails {
    public String desCode;
    public String designation;
    public int da;

    public DaDetails(String desCode, String designation, int da) {
        this.desCode = desCode;
        this.designation = designation;
        this.da = da;
    }

    public String getDesCode() {
        return desCode;
    }

    public void setDesCode(String desCode) {
        this.desCode = desCode;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getDa() {
        return da;
    }

    public void setDa(int da) {
        this.da = da;
    }
}