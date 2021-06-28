package hit.day20;

public class UniversalRemoteControl {
	public static void main(String[] args){
		
	Tv tv=new Tv();
	SetTopBox set = new SetTopBox();
	NetFlix net = new NetFlix();
	SoundSystem sound = new SoundSystem();
	
	
	Command father=new FatherNewsChannelCommand( tv ,  set, net, sound);
	Command mo= new MotherOldMovie(tv ,  set, net, sound); 
    Command ms = new MotherSerialCommand(tv ,  set,net, sound);
	
	Remote universalremote=new Remote();
	
	universalremote.setCommand(father,1);
	universalremote.setCommand(mo,2);
	universalremote.setCommand(ms,3);
	
	universalremote.executeCommand(3);
	
}
}
class Tv{
	public void av1() {
		System.out.println("tv switched to av1 mode....");
	}
	public void switchon() {
		System.out.println("tv switched ON.....");
	}
}
class SetTopBox{
	public void Newschannel() {
		System.out.println("news channel started");
	}
	public void serialchannel() {
		System.out.println("serial channel started");
	}
}
class NetFlix{
	public void oldmovie() {
		System.out.println("old movie started");
	}
}
class SoundSystem{
	public void lowsound() {
		System.out.println("sound volume decreased");
		
	}
	
}
interface Command{
	public void execute();
}
class FatherNewsChannelCommand implements Command{
	Tv tv;SetTopBox set;NetFlix net;SoundSystem sound;
	public FatherNewsChannelCommand(Tv tv , SetTopBox set,NetFlix net,SoundSystem sound) {
		
		this.tv=tv;
		this.set=set;
		this.net=net;
		this.sound=sound;
	}
	public void execute() {
		System.out.println("Father Tv action started");
		tv.switchon();
		tv.av1();
		set.Newschannel();
		sound.lowsound();
		System.out.println("...Dad enjoy your news channel..");
		
	}
}
	class MotherOldMovie implements Command{
		Tv tv;SetTopBox set;NetFlix net;SoundSystem sound;
		public MotherOldMovie(Tv tv , SetTopBox set,NetFlix net,SoundSystem sound) {
			
			this.tv=tv;
			this.set=set;
			this.net=net;
			this.sound=sound;
		}
		public void execute() {
			System.out.println("Mother Tv action started");
			tv.switchon();
			tv.av1();
			net.oldmovie();
			sound.lowsound();
			System.out.println("...MOm enjoy your old movie in netflix..");
		}
	}
	class MotherSerialCommand implements Command{
		
		Tv tv;SetTopBox set;NetFlix net;SoundSystem sound;
		public MotherSerialCommand(Tv tv , SetTopBox set,NetFlix net,SoundSystem sound) {
			
			this.tv=tv;
			this.set=set;
			this.net=net;
			this.sound=sound;
		}
		public void execute() {
			System.out.println("Mother Tv action started");
			tv.switchon();
			tv.av1();
			set.serialchannel();
			System.out.println("...Mom enjoy your serial channel..");
	}
	}
		
	class DummyCommand implements Command{
		public void execute(){
			System.out.println("I am a dummy button");
			
		}
	}
		
    class Remote{
			
			Command command[]=new Command[5];
			public Remote() {
				for(int i=0;i<command.length;i++) {
					command[i]=new DummyCommand();
				}
			}
			public void setCommand(Command command,int slot) {
				this.command[slot]=command;
			}
			public void executeCommand(int slot) {
				command[slot].execute();
			}
    }
