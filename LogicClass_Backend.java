
public class LogicClass_Backend 
{
	//step 3 and step 4 here	
	//Properties
	 private String sentence;
	 private int length;
	 private int width;
	
	//Constructor
	 public LogicClass_Backend(String s)
	 {
		 sentence = s;
	 }
	 
	 public LogicClass_Backend(int l, int w)
	 {
		 length = l;
		 width = w;
	 }
	
	 //step 6
	//Method
	 
	 public String get_String()
	 {
		 return sentence;
	 }
	 
	 public String to_Upper()
	 {
		return sentence.toUpperCase(); 
	 }
	 
	 public String to_Lower()
	 {
		return sentence.toLowerCase(); 
	 }
	 
	 public int Area()
	 {
		return length * width; 
	 }
	 
	 public int Perimeter()
	 {
		return ((length * 2) + (width * 2)); 
	 }
}
