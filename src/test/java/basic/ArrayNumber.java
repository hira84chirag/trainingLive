package basic;
import java.util.Arrays;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ArrayNumber {
	WebDriver driver;
	@Test
	public  void ArrayResult() throws InterruptedException {
		// TODO Auto-generated method stub
			
				int[] numbers = {4, 3, 0, 8, 0, 0, 2};		        
		     //   moveZerosToEnd(numbers);
		        int index = 0;
		        // Move non-zero elements forward
		        for (int num : numbers) {
		            if (num != 0) {
		            	numbers[index++] = num;	                
		                System.out.println(num);
		            }
		        }

		        // here index will get it to work on it to generate.
		        
		        while (index < numbers.length) {
		        	numbers[index++] = 0; 		        	
				}
		        
		        System.out.println(Arrays.toString(numbers)); // Output: [4, 3, 8, 2, 0, 0, 0]
		        
		        
		        ChromeDriver obj=new ChromeDriver();

		        obj.get("http://www.google.com");
		        obj.manage().window().maximize();

		        String str= obj.findElement(By.partialLinkText("हिन्दी")).getText();
		        System.out.println(str);
		        String path="//textarea[@title='Search']";
		       WebElement searchbox= obj.findElement(By.xpath(path));
		        searchbox.sendKeys(str);
		        Thread.sleep(500);
		        searchbox.sendKeys(Keys.ENTER); 
		        Thread.sleep(3000);
		        obj.quit();	
	}

	
	
	 public static void moveZerosToEnd(int[] arr) {
	        int index = 0; // Pointer for placing non-zero elements

	        // Move non-zero elements forward
	        for (int num : arr) {
	            if (num != 0) {
	                arr[index++] = num;	                
	             //   System.out.println(num);
	            }
	        }

			
			  // Fill the remaining positions with zeros 
	        while (index < arr.length) {
			  arr[index++] = 0; 
			  } 
	 }	 
}