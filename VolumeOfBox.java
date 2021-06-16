package hit.lab2;

public class VolumeOfBox {

	public static void main(String[] args) {
		VolumeOfBox s = new VolumeOfBox();
		
		s.box(12,5,6);
		
	}
		


		
		
		
		void box(float length,float width,float height) {
			
			double  volume = length*width*height;
			
			
			System.out.println("Volume of box is :" +volume);
		}
}