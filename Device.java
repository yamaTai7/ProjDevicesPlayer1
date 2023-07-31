package ProjDevicesPlayer1;

public abstract class Device implements PlayerActions{
	private boolean play;
	private boolean pause;
	private boolean stop;
	private boolean open;
	private boolean close;
	private boolean eject;
	private int tracksTotal;
	private int rewind;
	private int fastForward;
	private int currentTrack;
	
	
	public Device() {
		
	}
	


	public Device(boolean play, boolean pause, boolean stop, boolean open, boolean close, boolean eject,
			int tracksTotal, int rewind, int fastForward, int currentTrack) {
		super();
		this.play = play;
		this.pause = pause;
		this.stop = stop;
		this.open = open;
		this.close = close;
		this.setEject(eject);
		this.tracksTotal = tracksTotal;
		this.rewind = rewind;
		this.fastForward = fastForward;
		this.currentTrack = currentTrack;
	}








	@Override
	public void play() {
		if (true) {
		}  if (currentTrack==0) {
			currentTrack = currentTrack+1 ;
			System.out.println("Playing track "+ currentTrack);
		} else {
			System.out.println("Playing track "+ currentTrack);
		}
		
	}


	@Override
	public void pause() {
		if (true) {
		System.out.println("Pause music.Waiting...");
		}
	}


	@Override
	public void rewind() {
		
		System.out.println("Back to track "+ rewind);
		
	}

	@Override
	public  void fastForward() {
		System.out.println("Go forward to track "+ fastForward);
	}


	@Override
	public void stop() {
		if (true) {
		System.out.println("Stop the music!");
		}
	}


	@Override
	public void open() {
		if (true) {
			System.out.println("Open up, insert the disc please!");
			}
		
	}


	@Override
	public void close() {
		if (true) {
			System.out.println("Closing ...");
			}
		
	}
	
	
	
	


	@Override
	public void eject() {
		if (true) {
			System.out.println("Ejecting... Take out the disc.");
			}
	}








	@Override
	public void currentTrack() {		
		System.out.println("Now playing "+currentTrack);
	
		
		
	}


	@Override
	public void tracksTotal() {
		System.out.println("Total of tracks: "+ tracksTotal);
		
	}


	public boolean isPlay() {
		return play;
	}


	public void setPlay(boolean play) {
		this.play = play;
		if (true) {
			if(currentTrack ==0);
			System.out.println("Now playing  track 1");
			
		
		}
		
	}


	public boolean isPause() {
		return pause;
	}


	public void setPause(boolean pause) {
		this.pause = pause;
	}


	public boolean isStop() {
		return stop;
	}


	public void setStop(boolean stop) {
		this.stop = stop;
	}


	public boolean isOpen() {
		return open;
	}


	public void setOpen(boolean open) {
		this.open = open;
	}


	public boolean isClose() {
			return close;
			
		}
		
	


	public void setClose(boolean close) {
		this.close = close;
	}


	public int getTracksTotal() {
		return tracksTotal;
	}


	public void setTracksTotal(int tracksTotal) {
		this.tracksTotal = tracksTotal;
		System.out.println("Total of tracks "+ tracksTotal);
	}


	public int getRewind() {
		return rewind;
	}


	public void setRewind(int rewind) {
		this.rewind = rewind;
		System.out.println("Back to track "+ rewind);
		this.currentTrack=this.rewind;
		
	}


	public int getFastForward() {
		return fastForward;
	}


	public void setFastForward(int fastForward) {
		this.fastForward = fastForward;
		System.out.println("Go forward to track "+ fastForward);
		this.currentTrack=this.fastForward;
	}
	


	public int getCurrentTrack() {
		return currentTrack;
	}


	public void setCurrentTrack(int currentTrack) {
		this.currentTrack = currentTrack;
		System.out.println("Now you listenning to track "+ currentTrack);
	}








	public boolean isEject() {
		return eject;
	}








	public void setEject(boolean eject) {
		this.eject = eject;
	}
	
	
}

	
	
	
	
	
	



	