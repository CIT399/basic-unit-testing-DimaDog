import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
class ICE2Test {

	@Test
	void test1() {
		assertEquals("(570)622-1234", ICE2.format("5706221234") );
	}
	
	@Test
	void test2() {
		assertEquals("570622540", ICE2.format("570622540") );
	}
	
	@Test
	void test3() {
		assertEquals("0", ICE2.format("0") );
	}
	

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void test4() throws NullPointerException {

          thrown.expect(NullPointerException.class);
          ICE2.format(null);

     }
   

	    

	}
	
	


