public class AdministrativeEmployee extends Employee {
    public AdministrativeEmployee(int ssNo, String name, String email) {
        super(ssNo, name, email);
    }

    @Override
    public int getSsNo() {
        return super.getSsNo();
    }

    @Override
    public void setSsNo(int ssNo) {
        super.setSsNo(ssNo);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email);
    }
}