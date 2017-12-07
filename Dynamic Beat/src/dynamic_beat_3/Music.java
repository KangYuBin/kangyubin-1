package dynamic_beat_3;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import javazoom.jl.player.Player;

public class Music extends Thread{

	private Player player;
	private boolean isLoop;		//현재 곡이 무한반복인지, 한번만 재생인지 알려줌
	private File file;
	private FileInputStream fis;
	private BufferedInputStream bis;
	
	public Music(String name, boolean isLoop) {
		try {
			this.isLoop=isLoop;
			file=new File(Main.class.getResource("../music/"+name).toURI());
			fis=new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			player = new Player(bis);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	public int getTime() {
		if(player ==null)
			return 0;
		return player.getPosition();
		}
	
	//음악이 어디선 실행하든 항상 종료할 수 있게해주는 함수
	public void close() {
		isLoop=false;
		player.close();
		this.interrupt();
	}
	
	@Override 	//만약 isLoop가 true값을 가진다면, 해당 곡은 무한반복 실행
	public void run() {
		try {
			do {
				player.play();	//곡 실행
				fis=new FileInputStream(file);
				bis = new BufferedInputStream(fis);
				player = new Player(bis);
			}while(isLoop);	//isLoopdml 값이 참이면,
		}
	catch(Exception e){
		System.out.println(e.getMessage());

		}	
	}
}

