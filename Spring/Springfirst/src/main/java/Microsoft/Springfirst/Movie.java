package Microsoft.Springfirst;

public class Movie {
	String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public void display() {
		System.out.println("Movie title is :"+title);
	}

}
