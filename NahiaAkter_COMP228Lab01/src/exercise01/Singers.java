package exercise01;

public class Singers {
	//instance variables
	int singerID;
	String singerName;
	String singerAddress;
	String singerDOB;
	int albumNumber;
	
	//constructors
	Singers()
	{
		
	}
	
	Singers(int ID)
	{ 
		this.singerID = ID;
	}
	
	Singers(int ID, String Name)
	{
		this.singerID = ID;
		this.singerName = Name;
	}
	
	Singers(int ID, String Name, String Address)
	{
		this.singerID = ID;
		this.singerName = Name;
		this.singerAddress = Address;
	}
	Singers(int ID, String Name, String Address, String DOB)
	{
		this.singerID = ID;
		this.singerName = Name;
		this.singerAddress = Address;
		this.singerDOB = DOB;
	}
	Singers(int ID, String Name, String Address, String DOB, int albumNumber)
	{
		this.singerID = ID;
		this.singerName = Name;
		this.singerAddress = Address;
		this.singerDOB = DOB;
		this.albumNumber = albumNumber;
	}
	
	//setters
	
	public void setSingerID(int newID)
	{
		singerID = newID;
	}
	public void setSingerName(String newName)
	{
		singerName = newName;
	}
	public void setSingerAddress(String newAddress)
	{
		singerAddress = newAddress;
	}
	public void setSingerDOB(String newDOB)
	{
		singerDOB = newDOB;
	}
	public void setSingerAlbumNumber(int newAlbumNumber)
	{
		albumNumber = newAlbumNumber;
	}
	
	//getters
	
	public int getSingerID()
	{
		return singerID;
	}
	public String getSingerName()
	{
		return singerName;
	}
	public String getSingerAddress()
	{
		return singerAddress;
	}
	public String getSingerDOB()
	{
		return singerDOB;
	}
	public int getSingerAlbumNumber()
	{
		return albumNumber;
	}
		
}