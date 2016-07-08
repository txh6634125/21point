package bean;

public class Player {
	private int playerid;
	private String playername;
	private String password;
	private int roomid;
	private int jetton;
	private int losenum;
	
	public Player(String playername, String password, int roomid, int jetton, int losenum) {
		this.playername = playername;
		this.password = password;
		this.roomid = roomid;
		this.jetton = jetton;
		this.losenum = losenum;
	}
	
	public int getPlayerid() {
		return playerid;
	}
	public void setPlayerid(int playerid) {
		this.playerid = playerid;
	}
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getRoomid() {
		return roomid;
	}
	public void setRoomid(int roomid) {
		this.roomid = roomid;
	}
	public int getJetton() {
		return jetton;
	}
	public void setJetton(int jetton) {
		this.jetton = jetton;
	}
	public int getLosenum() {
		return losenum;
	}
	public void setLosenum(int losenum) {
		this.losenum = losenum;
	}
	
	
}
