package ProjDevicesPlayer1;

public class AppMusicPlayer {

	public static void main(String[] args) {
		CdPlayer cd = new CdPlayer();
		cd.open();
		cd.close();
		cd.setCdTitle("Wild Planet");
		cd.setSinger("B-52's");
		cd.setTracksTotal(10);
		cd.play();		
		cd.setFastForward(3);
		cd.play();
		cd.setRewind(2);
		cd.play();
		cd.pause();
		cd.play();
		cd.stop();
		cd.eject();
		
		
		
		
		
		
	}

}
