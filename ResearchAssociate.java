public class ResearchAssociate extends Employee {

	public String fieldOfStudy;

	public ResearchAssociate(int ssNo, String name, String email, String fieldOfStudy) {
		super(ssNo, name, email);
		this.fieldOfStudy = fieldOfStudy;
	}
}