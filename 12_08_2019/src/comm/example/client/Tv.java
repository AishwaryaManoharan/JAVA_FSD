package comm.example.client;

public class Tv {
	private String tvname;

	public String getTvname() {
		return tvname;
	}






	public void setTvname(String tvname) {
		this.tvname = tvname;
	}






	protected String getDetails()
	{
		return "Tv"+tvname;
	}
}
