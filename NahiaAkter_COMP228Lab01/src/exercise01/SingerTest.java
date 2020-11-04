package exercise01;

public class SingerTest {

	public static void main(String[] args) {
		
		Singers singer1 = new Singers();
		
		singer1.singerID = 111;
		singer1.singerName = "AlkaYagnik";
		singer1.singerAddress = "India";
		singer1.singerDOB = "Mar1966";
		singer1.albumNumber = 1000;
		
		System.out.println("ID of singer1: " + singer1.singerID);
		System.out.println("Name of singer1: "+ singer1.singerName);
		System.out.println("Address of singer1: "+ singer1.singerAddress);
		System.out.println("Date of birth of singer1: "+ singer1.singerDOB);
		System.out.println("No. of Albums of singer1: "+ singer1.albumNumber);

		
		Singers singer2 = new Singers();
		
		singer2.setSingerID(222);
		singer2.setSingerName("KumarShanu");
		singer2.setSingerAddress("Kolkata");
		singer2.setSingerDOB("Oct1957");
		singer2.setSingerAlbumNumber(1200);
		
		System.out.println("\nID of singer2: "+ singer2.getSingerID());
		System.out.println("Name of singer2: "+ singer2.getSingerName());
		System.out.println("Address of singer2: "+ singer2.getSingerAddress());
		System.out.println("Date of birth of singer2: "+ singer2.getSingerDOB());
		System.out.println("No. of Albums of singer2: "+ singer2.getSingerAlbumNumber());

					
	}

}

