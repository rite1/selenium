import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PrallelTest {

	
	
	@BeforeMethod(groups={"regression"})
	public void before()
	{
		System.out.println("Before Test");
	}
	@Test(groups={"regression"})
	public void thread1()
	{
		System.out.println("thread1");
		System.out.println("Thread Id "+Thread.currentThread().getId());
		

	}
	@Test(groups={"regression"})
	public void thread2()
	{
		System.out.println("thread2");
		System.out.println("Thread Id"+Thread.currentThread().getId());
		

	}
	@Test(groups={"sanity"})
	public void thread3()
	{
		System.out.println("thread3");
		System.out.println("Thread Id "+Thread.currentThread().getId());
		

	}
	@AfterMethod(groups={"sanity"})
	public void after()
	{
		System.out.println("After Test");
	}

}
