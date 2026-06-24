package Microsoft.Springfirst;

public class MovieService {
	Movie movie;
	
	// Dependency injection of object model using setter method 
//	public void setMovie(Movie MovieObj) {
//		this.movie=MovieObj;
//	}
	
	// Constructor injection of object model
	MovieService(Movie MovieObj){
		this.movie=MovieObj;
	}
	
	public void displayMovie() {
		movie.display();
	}
}
