public class Lecturer extends ResearchAssociate {

    public Lecturer(int ssNo, String name, String email, String fieldOfStudy) {
        super(ssNo, name, email, fieldOfStudy);
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