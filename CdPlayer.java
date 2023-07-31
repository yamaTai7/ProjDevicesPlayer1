package ProjDevicesPlayer1;

public class CdPlayer extends Device{
	     private String cdTitle;
	     private String singer;
	     
	     
	     public CdPlayer () {
	    	 
	     }
	     
	     
	     


		
			
 	public CdPlayer(boolean play, boolean pause, boolean stop, boolean open, boolean close, int tracksTotal,
				int rewind, int fastForward, int currentTrack,String cdTitle ,String singer) {
			super(play, pause, stop, open, close, false, tracksTotal, rewind, fastForward, currentTrack);
			this.cdTitle= cdTitle;
			this.singer= singer;




		}


		public String getCdTitle() {
			return cdTitle;
		}


		public void setCdTitle(String cdTitle) {
			this.cdTitle = cdTitle;
			System.out.println("CD: "+ cdTitle);
		}


		public String getSinger() {
			return singer;
		}


		public void setSinger(String singer) {
			this.singer = singer;
			System.out.println("Singer: "+ singer);
		}




		@Override
		public String toString() {
			return "CdPlayer [cdTitle=" + cdTitle + ", singer=" + singer + ", isPlay()=" + isPlay() + ", isPause()="
					+ isPause() + ", isStop()=" + isStop() + ", isOpen()=" + isOpen() + ", isClose()=" + isClose()
					+ ", getcurrentTrack()=" +getCurrentTrack() + ", getTracksTotal()=" + getTracksTotal()
					+ ", getRewind()=" + getRewind() + ", getFastForward()=" + getFastForward() + ", toString()="
					+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
		}


    
		
		
	   
    
	}


