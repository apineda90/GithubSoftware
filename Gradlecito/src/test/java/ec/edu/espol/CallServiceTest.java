package ec.edu.espol;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.junit.Assert;

//import junit.framework.Assert;

public class CallServiceTest {

CallService calService;
	
@Before
public void setup(){
	
	ICalculator cal=Mockito.mock(ICalculator.class);
	Mockito.when(cal.add(3,3)).thenReturn(6); //cuando sucede esto con el mock haga esto
	calService=new CallService();
	calService.setCal(cal);
	
}

@Test
	public void testAddTwoNumbers(){
	Assert.assertEquals(6, calService.AddTwoNumbers(3, 3));
	
	}
}
