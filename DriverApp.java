package assg2;

public class DriverApp {

	public static void main(String[] args) {
		int arr[]= {100,50,70,60};
		int k=4;
		Ipl i=new Ipl();
		int maxTeamsPossible=i.countOfTeams(arr,k);
		System.out.println("Maximum Teams Possible "+ maxTeamsPossible);
	}

}
